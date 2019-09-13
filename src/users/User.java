package users;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {

    private int id;
    private String username;
    private LocalDate birthdate, registrationDate;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    public User(int id, String name, String birthdate) {
        this.id = id;
        this.username = name;
        this.birthdate = LocalDate.parse(birthdate, FORMATTER);
        this.registrationDate=LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthday(LocalDate date) {

        this.birthdate = date;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    

    @Override
    public String toString() {
        return "\nID: " + id + " Name: " + username 
                + "\nBirthday: " + birthdate.format(FORMATTER)
                +"\nRegistration date: "+ registrationDate.format(FORMATTER);
    }

}
