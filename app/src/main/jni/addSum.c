//
// Created by 星哥 on 2017/5/8.
//
#include "com_example_xingge_jnidemo_Add.h";
JNIEXPORT jint JNICALL Java_com_example_xingge_jnidemo_Add_addSum
  (JNIEnv *env, jobject job, jint a, jint b){
  return a+b;
  }