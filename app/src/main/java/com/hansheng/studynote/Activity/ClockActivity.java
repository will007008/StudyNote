package com.hansheng.studynote.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextClock;

import com.hansheng.studynote.R;

/**
 * Created by hansheng on 16-11-9.
 */

public class ClockActivity extends AppCompatActivity {
    private TextClock mTextClock;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_clock_test);
        mTextClock = (TextClock)findViewById(R.id.my_tc);
        // 设置12时制显示格式
        mTextClock.setFormat12Hour("EEEE, MMMM dd, yyyy h:mmaa");
        // 设置24时制显示格式
        mTextClock.setFormat24Hour("yyyy-MM-dd hh:mm, EEEE");

    }
}
