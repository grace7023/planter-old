package project.planter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainMenuActivity extends AppCompatActivity {
    private static String FILE_PATH = "/data/rMan.ser";
    private ImageButton newReminderButton;
    private ReminderManager reminderManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        newReminderButton = findViewById(R.id.NewReminderButton);
        addNewReminderButtonListener();
    }

    private void addNewReminderButtonListener() {
        newReminderButton.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuActivity.this, ReminderSetupActivity.class));
            }
        });
    }

    private void saveToFile(String filePath) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(
                    this.openFileOutput(filePath, MODE_PRIVATE));
            outputStream.writeObject(reminderManager);
            outputStream.close();
        } catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

    private void loadFromFile(String filePath) {
        try {
            InputStream inputStream = this.openFileInput(filePath);
            if (inputStream != null) {
                ObjectInputStream input = new ObjectInputStream(inputStream);
                reminderManager = (ReminderManager) input.readObject();
                inputStream.close();
            }
        } catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        } catch (ClassNotFoundException e) {
            Log.e("login activity", "File contained unexpected data type: " + e.toString());
        }
    }


}
