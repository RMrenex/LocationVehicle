package fr.gestlocation.gestionloc.bean;

import fr.gestlocation.gestionloc.State;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private String matricule;
	private State state;
	private String color;
	private String brand;
	private int doorNumber;
	private int numberOfHorses;
	private List<History> histories;
	private List<Location> locations;

	public Car(String matricule, String color, String brand, int doorNumber, int numberOfHorses) {
		this.matricule = matricule;
		this.state = State.AVALAIBLE;
		this.color = color;
		this.brand = brand;
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
}
