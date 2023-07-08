package com.example.finalprojecthotelsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


    public class Activity_LogIn extends AppCompatActivity {

        private EditText txtuserid;
        private EditText txtpass;
        private CheckBox checkBox;

        private TextView error_message;
        private SharedPreferences prefs;
        private SharedPreferences.Editor editor;
        public static final String FLAG = "FLAG";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_log_in);
            checkInstance(savedInstanceState);
            setUpViews();
            setupSharedPrefs();
            checkPref();
        }

        private void setUpViews() {
            txtuserid = findViewById(R.id.txtuserid);
            txtpass = findViewById(R.id.txtpass);
            checkBox = findViewById(R.id.checkBox);
            error_message=findViewById(R.id.error_message);
        }
        private void setupSharedPrefs() {
            prefs = PreferenceManager.getDefaultSharedPreferences(this);
            editor = prefs.edit();
        }
        public void ptnlogIn(View view) {
            String userId = txtuserid.getText().toString();
            String password = txtpass.getText().toString();
            if (checkBox.isChecked()) {
                editor.putString("userid", userId);
                editor.putString("pass", password);
                editor.putBoolean(FLAG, true);
                editor.apply();
            }
        }
        private void checkPref() {
            boolean flag = prefs.getBoolean(FLAG, false);
            if (flag) {
                String userid = prefs.getString("userid", "");
                String pass = prefs.getString("pass", "");
                txtuserid.setText(userid);
                txtpass.setText(pass);
                checkBox.setChecked(true);
            }
        }
        private void checkInstance(Bundle savedInstanceState) {
            if(savedInstanceState != null){
                txtuserid.setText(savedInstanceState.getString("userID"));
                txtpass.setText(savedInstanceState.getString("pass"));
                checkBox.setChecked(savedInstanceState.getBoolean("ch"));
            }
        }

        @Override
        protected void onSaveInstanceState(@NonNull Bundle outState){
            super.onSaveInstanceState(outState);
             String id=txtuserid.getText().toString();
             String pass=txtpass.getText().toString();
             Boolean ch=checkBox.isChecked();
            outState.putString("userID", id);
            outState.putString("pass", pass);
            outState.putBoolean("isCheck",ch);

        }

        public void ptnSign(View view) {
            Intent intent = new Intent(this, Activity_SignUp.class);
            startActivity(intent);
        }

    }