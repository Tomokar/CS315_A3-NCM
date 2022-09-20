package com.example.cs315_a3_ncm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message1 = intent.getStringExtra(MainActivity.MESSAGE_1);
        String message2 = intent.getStringExtra(MainActivity.MESSAGE_2) + "d";
        String message3 = intent.getStringExtra(MainActivity.MESSAGE_3);
        String message4 = intent.getStringExtra(MainActivity.MESSAGE_4) + "d";
        String message5 = intent.getStringExtra(MainActivity.MESSAGE_5);
        String message6 = intent.getStringExtra(MainActivity.MESSAGE_6);
        String message7 = intent.getStringExtra(MainActivity.MESSAGE_7);
        String message8 = intent.getStringExtra(MainActivity.MESSAGE_8);

        TextView textView1 = findViewById(R.id.textEntry_1);
        TextView textView2 = findViewById(R.id.textEntry_2);
        TextView textView3 = findViewById(R.id.textEntry_3);
//        TextView textView4 = findViewById(R.id.textEntry_4);
//        TextView textView5 = findViewById(R.id.textEntry_5);
//        TextView textView6 = findViewById(R.id.textEntry_6);
//        TextView textView7 = findViewById(R.id.textEntry_7);
//        TextView textView8 = findViewById(R.id.textEntry_8);

        textView1.setPaintFlags(textView1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView2.setPaintFlags(textView2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView3.setPaintFlags(textView3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
//        textView4.setPaintFlags(textView4.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
//        textView5.setPaintFlags(textView5.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
//        textView6.setPaintFlags(textView6.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
//        textView7.setPaintFlags(textView7.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
//        textView8.setPaintFlags(textView8.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        textView1.setText(message1);
        textView2.setText(message2);
        textView3.setText(message3);
//        textView4.setText(message4);
//        textView5.setText(message5);
//        textView6.setText(message6);
//        textView7.setText(message7);
//        textView8.setText(message8);
    }
}