package com.example.ccm98.codepath;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.textColor).setOnClickListener(new View.OnClickListener()
        {
            int myCounter = 0;

            @Override
            public void onClick(View v)
            {
                switch(myCounter)
                {
                    case 0:
                        ((TextView) findViewById(R.id.textView)).setTextColor(
                                getResources().getColor(R.color.red));
                        myCounter++;
                        break;
                    case 1:
                        ((TextView) findViewById(R.id.textView)).setTextColor(
                                getResources().getColor(R.color.orange));
                        myCounter++;
                        break;
                    case 2:
                        ((TextView) findViewById(R.id.textView)).setTextColor(
                                getResources().getColor(R.color.yellow));
                        myCounter++;
                        break;
                    case 3:
                        ((TextView) findViewById(R.id.textView)).setTextColor(
                                getResources().getColor(R.color.green));
                        myCounter++;
                        break;
                    case 4:
                        ((TextView) findViewById(R.id.textView)).setTextColor(
                                getResources().getColor(R.color.blue));
                        myCounter++;
                        break;
                    case 5:
                        ((TextView) findViewById(R.id.textView)).setTextColor(
                                getResources().getColor(R.color.indigo));
                        myCounter++;
                        break;
                    case 6:
                        ((TextView) findViewById(R.id.textView)).setTextColor(
                                getResources().getColor(R.color.violet));
                        myCounter = 0;
                        break;
                    default:
                        ((TextView) findViewById(R.id.textView)).setTextColor(
                                getResources().getColor(R.color.black));
                        myCounter = 0;
                        break;
                }
            }
        });

        findViewById(R.id.backgroundColor).setOnClickListener(new View.OnClickListener()
        {
            int myColorValue = -2145219806;

            @Override
            public void onClick(View v)
            {
                int myCurrentColor = ((ColorDrawable) findViewById(R.id.rootView).getBackground()).getColor();

                if(myCurrentColor == myColorValue)
                {
                    findViewById(R.id.rootView).setBackgroundColor(
                            getResources().getColor(R.color.paleRed));
                }
                else
                {
                    findViewById(R.id.rootView).setBackgroundColor(
                            getResources().getColor(R.color.myColor));
                }
            }
        });

        findViewById(R.id.textString).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String myText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if(!myText.isEmpty())
                {
                    ((TextView) findViewById(R.id.textView)).setText(myText);
                    findViewById(R.id.editText).clearFocus();
                    ((EditText)findViewById(R.id.editText)).getText().clear();
                }
                else
                {
                    ((TextView) findViewById(R.id.textView)).setText("Android is Awesome!");
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((TextView) findViewById(R.id.textView)).setText("Hello from Charles!");
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.myColor));
            }
        });
    }
}