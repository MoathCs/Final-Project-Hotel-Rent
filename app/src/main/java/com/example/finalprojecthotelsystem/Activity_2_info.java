package com.example.finalprojecthotelsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;




import static android.widget.Toast.LENGTH_SHORT;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


    public class Activity_2_info extends AppCompatActivity {

        private ArrayList<String> dataSet;

        private Button ptnStart;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_activity2_info);

            ptnStart = findViewById(R.id.ptnStart);

            RecyclerView recyclerView = findViewById(R.id.recycl);


            dataSet = new ArrayList<>();

            dataSet.add("Hello😍🥰");

            dataSet.add("This app to help students to solve quadratic and linear equations.\n" +
                    "It requires you to choose the type of equation that you want to solve," +
                    " and then put the coefficients. If you want to save this data, you have to put a check on (Do you want to save this information)" );
            dataSet.add("You can visit our official website through the following link");


            dataSet.add("Click the blue button to start");


            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            AdapterText adapter = new AdapterText(dataSet);
            recyclerView.setAdapter(adapter);


            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                    super.onScrollStateChanged(recyclerView, newState);

                    if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                        LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                        int lastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
                        int itemCount = layoutManager.getItemCount();

                        if (lastVisibleItemPosition == itemCount - 1 ) {
                            showFinishButton();
                        }
                    }
                }
            });
        }
        private void showFinishButton() {
            ptnStart.setVisibility(View.VISIBLE);
            ptnStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goTOAct();

                }
            });
        }
        private void goTOAct(){
            Intent intent = new Intent(this,Activity_LogIn.class);
            startActivity(intent);
        }

    }


