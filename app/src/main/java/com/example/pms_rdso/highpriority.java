package com.example.pms_rdso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class highpriority extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_list);

        //Create a list of projects

        ArrayList<Project> projects= new ArrayList<Project>();
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));
        projects.add(new Project("<Project name>"));

        ProjectAdapter adapter = new ProjectAdapter(this, projects, R.color.category_high_priority );

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Find the View that shows the Create New project
        TextView projectNameTextView = (TextView) findViewById(R.id.create_project_text_view);

        // Set a click listener on that View
        projectNameTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the High Priority category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent projectNameIntent = new Intent(highpriority.this, CreateNewProject.class);
                // Start the new activity
                startActivity(projectNameIntent);
            }
        });

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent myintent = new Intent(view.getContext(), project_detail.class);
            startActivityForResult(myintent, 0);
        }
    });

    }
}
