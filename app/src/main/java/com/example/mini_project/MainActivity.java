package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    ImageView i;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=(ImageView)findViewById(R.id.background_pic);
        b=(Button)findViewById(R.id.First_page_Button1);
        t=(TextView)findViewById(R.id.First_page_Text1);

    }

    public void second_show(View view) {

        Intent i=new Intent(getApplicationContext(),Second_activity.class);
        startActivity(i);
    }
}
