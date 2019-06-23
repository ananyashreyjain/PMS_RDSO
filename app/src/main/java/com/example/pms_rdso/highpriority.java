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

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent myintent = new Intent(view.getContext(), project_detail.class);
            startActivityForResult(myintent, 0);
        }
    });

    }
}
