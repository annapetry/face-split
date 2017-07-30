package com.annapetry.fragments;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;

import com.petry.anna.facesplit.R;

import butterknife.BindView;

/**
 * Created by Anna Petry on 10/16/16.
 * Copyright (c) 2016 Anna Petry. All rights reserved.
 */
public class CaptureFragment extends MainFragment {

	private final static String TAG = "CaptureFragment";

	@BindView(R.id.surfaceView)
	SurfaceView surfaceView;

	CameraManager manager;

	public static CaptureFragment newInstance() {
		return new CaptureFragment();
	}

	// Fragment ====================================================================================
	public void onCreateView(View view, Bundle savedInstanceState) {
		manager = (CameraManager) getContext().getSystemService(Context.CAMERA_SERVICE);
	}

	// Main Fragment ===============================================================================
	@Override
	protected int getLayoutResourceId() {
		return R.layout.fragment_capture;
	}

	@Override
	protected String getPageTitle() {
		return getString(R.string.app_name);
	}

}
