package project.planter;

import java.util.ArrayList;

public class ReminderManager {
    private ArrayList<Reminder> reminders;

    ReminderManager() {
        reminders = new ArrayList<>();
    }

    ReminderManager(ArrayList<Reminder> reminders) {
        this.reminders = reminders;
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }

    public void deleteReminder(Reminder reminder) {
        reminders.remove(reminder);
    }


}
