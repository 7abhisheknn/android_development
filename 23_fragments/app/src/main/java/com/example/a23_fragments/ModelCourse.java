package com.example.a23_fragments;

public enum ModelCourse {
    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue),
    GREEN(R.string.green, R.layout.view_green);

    private int mTitleId;
    private int mLayoutId;

    ModelCourse(int mTitleId, int mLayoutId) {
        this.mTitleId = mTitleId;
        this.mLayoutId = mLayoutId;
    }

    public int getmTitleId() {
        return mTitleId;
    }

    public int getmLayoutId() {
        return mLayoutId;
    }
}
