package com.example.sectorcommander;

import android.graphics.Canvas;
import android.graphics.Rect;

public interface FoldShading {
    void onPreDraw(Canvas canvas, Rect bounds, float rotation, int gravity);

    void onPostDraw(Canvas canvas, Rect bounds, float rotation, int gravity);
}
