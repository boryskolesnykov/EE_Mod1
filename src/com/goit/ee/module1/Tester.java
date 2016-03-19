package com.goit.ee.module1;

import com.goit.ee.module1.Interface.TestInterface;

/**
 * Created by Администратор on 19.03.2016.
 */
public class Tester {

    public static <T> long startTest(T collection, int iterations, TestInterface test) {
        return test.run(collection,iterations);
    }
}
