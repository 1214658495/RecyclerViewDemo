package com.bydauto.mycustomloyout;

/**
 * Created by byd_tw on 2017/7/13.
 */

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/**
 * Created by anonymous on 2016/9/9 0009.
 * <p>
 * GridSpacingItemDecoration
 * <p>
 * int spanCount = 3; // 3 columns
 * int spacing = 50; // 50px
 * boolean includeEdge = false;
 * recyclerView.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));
 */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private static final String TAG = "GridSpacingItemDecorati";

    private int spanCount;
    private int spacing;
    private boolean includeEdge;

    public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
        this.spanCount = spanCount;
        this.spacing = spacing;
        this.includeEdge = includeEdge;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view); // item position
        int column = position % spanCount; // item column

        if (includeEdge) {
            Log.e(TAG,"includeEdge:rect边上有space");
            outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
            outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

//            if (position < spanCount) { // top edge
//                outRect.top = spacing;
//            }
            outRect.bottom = spacing; // item bottom
        } else {
            Log.e(TAG,"NO_includeEdge：rect边上无space");
            outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
            outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
            if (position >= spanCount) {
                outRect.top = spacing - 30; // item top
            }
        }
    }


}
