package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Third_activity extends AppCompatActivity {

    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView_2_taka;
    TextView textView_5_taka;
    TextView textView_10_taka;
    TextView textView_20_taka;
    TextView textView_50_taka;
    TextView textView_100_taka;
    TextView textView_200_taka;
    TextView textView_500_taka;
    TextView textView_1000_taka;
    Button b_2;
    Button b_5;
    Button b_10;
    Button b_20;
    Button b_50;
    Button b_100;
    Button b_200;
    Button b_500;
    Button b_1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activity);

        textView=(TextView)findViewById(R.id.third_textView);
        textView1=(TextView)findViewById(R.id.third_textView1);
        textView2=(TextView)findViewById(R.id.third_textView2);
        textView3=(TextView)findViewById(R.id.third_textView3);
        textView_2_taka=(TextView)findViewById(R.id.third_textView_two);
        textView_5_taka=(TextView)findViewById(R.id.third_textView_five);
        textView_10_taka=(TextView)findViewById(R.id.third_textView_ten);
        textView_20_taka=(TextView)findViewById(R.id.third_textView_twenty);
        textView_50_taka=(TextView)findViewById(R.id.third_textView_fifty);
        textView_100_taka=(TextView)findViewById(R.id.third_textView_hundred);
        textView_200_taka=(TextView)findViewById(R.id.third_textView_two_hundred);
        textView_500_taka=(TextView)findViewById(R.id.third_textView_five_hundred);
        textView_1000_taka=(TextView)findViewById(R.id.third_textView_one_thousand);
        b_2=(Button)findViewById(R.id.two_taka_button);
        b_5=(Button)findViewById(R.id.five_taka_button);
        b_10 =(Button)findViewById(R.id.ten_taka_button);
        b_20=(Button)findViewById(R.id.twenty_taka_button);
        b_50=(Button)findViewById(R.id.fifty_taka_button);
        b_100=(Button)findViewById(R.id.hundred_taka_button);
        b_200=(Button)findViewById(R.id.two_hundred_taka_button);
        b_500=(Button)findViewById(R.id.five_hundred_taka_button);
        b_1000=(Button)findViewById(R.id.one_thousand_taka_button);

        Intent in=getIntent();
        String s=in.getStringExtra("name");
        textView1.setText(s);

    }


    public void Two_taka_show(View view) {
        Intent i=new Intent(getApplicationContext(),two_activity.class);
        startActivity(i);
    }

    public void five_show(View view) {
        Intent i=new Intent(getApplicationContext(),five_activity.class);
        startActivity(i);
    }


    public void ten_show(View view) {

        Intent i=new Intent(getApplicationContext(),ten_activity.class);
        startActivity(i);
    }

    public void twenty_show(View view) {
        Intent i=new Intent(getApplicationContext(),twenty_activity.class);
        startActivity(i);
    }


    public void fifty_show(View view) {
        Intent i=new Intent(getApplicationContext(),fifty_activity.class);
        startActivity(i);
    }


    public void one_hundred_show(View view) {
        Intent i=new Intent(getApplicationContext(),one_hundred_activity.class);
        startActivity(i);
    }

    public void two_hundred_show(View view) {
        Intent i=new Intent(getApplicationContext(),two_hundred_activity.class);
        startActivity(i);
    }

    public void five_hundred_show(View view) {
        Intent i=new Intent(getApplicationContext(),five_hundred_activity.class);
        startActivity(i);
    }

    public void one_thousand_show(View view) {
        Intent i=new Intent(getApplicationContext(),one_thousand_activity.class);
        startActivity(i);
    }
}
