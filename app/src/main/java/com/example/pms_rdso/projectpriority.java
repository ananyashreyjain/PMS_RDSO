package com.example.pms_rdso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class projectpriority extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projectpriority);


        // Find the View that shows the High Priority category
        TextView high_priority = (TextView) findViewById(R.id.high_priority);

        // Set a click listener on that View
        high_priority.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the High Priority category is clicked on.
        @Override
        public void onClick(View view) {
        // Create a new intent to open the {@link NumbersActivity}
            Intent highIntent = new Intent(projectpriority.this, highpriority.class);
            // Start the new activity
            startActivity(highIntent);
        }
        });


        // Find the View that shows the Medium Priority category
        TextView medium_priority = (TextView) findViewById(R.id.medium_priority);

        // Set a click listener on that View
        medium_priority.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Medium Priority category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent mediumIntent = new Intent(projectpriority.this, mediumpriority.class);
                // Start the new activity
                startActivity(mediumIntent);
            }
        });


        // Find the View that shows the Low Priority category
        TextView low_priority = (TextView) findViewById(R.id.low_priority);

        // Set a click listener on that View
        low_priority.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Low Priority category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lowIntent = new Intent(projectpriority.this, lowpriority.class);
                // Start the new activity
                startActivity(lowIntent);
            }
        });


        // Find the View that shows the No Priority category
        TextView no_priority = (TextView) findViewById(R.id.no_priority);

        // Set a click listener on that View
        no_priority.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the No Priority category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent noIntent = new Intent(projectpriority.this, nopriority.class);
                // Start the new activity
                startActivity(noIntent);
            }
        });


    }
}


