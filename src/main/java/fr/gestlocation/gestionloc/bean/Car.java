package fr.gestlocation.gestionloc.bean;

import fr.gestlocation.gestionloc.utils.State;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

public class Car {

	private String matricule;
	private State state;
	private String color;
	private String brand;
	private String currentlybreakdown;
	private int doorNumber;
	private int numberOfHorses;
	private List<History> histories;
	private List<Location> locations;

	/**
	 *
	 * @param matricule
	 * @param color
	 * @param brand
	 * @param doorNumber
	 * @param numberOfHorses
	 */
	public Car(String matricule, String color, String brand, int doorNumber, int numberOfHorses) {
		this.matricule = matricule;
		this.state = State.AVALAIBLE;
		this.color = color;
		this.brand = brand;
		this.currentlybreakdown = null;
		this.doorNumber = doorNumber;
		this.numberOfHorses = numberOfHorses;
		this.histories = new ArrayList<>();
		this.locations = new ArrayList<>();
	}

	public Car() {
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCurrentlybreakdown() {
		return currentlybreakdown;
	}

	public void setCurrentlybreakdown(String currentlybreakdown) {
		this.currentlybreakdown = currentlybreakdown;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public int getNumberOfHorses() {
		return numberOfHorses;
	}

	public void setNumberOfHorses(int numberOfHorses) {
		this.numberOfHorses = numberOfHorses;
	}

	public List<History> getHistories() {
		return histories;
	}

	public List<Location> getLocations() {
		return locations;
	}


	/**
	 *
	 * @param locationList
	 * @return number rental of the location list for the current month
	 */
	public int getRentalOfTheCurrentMonth(List<Car> locationList){

		AtomicInteger iterator = new AtomicInteger();

		LocalDateTime currentDate = LocalDateTime.now();

		locationList.forEach(car -> car.getLocations().forEach(loc -> {

			if(convertSringToDate(loc.getBeginDateLocation()).getMonth().equals(currentDate.getMonth()) && convertSringToDate(loc.getBeginDateLocation()).getYear() == currentDate.getYear()){
				iterator.getAndIncrement();
			}

		}));

		return iterator.get();
	}

	/**
	 *
	 * @param locationList
	 * @return number rental of the location list for the current year
	 */
	public int getRentalOfTheCurrentYear(List<Car> locationList){

		AtomicInteger iterator = new AtomicInteger();

		LocalDateTime currentDate = LocalDateTime.now();

		locationList.forEach(car -> car.getLocations().forEach(loc -> {

			if(convertSringToDate(loc.getBeginDateLocation()).getYear() == currentDate.getYear()){
				iterator.getAndIncrement();
			}

		}));

		return iterator.get();

	}

	/**
	 *
	 * @param date
	 * @return convert String date to LocaDate
	 */
	private LocalDate convertSringToDate(String date){

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.FRANCE);
		LocalDate localDate = LocalDate.parse(date, formatter);

		return localDate;
	}
}
