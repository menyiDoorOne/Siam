package com.example.pein.siamuniversity;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Bundle;

public class StudentsVoiceActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;

    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_voice);

        tv1=(TextView)findViewById(R.id.textViewStudent1);
        tv2=(TextView)findViewById(R.id.textViewStudent2);
        tv3=(TextView)findViewById(R.id.textViewStudent3);
        tv2=(TextView)findViewById(R.id.textViewStudent4);
        tv3=(TextView)findViewById(R.id.textViewStudent5);

        iv1=(ImageView)findViewById(R.id.imageViewStudent1);
        iv2=(ImageView)findViewById(R.id.imageViewStudent2);
        iv3=(ImageView)findViewById(R.id.imageViewStudent3);
        iv2=(ImageView)findViewById(R.id.imageViewStudent4);
        iv3=(ImageView)findViewById(R.id.imageViewStudent5);
    }
}
