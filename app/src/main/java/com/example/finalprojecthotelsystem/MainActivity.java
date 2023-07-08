package com.example.finalprojecthotelsystem;




import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1;


    private Animation animation;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.toptext);
        animation= AnimationUtils.loadAnimation(this,R.anim.anmi);
        text1.setAnimation(animation);

        runHand();
    }
    private void ActTow(){
        Intent intent = new Intent(this,Activity_2_info.class);
        startActivity(intent);
    }
    private void runHand(){
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                ActTow();
            }


        };
        handler.postDelayed(runnable,3000);
    }


}