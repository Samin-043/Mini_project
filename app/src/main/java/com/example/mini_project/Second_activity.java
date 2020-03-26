package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    ImageView img;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    EditText name;
    EditText mail;
    EditText password;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        img=(ImageView)findViewById(R.id.sign_in_pic);
        textView1=(TextView)findViewById(R.id.text_view1);
        textView2=(TextView)findViewById(R.id.text_view2);
        textView3=(TextView)findViewById(R.id.text_view3);
        name=(EditText)findViewById(R.id.user_name);
        mail=(EditText)findViewById(R.id.user_mail);
        password=(EditText)findViewById(R.id.user_password);
        next=(Button)findViewById(R.id.Second_page_Button);

    }

    public void Third_show(View view) {

        String s;
        s=name.getText().toString();
        Intent in=new Intent(getApplicationContext(),Third_activity.class);
        in.putExtra("name",s);
        startActivity(in);

    }
}
