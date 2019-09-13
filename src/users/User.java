package users;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {

    private int id;
    private String username;
    private LocalDate birthdate;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public User(int id, String name, String birthdate) {
        this.id = id;
        this.username = name;
        this.birthdate=LocalDate.parse(birthdate,FORMATTER);
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

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + username + " Birthday: " + birthdate.format(FORMATTER);
    }

}
