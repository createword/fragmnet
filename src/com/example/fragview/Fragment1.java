package com.example.fragview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * �����ķ�������ʵ�ֽӿ� ��activity ��ʵ�ֽӿ��� ��һ��fragment ���� ȥ�����Լ�������ȡ���˵Ĳ���
 * 
 * @author WINTER
 *
 */
@SuppressLint("NewApi")
public class Fragment1 extends Fragment {
	callback callback;
	private Button b1;

	@SuppressLint("NewApi")
	@SuppressWarnings("deprecation")
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		callback = (callback) activity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.item, null);

		b1 = (Button) v.findViewById(R.id.b1);
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				callback.setTitle("С��");
			}
		});
		return v;
	}

}

interface callback {
	public void setTitle(String s);

}