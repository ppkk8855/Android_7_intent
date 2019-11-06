package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private EditText Data2;
    private Button btn2;
    private TextView Display2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Data2=findViewById(R.id.edt2);
        btn2=findViewById(R.id.btn);
        Display2=findViewById(R.id.tv2);

        Intent intent=this.getIntent();
        String A_Data=intent.getStringExtra("A_Data");
        Display2.setText(A_Data.toString());


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Main2Activity.this,MainActivity.class);
                intent.putExtra("B_Data",Data2.getText().toString());
                intent.putExtra("Ctime",true);
                startActivity(intent);

            }
        });

    }
}
