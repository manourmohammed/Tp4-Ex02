package com.example.tp4ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {
    Button btn1,btn2,btn3;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        btn1=findViewById(R.id.btn_1);
        btn2=findViewById(R.id.btn_2);
        btn3=findViewById(R.id.btn_3);
        ed1=findViewById(R.id.ed_number);
    }
}