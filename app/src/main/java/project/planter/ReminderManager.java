package project.planter;

import java.io.Serializable;
import java.util.ArrayList;

public class ReminderManager implements Serializable {
    private ArrayList<Reminder> reminders;

    ReminderManager() {
        this.reminders = new ArrayList<>();
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

    public void dupliateReminder(Reminder reminder) {
        Plant p = reminder.getPlant();
        String t = reminder.getTime();
        int i = reminder.getPictureId();
        Reminder newReminder = new Reminder(p, t, i);
        reminders.add(newReminder);
    }


}
