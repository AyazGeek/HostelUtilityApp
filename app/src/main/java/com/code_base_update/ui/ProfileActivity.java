package com.code_base_update.ui;

import com.code_base_update.presenters.IBasePresenter;
import com.medeveloper.ayaz.hostelutility.R;

public class ProfileActivity extends BaseActivity {
    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {
        if(getSupportActionBar()!=null)
            getSupportActionBar().hide();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.new_profile_activity;
    }
}
