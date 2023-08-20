package com.example.counterapp;

public class CounterSingleton {
    private static CounterSingleton instance = null;
    private int value = 0;
    private CounterSingleton() {}

    public static CounterSingleton getInstance(){
        if(instance == null){
            instance = new CounterSingleton();
        }
        return instance;
    }

    public void increase(){
        ++value;
    }

    public int getValue() {
        return value;
    }
}
