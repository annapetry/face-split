package com.annapetry.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewGroup;
import android.view.Window;

import com.petry.anna.facesplit.R;
import com.annapetry.fragments.CaptureFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anna Petry on 10/16/16.
 * Copyright (c) 2016 Anna Petry. All rights reserved.
 */
public class MainActivity extends BaseActivity {

	@BindView(R.id.fragment_layout) ViewGroup fragmentLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		ButterKnife.bind(this);

		// set-up the action bar

		showCaptureFragment();
	}

	private void showCaptureFragment() {
		CaptureFragment captureFragment = CaptureFragment.newInstance();
		final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.add(fragmentLayout.getId(), captureFragment, CaptureFragment.class.getSimpleName());
		transaction.commit();
	}
}
