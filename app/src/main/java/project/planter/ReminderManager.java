package project.planter;

import java.util.ArrayList;

public class ReminderManager {
    private ArrayList<Reminder> reminders;

    ReminderManager() {
        this.reminders = new ArrayList<>();
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }

    public void deleteReminder(Reminder reminder) {
        reminders.remove(reminder);
    }


}
