package fr.gestlocation.gestionloc.servlet;

import fr.gestlocation.gestionloc.utils.State;
import fr.gestlocation.gestionloc.bean.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/PannelControl")
public class ManageParkServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("cars", availableCars());
        req.setAttribute("carsAlreadyRepair", historyRepair());
        req.setAttribute("carsHistoryLocation", historyLocation());

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/dashboard_reponsable.jsp").forward(req, resp);

    }

    public List<Car> availableCars(){

        return ((List<Car>) getServletContext().getAttribute("carList")).stream().filter(etat -> State.AVALAIBLE.equals(etat.getState()) || State.LOCATION.equals(etat.getState())).collect(Collectors.toList());
    }

    public List<Car> historyRepair(){

        return ((List<Car>) getServletContext().getAttribute("carList")).stream().filter(history -> history.getHistories().size() > 0).collect(Collectors.toList());
    }

    public List<Car> historyLocation(){

        return ((List<Car>) getServletContext().getAttribute("carList")).stream().filter(history -> history.getLocations().size() > 0).collect(Collectors.toList());
    }
}
