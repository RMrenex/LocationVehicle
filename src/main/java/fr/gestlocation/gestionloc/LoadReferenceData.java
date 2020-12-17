package fr.gestlocation.gestionloc;

import fr.gestlocation.gestionloc.bean.Car;
import fr.gestlocation.gestionloc.bean.History;
import fr.gestlocation.gestionloc.bean.Location;
import fr.gestlocation.gestionloc.utils.State;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class LoadReferenceData implements ServletContextListener {

    private final List<Car> carList = new ArrayList<>();

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        initCar();
        sce.getServletContext().setAttribute("carList", carList);

    }

    /**
     * initialize lot of car
     */
    public void initCar(){

        Car car = new Car("1111-AA-11", "Rouge", "Peugeot", 5, 600);
        car.setState(State.REPAIR);
        car.setCurrentlybreakdown("Vitre cassé");

        Car car2 = new Car("2222-AA-22", "Bleu", "Peugeot", 3, 200);
        car2.setState(State.REPAIR);
        car2.setCurrentlybreakdown("Boite de vitesse cassé");

        Car car3 = new Car("3333-AA-33", "Vert", "Mercedes", 5, 300);
        Car car4 = new Car("4444-AA-44","Jaune", "Peugeot", 3, 450);
        Car car5 = new Car("5555-AA-55", "Noir", "Citroen", 5, 200);
        Car car6 = new Car("6666-AA-66", "Blanc", "Renault", 5, 200);
        car6.setState(State.LOCATION);
        Car car7 = new Car("7777-AA-77", "Blanc", "Mini-cooper", 5, 460);
        car7.setState(State.LOCATION);

        History history = new History("10/12/2020", "11/12/2020", "Pneu crevé");
        car5.getHistories().add(history);

        History history2 = new History("09/01/2020", "09/15/2020", "Vitre cassé");
        car4.getHistories().add(history2);

        Location location = new Location("Dupont", "Marie", "10/12/2020", "11/07/2020");
        car6.getLocations().add(location);

        Location location2 = new Location("Legrand", "Leo", "01/12/2020", "15/01/2020");
        car7.getLocations().add(location2);

        Location location3 = new Location("Petit", "Jean", "01/12/2020", "15/09/2020");
        car3.getLocations().add(location3);

        Location location4 = new Location("Duc", "Pierre", "10/12/2019", "10/25/2019");
        car6.getLocations().add(location4);

        carList.add(car);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
    }
}
