package com.petry.anna.facesplit.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.petry.anna.facesplit.ui.activities.MainActivity;
import com.trello.rxlifecycle.components.support.RxFragment;

import butterknife.ButterKnife;

/**
 * Created by Anna Petry on 10/16/16.
 * Copyright (c) 2016 Anna Petry. All rights reserved.
 */

public abstract class MainFragment extends RxFragment {

	private final static String TAG = "MainFragment";

	protected abstract String getPageTitle();
	protected abstract int getLayoutResourceId();

	public MainActivity getMainActivity() {
		return (MainActivity) getActivity();
	}

	@Override
	public void onResume() {
		super.onResume();
		updateActivityOnResume();
	}

	protected void updateActivityOnResume() {
		getMainActivity().setTitle(getPageTitle());
	}

	/**
	 * covers off common fragment initialization tasks such as creating the content view & binding the sub-views
	 * sub classes should implement {@link #onViewCreated(View, Bundle)}
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		final View view = inflater.inflate(getLayoutResourceId(), container, false);
		ButterKnife.bind(this, view);
		setHasOptionsMenu(true);
		setRetainInstance(true);
		return view;
	}

}