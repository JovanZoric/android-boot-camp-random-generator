package com.zoric.jovan.randomnumbergenerator;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jovan on 10.7.2016..
 */
public class SecondActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        Log.d(new StringBuilder().append(MainActivity.LOG_TAG).append(" message").toString(), message);
        TextView textView = (TextView) findViewById(R.id.textViewSecondLayout);

        Log.d(new StringBuilder().append(MainActivity.LOG_TAG).append(" text view").toString(), "Set size");
        textView.setTextSize(40);

        Log.d(new StringBuilder().append(MainActivity.LOG_TAG).append(" text view").toString(), "Set text");
        textView.setText(message);
    }


}
