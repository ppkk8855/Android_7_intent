package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Data;
    private Button btn1;
    private TextView Display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data=findViewById(R.id.edt1);
        btn1=findViewById(R.id.btn1);
        Display=findViewById(R.id.tv1);


        Intent intent = getIntent();
       boolean change_T = intent.getBooleanExtra("Ctime",false);
        if(change_T==true) {
            String string = intent.getStringExtra("B_Data");
            Display.setText(string.toString());
        }


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,Main2Activity.class);
                intent.putExtra("A_Data",Data.getText().toString());
                startActivity(intent);
            }
        });



    }
}
