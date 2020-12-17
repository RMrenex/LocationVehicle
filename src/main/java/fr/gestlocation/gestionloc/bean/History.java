package fr.gestlocation.gestionloc.bean;

public class History {

    private String arrival_date;
    private String depart_date;
    private String breakdown;

    /**
     *
     * @param arrival_date
     * @param depart_date
     * @param breakdown
     */
    public History(String arrival_date, String depart_date, String breakdown) {
        this.arrival_date = arrival_date;
        this.depart_date = depart_date;
        this.breakdown = breakdown;
    }

    public History() {
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public String getDepart_date() {
        return depart_date;
    }

    public void setDepart_date(String depart_date) {
        this.depart_date = depart_date;
    }

    public String getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(String breakdown) {
        this.breakdown = breakdown;
    }
}
