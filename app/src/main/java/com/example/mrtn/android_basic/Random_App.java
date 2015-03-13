package com.example.mrtn.android_basic;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Random_App extends ActionBarActivity {

    static int randRange(int bottom, int top) { //funtksioon mis tagastab long tüüpi muutuja
        int juhuarv = (int) (Math.round(Math.random() * (top - bottom)) + bottom);
        return juhuarv;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random__app);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_random__app, menu);
        return true;
    }
    public void buttonOnClick(View view) {

        String [] coin = {"kull", "kiri"};
        Button button = (Button) view;
        ((Button) view).setText(coin[randRange(0,1)]);

        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText("MÜNT MAANDUB KÜLJELE ... " + coin[randRange(0,1)]);

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.taust);
        relativeLayout.setBackgroundColor(Color.rgb(randRange(0, 255), randRange(0, 255), randRange(0, 255)));
    }




//    public void addTextToList(String s) {
//
//
//        .setText(coin[randRange(0,1)]);
//
//
//    }

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
}
