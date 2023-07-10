package com.example.finalprojecthotelsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Choose_2_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose2);

        //        ArrayAdapter<Drink> listArrayAdapter = new ArrayAdapter<Drink>(this, android.R.layout.simple_list_item_1,Hotel.hotels);


        ListView city_list = (ListView) findViewById(R.id.city_list);
//        hotel_list.setAdapter(listArrayAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
//                intent.putExtra();
                startActivity(intent);


            }
        };
        city_list.setOnItemClickListener(itemClickListener);

    }
}