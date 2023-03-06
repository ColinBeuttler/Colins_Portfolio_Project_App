package com.colinbeuttler.colinsportfolioprojectapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerList = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App","Hello World app", R.drawable.getting_started),
                new Project("Inspirational Quote","Second app after Hello world", R.drawable.quote),
                new Project("BMI Calculator","finds your BMI aka Fatness scale", R.drawable.tape),
                new Project("Calculator","Does some Maths ;)", R.drawable.calculator),
                new Project("Restaurant App","Starters, Main courses, and desserts, this place has it all hope you're hungry for this one bro!!", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        recyclerList.setAdapter(adapter);

    }
}