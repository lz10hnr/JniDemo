package com.example.xingge.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Add a = new Add();
        int result = a.addSum(10, 39);
        Log.d("MainActivity", "result:" + result);
    }
}
