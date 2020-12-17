package fr.gestlocation.gestionloc.servlet;

import fr.gestlocation.gestionloc.utils.State;
import fr.gestlocation.gestionloc.bean.Car;
import fr.gestlocation.gestionloc.bean.History;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/carRepair")
public class CarRepairServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<Car> cars = carsWaitRepair();

        List<Car> carsAlreadyRepair = carsRepaired();
        req.setAttribute("cars", cars);
        req.setAttribute("carsAlreadyRepair", carsAlreadyRepair);

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/dashboard_mechanic.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Car> cars = carsWaitRepair();

        for (Car car : cars) {

            if(car.getMatricule().equals(req.getParameter("matricule"))){
                car.getHistories().add(new History("09/10/2020",getCurrentDate(),"Vitre cassé"));
                car.setState(State.AVALAIBLE);
                cars.remove(car);
            }
        }

        List<Car> carsAlreadyRepair = carsRepaired();

        req.setAttribute("cars", cars);
        req.setAttribute("carsAlreadyRepair", carsAlreadyRepair);

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/dashboard_mechanic.jsp").forward(req, resp);
    }

    public List<Car> carsWaitRepair(){

        return ((List<Car>) getServletContext().getAttribute("carList")).stream().filter(etat -> State.REPAIR.equals(etat.getState())).collect(Collectors.toList());
    }

    public List<Car> carsRepaired(){

        List<Car> carList = ((List<Car>) getServletContext().getAttribute("carList")).stream().filter(history -> history.getHistories().size() > 0).collect(Collectors.toList());
        return carList;
    }

    private String getCurrentDate(){
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }
}
