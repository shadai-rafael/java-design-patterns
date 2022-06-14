package com.shadai.design.pattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SingletonTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        Singleton singleton = Singleton.getSingletonInstance();
        singleton.sumValue(2);
        System.out.println(singleton.getValue());
        InheritedSingleton inheritedSingleton =  new InheritedSingleton();
        System.out.println(inheritedSingleton.getValue());
        assertTrue( inheritedSingleton.getValue() == 2);
    }
}
