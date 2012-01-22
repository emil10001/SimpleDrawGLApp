package com.feigdev.simpledrawglapp;

import android.app.Activity;
import android.os.Bundle;
import com.feigdev.drawgl.android.*;

public class SimpleDrawGLAppActivity extends Activity{
	DrawGL drawView;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawView = new DrawGL(this);
        setContentView(drawView);
        drawView.requestFocus();
        drawView.setFocusableInTouchMode(true);
    }

    @Override
    protected void onPause(){
    	super.onPause();
    	drawView.onPause();
    }
    
    @Override 
    protected void onResume(){
    	super.onResume();
    	drawView.onResume();
    }
    
}