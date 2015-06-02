package com.example.wangbaiyang.myappportfolio;

import android.graphics.PorterDuff;
import android.view.View.OnClickListener;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MyAppPortfolio extends ActionBarActivity implements OnClickListener{

    private TextView textView;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        getReferences();
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.button_1:
                Toast.makeText(getBaseContext(), "SPOTIFY STREAMER is Launched! "
                       , Toast.LENGTH_LONG).show();
                break;

            case R.id.button_2:
                Toast.makeText(getBaseContext(), "SCORES APP is Launched! "
                        , Toast.LENGTH_LONG).show();
                break;

            case R.id.button_3:
                Toast.makeText(getBaseContext(), "LIBRARY APP is Launched! "
                        , Toast.LENGTH_LONG).show();
                break;

            case R.id.button_4:
                Toast.makeText(getBaseContext(), "BUILD IT BEGGER is Launched! "
                        , Toast.LENGTH_LONG).show();
                break;

            case R.id.button_5:
                Toast.makeText(getBaseContext(), "XYZ READER is Launched! "
                        , Toast.LENGTH_LONG).show();
                break;
            case R.id.button_6:
                Toast.makeText(getBaseContext(), "CAPSTONE: MY OWN APP is Launched! "
                       , Toast.LENGTH_LONG).show();
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getReferences(){
        textView = (TextView) findViewById(R.id.title);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_1.getBackground().setColorFilter(0x88DD0000, PorterDuff.Mode.MULTIPLY);
        button_2.getBackground().setColorFilter(0x88DD0000, PorterDuff.Mode.MULTIPLY);
        button_3.getBackground().setColorFilter(0x88DD0000, PorterDuff.Mode.MULTIPLY);
        button_4.getBackground().setColorFilter(0x88DD0000, PorterDuff.Mode.MULTIPLY);
        button_5.getBackground().setColorFilter(0x88DD0000, PorterDuff.Mode.MULTIPLY);
        button_6.getBackground().setColorFilter(0x8800DD00, PorterDuff.Mode.MULTIPLY);
    }
}
