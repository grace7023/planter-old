package project.planter;

import java.util.ArrayList;

public class User {
    String username;
    String email;
    String password;
    ArrayList<Reminder> reminders;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        reminders = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Reminder> getReminders() {
        return reminders;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setReminders(ArrayList<Reminder> reminders) {
        this.reminders = reminders;
    }
}
