package fr.gestlocation.gestionloc.bean;

import fr.gestlocation.gestionloc.RoleType;

public class User {

    private String firstname;
    private String lastname;
    private String adress;
    private String DateofBirth;
    private String phoneNumber;
    private String email;
    private String password;
    private RoleType roleType;

    public User(String firstname, String lastname, String adress, String dateofBirth, String phoneNumber, String email, String password, RoleType roleType) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        DateofBirth = dateofBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.roleType = roleType;
    }

    public User() {
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAdress() {
        return adress;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public RoleType getRoleType() {
        return roleType;
    }
}
