package com.example.ye.gestures;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;



public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {

    private TextView text;
    private GestureDetectorCompat gD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.text = (TextView)findViewById(R.id.my_text);
        this.gD = new GestureDetectorCompat(this,this);
        gD.setOnDoubleTapListener(this);

    }
/*
"True if the listener has consumed the event, false otherwise."

If you return true, the event is processed. If false, it will go to the next layer down.
* */

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        text.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        text.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        text.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        text.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        text.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        text.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        text.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        text.setText("onLongPress");

    }
//end gestures
//check if this touch is a special gesture
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gD.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        text.setText("onFling");
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
