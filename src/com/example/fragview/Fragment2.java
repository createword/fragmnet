package com.example.fragview;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("NewApi")
public class Fragment2 extends Fragment {
	TextView tt;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.item2, null);
		tt = (TextView) v.findViewById(R.id.one);
		return v;
	}

	public void settxt(String txt) {
		tt.setText(txt);
	}
}
