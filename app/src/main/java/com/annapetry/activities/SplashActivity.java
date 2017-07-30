package com.annapetry.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.ImageView;

import com.petry.anna.facesplit.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anna Petry on 10/16/16.
 * Copyright (c) 2016 Anna Petry. All rights reserved.
 */
public class SplashActivity extends BaseActivity {

	private final static String TAG = "SplashActivity";

	@BindView(R.id.logo) ImageView logoView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);

		ButterKnife.bind(this);

		logoView.animate().alpha(1).setDuration(500).start();

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent(SplashActivity.this,MainActivity.class);
				startActivity(intent);
				finish();
			}
		}, 2000);
	}
}
