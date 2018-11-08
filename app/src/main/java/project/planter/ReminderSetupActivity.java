package project.planter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ReminderSetupActivity extends AppCompatActivity {
    private EditText plantNameField;
    private EditText timeField;
    private ImageButton createReminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remindersetup);
        createReminder = findViewById(R.id.CreateReminderButton);
    }
}
