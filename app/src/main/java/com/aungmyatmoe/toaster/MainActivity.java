package com.aungmyatmoe.toaster;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	public void sayHello(View v){
		Toast.makeText(this,"Hello My Lovely User",
		5000).show();
	}
}
