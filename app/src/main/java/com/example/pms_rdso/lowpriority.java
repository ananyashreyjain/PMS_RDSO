package com.example.pms_rdso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class lowpriority extends AppCompatActivity {

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

        ProjectAdapter adapter = new ProjectAdapter(this, projects, R.color.category_low_priority);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
