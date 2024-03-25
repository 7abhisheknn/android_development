package com.example.a23_fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

public class MyPagerAdapter extends PagerAdapter {
    private Context context;

    public MyPagerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ModelCourse modelCourse = ModelCourse.values()[position];
        LayoutInflater inflater = LayoutInflater.from(context);

        ViewGroup layout = (ViewGroup) inflater.inflate(modelCourse.getmLayoutId(), container, false);
        container.addView(layout);
        return layout;
//        return super.instantiateItem(container, position);
    }

    @Override
    public int getCount() {
        return ModelCourse.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        ModelCourse customPagerEnum = ModelCourse.values()[position];
        return context.getString(customPagerEnum.getmTitleId());
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
