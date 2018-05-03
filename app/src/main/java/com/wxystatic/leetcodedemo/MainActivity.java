package com.wxystatic.leetcodedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.wxystatic.leetcodedemo.code.Test_1.Test_1;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.addLogAdapter(new AndroidLogAdapter());
        int result[]= Test_1.twoSum(Test_1.nums,Test_1.target);
        Logger.t("result=").d(result[0]+"="+result[1]);
    }
}
