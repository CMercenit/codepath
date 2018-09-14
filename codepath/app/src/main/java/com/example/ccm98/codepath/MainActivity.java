package com.example.ccm98.codepath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {
            int myCounter = 0;

            @Override
            public void onClick(View v)
            {
                //Log.i("text1", "text2");
                if(myCounter == 0)
                {
                    ((TextView) findViewById(R.id.textView)).setTextColor(
                            getResources().getColor(R.color.red));
                    myCounter++;
                }
                else if(myCounter == 1)
                {
                    ((TextView)findViewById(R.id.textView)).setTextColor(
                            getResources().getColor(R.color.orange));
                    myCounter++;
                }
                else if(myCounter == 2)
                {
                    ((TextView)findViewById(R.id.textView)).setTextColor(
                            getResources().getColor(R.color.yellow));
                    myCounter++;
                }
                else if(myCounter == 3)
                {
                    ((TextView)findViewById(R.id.textView)).setTextColor(
                            getResources().getColor(R.color.green));
                    myCounter++;
                }
                else if(myCounter == 4)
                {
                    ((TextView)findViewById(R.id.textView)).setTextColor(
                            getResources().getColor(R.color.blue));
                    myCounter++;
                }
                else if(myCounter == 5)
                {
                    ((TextView)findViewById(R.id.textView)).setTextColor(
                            getResources().getColor(R.color.indigo));
                    myCounter++;
                }
                else if(myCounter == 6)
                {
                    ((TextView)findViewById(R.id.textView)).setTextColor(
                            getResources().getColor(R.color.violet));
                    myCounter = 0;
                }
            }
        });
    }
}
