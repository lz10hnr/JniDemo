package com.example.xingge.jnidemo;

/**
 * Created by xingge on 2017/5/8.
 */

public class Add {

    static {
        System.loadLibrary("addsum");
    }
    //声明本地方法
    public native int addSum(int a,int b);
}
