package com.example.flappy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        canvas.drawColor(Color.BLUE);
    }
}
