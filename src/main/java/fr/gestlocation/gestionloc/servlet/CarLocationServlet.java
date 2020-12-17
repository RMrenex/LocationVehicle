package fr.gestlocation.gestionloc.servlet;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gestlocation.gestionloc.utils.State;
import fr.gestlocation.gestionloc.bean.Car;

@WebServlet("/carLocation")
public class CarLocationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Car> Locationcars = ((List<Car>) getServletContext().getAttribute("carList")).stream()
				.filter(etat -> State.LOCATION.equals(etat.getState())).collect(Collectors.toList());

		req.setAttribute("Locationcars", Locationcars);

		List<Car> Avalaiblecars = ((List<Car>) getServletContext().getAttribute("carList")).stream()
				.filter(etat -> State.AVALAIBLE.equals(etat.getState())).collect(Collectors.toList());

		req.setAttribute("Avalaiblecars", Avalaiblecars);

		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/dashboard_gestionnaire.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Car> Locationcars = ((List<Car>) getServletContext().getAttribute("carList")).stream()
				.filter(etat -> State.LOCATION.equals(etat.getState())).collect(Collectors.toList());

		for (int i = 0; i < Locationcars.size(); i++) {
			if (Locationcars.get(i).getMatricule().equals(req.getParameter("retour"))) {
				Locationcars.get(i).setState(State.AVALAIBLE);
			}
		}

		Locationcars = ((List<Car>) getServletContext().getAttribute("carList")).stream()
				.filter(etat -> State.LOCATION.equals(etat.getState())).collect(Collectors.toList());

		List<Car> Avalaiblecars = ((List<Car>) getServletContext().getAttribute("carList")).stream()
				.filter(etat -> State.AVALAIBLE.equals(etat.getState())).collect(Collectors.toList());

		req.setAttribute("Avalaiblecars", Avalaiblecars);

		if (req.getParameter("color") != null) {
			Avalaiblecars = Avalaiblecars.stream().filter(color -> color.getColor().equals(req.getParameter("color")))
					.collect(Collectors.toList());
		}
		if (req.getParameter("brand") != null) {
			Avalaiblecars = Avalaiblecars.stream().filter(brand -> brand.getBrand().equals(req.getParameter("brand")))
					.collect(Collectors.toList());
		}

		req.setAttribute("Avalaiblecars", Avalaiblecars);
		req.setAttribute("Locationcars", Locationcars);

		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/dashboard_gestionnaire.jsp").forward(req, resp);
	}

}
