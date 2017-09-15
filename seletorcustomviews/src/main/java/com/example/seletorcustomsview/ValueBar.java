package com.example.seletorcustomsview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hienle on 7/24/17.
 */

public class ValueBar extends View {

    private int maxValue = 100; //default
    private int currentValue = 0;
    private int barHeight;
    private int circleRadius;
    private int spaceAfterBar;
    private int circleTextSize;
    private int maxValueTextSize;
    private int labelTextSize;
    private int labelTextColor;
    private int currentValueTextColor;
    private int circleTextColor;
    private int baseColor;
    private int fillColor;
    private String labelText;

    public ValueBar(Context context) {
        super(context);
    }

    public ValueBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ValueBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
        invalidate();
        requestLayout();
    }

    public void setValue(int newValue) {
        if(newValue < 0) {
            currentValue = 0;
        } else if (newValue > maxValue) {
            currentValue = maxValue;
        } else {
            currentValue = newValue;
        }
        invalidate();
    }
}
