package com.viewpagerdemo;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by jiawayun on 2016/8/29.
 */
public class VPAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
