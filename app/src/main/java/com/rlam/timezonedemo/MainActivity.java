package com.rlam.timezonedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextClock;

import java.util.Calendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Calendar c;
    TextClock textClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        textClock = (TextClock) findViewById(R.id.textClock);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Obtain the timezone based on the area selected
                textClock.setTimeZone((String) spinner.getSelectedItem());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){
                //Do nothing in this case
            }
        });
    }
}
