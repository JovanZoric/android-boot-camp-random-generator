package com.zoric.jovan.randomnumbergenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "extra_message";
    public final static String LOG_TAG = "JZ";
    public final static String NUMBER_WARNING = "Please Ender Valid Input";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void sendRandomNumber(View view) {
        Log.d(LOG_TAG, "Send Random Number To The Second Intent");

        Intent intent = new Intent(this, SecondActivity.class);

        EditText editText = (EditText) findViewById(R.id.edit_message);
        try {
            int number = Integer.parseInt(editText.getText().toString());
            String message = new Integer(new Random().nextInt(number)).toString();

            intent.putExtra(EXTRA_MESSAGE, message);

            startActivity(intent);
        }catch (NumberFormatException exception){
            Log.d(LOG_TAG, "Warning NumberFormatException");
            TextView textView = (TextView) findViewById(R.id.warningMessage);
            textView.setText(NUMBER_WARNING);
        }

    }

}
