package com.example.fragview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity implements callback {
	Fragment2 f2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@SuppressLint("NewApi")
	public void one(View view) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction tr = fm.beginTransaction();
		tr.replace(R.id.fl, new Fragment1());
		tr.addToBackStack(null);
		tr.commit();
	}

	@SuppressLint("NewApi")
	public void two(View view) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction tr = fm.beginTransaction();
		f2 = new Fragment2();
		tr.replace(R.id.fl, f2);
		tr.addToBackStack(null);
		tr.commit();
	}

	@SuppressLint("NewApi")
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			if (getFragmentManager().getBackStackEntryCount() == 0) {
				finish();
			} else {
				getFragmentManager().popBackStack();
			}
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void setTitle(String s) {
		// TODO Auto-generated method stub
		f2.settxt(s);
	}



}
