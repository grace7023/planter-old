package project.planter;

import android.util.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ReminderManager implements Serializable {
    private ArrayList<Reminder> reminders;
    private final static String FILE_PATH = "/data/rMan.ser";


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

    void saveToFile() {
        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objOut = new ObjectOutputStream(outputStream);
            objOut.writeObject(this);
            objOut.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            Log.e("login activity", "Can not find file: " + e.toString());
        }
    }

    static ReminderManager loadFromFile() {
        ReminderManager reminderManager = new ReminderManager();
        try {
            InputStream inputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream input = new ObjectInputStream(inputStream);
            reminderManager = (ReminderManager) input.readObject();
            input.close();
            inputStream.close();

        } catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        } catch (ClassNotFoundException e) {
            Log.e("login activity", "File contained unexpected data type: " + e.toString());
        }
        return reminderManager;
    }

}
