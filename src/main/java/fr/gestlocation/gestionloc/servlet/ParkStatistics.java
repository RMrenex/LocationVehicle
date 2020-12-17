package fr.gestlocation.gestionloc.servlet;

import fr.gestlocation.gestionloc.bean.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Statistiques")
public class ParkStatistics extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("numberLocationCurrentMonth", numberOfLocationForCurrentMonth());
        req.setAttribute("numberLocationCurrentYear", numberOfLocationForCurrentYear());

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/dashboard_responsable_statistics.jsp").forward(req, resp);
    }

    /**
     *
     * @return number of location For the current month
     */
    public int numberOfLocationForCurrentMonth(){

        int numberLocation = 0;

        for (Car carList : ((List<Car>) getServletContext().getAttribute("carList"))) {

            numberLocation = carList.getRentalOfTheCurrentMonth(((List<Car>) getServletContext().getAttribute("carList")));
        }

        return numberLocation;
    }

    /**
     *
     * @return number of location for the current year
     */
    public int numberOfLocationForCurrentYear(){

        int numberLocation = 0;

        for (Car carList : ((List<Car>) getServletContext().getAttribute("carList"))) {

            numberLocation = carList.getRentalOfTheCurrentYear(((List<Car>) getServletContext().getAttribute("carList")));
        }

        return numberLocation;
    }
}
