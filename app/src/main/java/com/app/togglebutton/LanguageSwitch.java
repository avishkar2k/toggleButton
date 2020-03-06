package com.app.togglebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class LanguageSwitch extends LinearLayout {
    public LanguageSwitch(Context context) {
        this(context, null);
    }

    public LanguageSwitch(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LanguageSwitch(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.language_switch, this);
        CheckBox english = findViewById(R.id.english);
        CheckBox tamil = findViewById(R.id.tamil);
        tamil.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                if (english.isChecked()) english.setChecked(false);
            } else {
                if (!english.isChecked()) english.setChecked(true);
            }
        });
        english.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                if (tamil.isChecked()) tamil.setChecked(false);
            } else {
                if (!tamil.isChecked()) tamil.setChecked(true);
            }
        });
    }

    public LanguageSwitch(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this(context, attrs, defStyleAttr);
    }
}
