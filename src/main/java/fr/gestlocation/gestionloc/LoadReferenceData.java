package fr.gestlocation.gestionloc;

import fr.gestlocation.gestionloc.bean.Car;

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

    public void initCar(){

        Car car = new Car("1111-AA-11", "Rouge", "Peugeot", 5, 600);
        Car car2 = new Car("2222-AA-22", "Bleu", "Peugeot", 3, 200);
        car2.setState(State.REPAIR);
        Car car3 = new Car("3333-AA-33", "Vert", "Peugeot", 5, 300);
        Car car4 = new Car("4444-AA-44","Jaune", "Peugeot", 3, 450);
        Car car5 = new Car("5555-AA-55", "Noir", "Peugeot", 5, 200);

        carList.add(car);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }
}
