package com.example.cs315_a3_ncm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity
{
    public static final String MESSAGE_1 = "com.example.cs315_a3_ncm.MESSAGE1";
    public static final String MESSAGE_2 = "com.example.cs315_a3_ncm.MESSAGE2";
    public static final String MESSAGE_3 = "com.example.cs315_a3_ncm.MESSAGE3";
    public static final String MESSAGE_4 = "com.example.cs315_a3_ncm.MESSAGE4";
    public static final String MESSAGE_5 = "com.example.cs315_a3_ncm.MESSAGE5";
    public static final String MESSAGE_6 = "com.example.cs315_a3_ncm.MESSAGE6";
    public static final String MESSAGE_7 = "com.example.cs315_a3_ncm.MESSAGE7";
    public static final String MESSAGE_8 = "com.example.cs315_a3_ncm.MESSAGE8";

    private Boolean text1Full = false;
    private Boolean text2Full = false;
    private Boolean text3Full = false;
    private Boolean text4Full = false;
    private Boolean text5Full = false;
    private Boolean text6Full = false;
    private Boolean text7Full = false;
    private Boolean text8Full = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when send is tapped
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText1 = (EditText) findViewById(R.id.entryText_1);
        EditText editText2 = (EditText) findViewById(R.id.entryText_2);
        EditText editText3 = (EditText) findViewById(R.id.entryText_3);
        EditText editText4 = (EditText) findViewById(R.id.entryText_4);
        EditText editText5 = (EditText) findViewById(R.id.entryText_5);
        EditText editText6 = (EditText) findViewById(R.id.entryText_6);
        EditText editText7 = (EditText) findViewById(R.id.entryText_7);
        EditText editText8 = (EditText) findViewById(R.id.entryText_8);

        String message1 = editText1.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        String message4 = editText4.getText().toString();
        String message5 = editText5.getText().toString();
        String message6 = editText6.getText().toString();
        String message7 = editText7.getText().toString();
        String message8 = editText8.getText().toString();

        if (message1.length() > 0) {
            text1Full = true;
        }
        if (message2.length() > 0)
        {
            text2Full = true;
        }
        if(message3.length() > 0)
        {
            text3Full = true;
        }
        if(message4.length() > 0)
        {
            text4Full = true;
        }
        if(message5.length() > 0)
        {
            text5Full = true;
        }
        if(message6.length() > 0)
        {
            text6Full = true;
        }
        if(message7.length() > 0)
        {
            text7Full = true;
        }
        if(message8.length() > 0)
        {
            text8Full = true;
        }

        intent.putExtra(MESSAGE_1, message1);
        intent.putExtra(MESSAGE_2, message2);
        intent.putExtra(MESSAGE_3, message3);
        intent.putExtra(MESSAGE_4, message4);
        intent.putExtra(MESSAGE_5, message5);
        intent.putExtra(MESSAGE_6, message6);
        intent.putExtra(MESSAGE_7, message7);
        intent.putExtra(MESSAGE_8, message8);

        boolean allTextFull = text1Full && text2Full && text3Full && text4Full && text5Full && text6Full && text7Full && text8Full;

        if(allTextFull)
        {
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "All fields must be entered!", Toast.LENGTH_SHORT).show();
        }
    }
}