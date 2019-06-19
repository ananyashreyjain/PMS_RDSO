package com.example.pms_rdso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class mediumpriority extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediumpriority);

        ArrayList<String> projects= new ArrayList<String>();

        projects.add("Project 1");
        projects.add("Project 2");
        projects.add("Project 3");
        projects.add("Project 4");
        projects.add("Project 5");
        projects.add("Project 6");
        projects.add("Project 7");
        projects.add("Project 8");
        projects.add("Project 9");
        projects.add("Project 10");

        ArrayAdapter<String> projectAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, projects);

        ListView listview = (ListView)findViewById(R.id.medium_list);

        listview.setAdapter(projectAdapter);


    }
}
