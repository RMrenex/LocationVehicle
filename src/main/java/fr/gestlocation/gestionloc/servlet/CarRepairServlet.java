package fr.gestlocation.gestionloc.servlet;

import fr.gestlocation.gestionloc.State;
import fr.gestlocation.gestionloc.bean.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/carRepair")
public class CarRepairServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<Car> cars = ((List<Car>) getServletContext().getAttribute("carList")).stream().filter(etat -> State.REPAIR.equals(etat.getState())).collect(Collectors.toList());

        req.setAttribute("cars", cars);

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/dashboard_mechanic.jsp").forward(req, resp);
    }

}
