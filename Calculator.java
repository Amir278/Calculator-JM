package com.java_mentor;

abstract class Calculator{
    public int sum(int a, int b){
        return a+b;
    }
    public int subtraction(int a, int b){
        return a-b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public int multipl(int a, int b){
        return a*b;
    }
    public Object calculate(){return null;}
}