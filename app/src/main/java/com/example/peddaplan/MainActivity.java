package com.example.peddaplan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    int[] pics = {R.drawable.q,R.drawable.w,R.drawable.e,R.drawable.r};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=(ImageView) findViewById(R.id.picture);
    }


public void change(View view)
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(4);
        image.setImageResource(pics[rand_int]);

    }}