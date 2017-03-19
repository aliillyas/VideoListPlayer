package com.waynell.videolist.visibility.scroll;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by aillyas on 3/19/17.
 */

public class RecyclerViewItemViewPositionGetter implements ItemsPositionGetter  {

    private LinearLayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;
    private int mViewId;

    public RecyclerViewItemViewPositionGetter(LinearLayoutManager layoutManager, RecyclerView recyclerView, int viewId) {
        mLayoutManager = layoutManager;
        mRecyclerView = recyclerView;
        mViewId = viewId;
    }

    @Override
    public View getChildAt(int position) {
        View cell = mLayoutManager.getChildAt(position);

        if (cell != null) {
            cell.findViewById(mViewId);
        }

        return null;
    }

    @Override
    public int indexOfChild(View view) {
        return mRecyclerView.indexOfChild(view);
    }

    @Override
    public int getChildCount() {
        return mRecyclerView.getChildCount();
    }

    @Override
    public int getLastVisiblePosition() {
        return mLayoutManager.findLastVisibleItemPosition();
    }

    @Override
    public int getFirstVisiblePosition() {
        return mLayoutManager.findFirstVisibleItemPosition();
    }
}
