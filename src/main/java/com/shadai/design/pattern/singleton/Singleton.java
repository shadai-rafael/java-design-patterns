package com.shadai.design.pattern.singleton;

public class Singleton {

    static private int value;
    static private Singleton singletonInstance = null;

    public int getValue() {
        return value;
    }

    public void sumValue(int sum) {
        value = value + sum;
    }

    protected Singleton(){
    }

    public static synchronized Singleton getSingletonInstance()
    {        
        if(singletonInstance == null){
            singletonInstance = new Singleton();
            return singletonInstance;
        }else{
            return singletonInstance;
        }
    }
    
}
