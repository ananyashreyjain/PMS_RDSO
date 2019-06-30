package com.example.pms_rdso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login_basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_basic);

    }

    public void login(View view) {
        // Find the View that shows the High Priority category
        TextView login = (TextView) findViewById(R.id.login);

        // Set a click listener on that View
        login.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the High Priority category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent loginIntent = new Intent(login_basic.this, projectpriority.class);
                // Start the new activity
                internet Data=new internet();
                String log=Data.start();
                startActivity(loginIntent);
            }
        });

    }
}
