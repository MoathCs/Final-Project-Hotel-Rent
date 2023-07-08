package com.example.finalprojecthotelsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


    public class Activity_SignUp extends AppCompatActivity {

        private EditText Name;
        private EditText id;
        private EditText phoneNum;
        private EditText password;
        private EditText confirmPassword;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sign_up);
            setUpViews();
        }

        private void setUpViews() {
            Name= findViewById(R.id.name);
            id = findViewById(R.id.id);
            phoneNum=findViewById(R.id.phoneNum);
            password = findViewById(R.id.textpass);
            confirmPassword = findViewById(R.id.txtpassconfirm);
        }
        public void ptnReg(View view) {
            String inputName = Name.getText().toString();
            String inputId = id.getText().toString();
            String inputPhoneNum=phoneNum.getText().toString();
            String inputPassword = password.getText().toString();
            String inputConfirmPassword = confirmPassword.getText().toString();


        }

        private void clearFields() {
            Name.setText("");
            id.setText("");
            phoneNum.setText("");
            password.setText("");
            confirmPassword.setText("");
        }
    }