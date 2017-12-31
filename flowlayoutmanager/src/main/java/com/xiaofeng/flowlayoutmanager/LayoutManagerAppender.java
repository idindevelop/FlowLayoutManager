package com.xiaofeng.flowlayoutmanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Anton Dudakov (dude.bw@gmail.com) on 04/10/16.
 */

public class LayoutManagerAppender {

    View mView;
    RecyclerView.LayoutManager mLayoutManager;
    Rect mRect;

    public LayoutManagerAppender(View view, RecyclerView.LayoutManager layoutManager, Rect rect) {
        mView = view;
        mLayoutManager = layoutManager;
        this.mRect = new Rect(rect);
    }

    public void layout(int addition) {
//        mLayoutManager.addView(mView);
        mLayoutManager.layoutDecorated(mView, mRect.left + addition, mRect.top, mRect.right + addition, mRect.bottom);
    }
}
