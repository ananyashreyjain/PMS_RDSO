package com.example.pms_rdso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class project_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_detail);

        ArrayList<String> directorates= new ArrayList<String>();
        directorates.add("<Directorate 1>");
        directorates.add("<Directorate 2>");
        directorates.add("<Directorate 3>");
        directorates.add("<Directorate 4>");

        ArrayAdapter dir_adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, directorates);

        ListView dirListView = (ListView) findViewById(R.id.directorates_list);
        dirListView.setAdapter(dir_adapter);

        ArrayList<String> supervisors= new ArrayList<String>();
        supervisors.add("<Supervisor 1>");
        supervisors.add("<Supervisor 2>");
        supervisors.add("<Supervisor 3>");
        supervisors.add("<Supervisor 4>");

        ArrayAdapter supervisor_adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, supervisors);

        ListView supListView = (ListView) findViewById(R.id.supervisors_list);
        supListView.setAdapter(supervisor_adapter);
    }
}
