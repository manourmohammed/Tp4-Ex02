package com.example.tp4ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    Button btn1,btn2,btn3;
    EditText ed1;
    TextView text;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        btn1=findViewById(R.id.btn_1);
        btn2=findViewById(R.id.btn_2);
        btn3=findViewById(R.id.btn_3);
        ed1=findViewById(R.id.ed_number);
        text=findViewById(R.id.text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(null);
                text.setText(
                        "?*0=?" +
                        "\n?*1=?" +
                        "\n?*2=?" +
                        "\n?*3=?" +
                        "\n?*4=?" +
                        "\n?*5=?" +
                        "\n?*6=?" +
                        "\n?*7=?" +
                        "\n?*8=?" +
                        "\n?*9=?");
                if (ed1.getText().toString().isEmpty()){
                    Toast.makeText(Activity1.this, "vide", Toast.LENGTH_SHORT).show();
                }


           }

        });



        btn3.setOnClickListener(v -> {
            finish();
        });
    }
}
