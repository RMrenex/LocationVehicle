package fr.gestlocation.gestionloc;

public enum State {

    AVALAIBLE("Disponible"), LOCATION("En location"), REPAIR("En réparation");

    public String state;

    State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return state;
    }
}
