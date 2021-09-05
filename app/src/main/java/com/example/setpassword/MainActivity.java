package com.example.setpassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text1 = (EditText) findViewById(R.id.user);
        EditText text2 = (EditText) findViewById(R.id.password);
        Button btn = (Button) findViewById(R.id.btu);

        btn.setBackgroundResource(R.color.colorAccent);

        btn.setEnabled(false);

        new setEdixttext().SetMonitorEditText(btn,text1,text2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"点击成功",Toast.LENGTH_SHORT).show();
            }
        });
    }


}