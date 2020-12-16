package fr.gestlocation.gestionloc;

public enum RoleType {

ADMINISTRATOR("Responsable"), MECHANIC("Mécanicien"), MANAGER("Gestionnaire");

    private String role;

    RoleType(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return role;
    }
}
