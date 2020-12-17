package fr.gestlocation.gestionloc.bean;

public class Location {

    private String lastname;
    private String firstname;
    private String beginDateLocation;
    private String endDateLocation;

    /**
     *
     * @param lastname
     * @param firstname
     * @param beginDateLocation
     * @param endDateLocation
     */
    public Location(String lastname, String firstname, String beginDateLocation, String endDateLocation) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.beginDateLocation = beginDateLocation;
        this.endDateLocation = endDateLocation;
    }

    public Location() {
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getBeginDateLocation() {
        return beginDateLocation;
    }

    public void setBeginDateLocation(String beginDateLocation) {
        this.beginDateLocation = beginDateLocation;
    }

    public String getEndDateLocation() {
        return endDateLocation;
    }

    public void setEndDateLocation(String endDateLocation) {
        this.endDateLocation = endDateLocation;
    }
}
