package project.planter;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenuActivity extends AppCompatActivity {
    private ImageButton newReminderButton;
    private ReminderManager reminderManager;
//    private String currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        reminderManager = new ReminderManager();
        reminderManager = reminderManager.loadFromFile();
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
                Intent rmndStpIntent = new Intent(MainMenuActivity.this, ReminderSetupActivity.class);
                rmndStpIntent.putExtra("REMINDER_MANAGER", reminderManager);
                startActivity(rmndStpIntent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
