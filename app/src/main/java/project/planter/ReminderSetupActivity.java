package project.planter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ReminderSetupActivity extends AppCompatActivity {
    private EditText plantNameField;
    private EditText plantSpeciesField;
    private EditText plantFertilizerField;
    private EditText timeField;
    private EditText dateField;
    private EditText waterFreqField;
    private EditText fertFreqField;
    private ImageButton createReminder;
    private ReminderManager reminderManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remindersetup);
        createReminder = findViewById(R.id.CreateReminderButton);
        reminderManager = (ReminderManager) getIntent().getSerializableExtra("REMINDER_MANAGER");
        addCreateReminderButtonListener();
    }

    private void addCreateReminderButtonListener() {
        createReminder.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                if (!checkEmptyFields()) {
                    Reminder newReminder = returnNewReminder();
                    reminderManager.addReminder(newReminder);
                    reminderManager.saveToFile();
                    switchToMainMenu();
                } else {
                    Toast.makeText(ReminderSetupActivity.this, "Field(s) are empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void switchToMainMenu() {
        startActivity(new Intent(ReminderSetupActivity.this, MainMenuActivity.class));
        finish();
    }

    private boolean checkEmptyFields() {
        // Mandatory fields: plant name; time; water freq
        // TODO: add feature to allow certain empty fields.
        return (isEmpty(plantNameField) ||
                isEmpty(waterFreqField) ||
                isEmpty(timeField));
    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }

    private Reminder returnNewReminder() {
        String plantName = plantNameField.getText().toString();
        String species = plantSpeciesField.getText().toString();
        String fertilizer = plantFertilizerField.getText().toString();
        String time = timeField.getText().toString();
        String date = dateField.getText().toString();
        Plant p = new Plant(plantName, species, fertilizer);
        // TODO: add image picker to app
        int image = 1;
        return new Reminder(p, image, time, date);
    }

    @Override
    public void onBackPressed() {
        switchToMainMenu();
    }
}
