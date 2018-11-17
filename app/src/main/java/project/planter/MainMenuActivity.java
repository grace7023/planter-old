package project.planter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenuActivity extends AppCompatActivity {
    private ImageButton newReminderButton;
    private ReminderManager reminderManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        ReminderManager.loadFromFile();
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


}
