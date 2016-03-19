package com.goit.ee.module1.Tests.Templates;

import com.goit.ee.module1.Interface.TestInterface;

import java.util.Collection;

/**
 * Created by Администратор on 19.03.2016.
 */
public abstract class TestTemplate<T extends Collection> implements TestInterface<T> {

    @Override
    public long run(T collection, int iterations) {
        long result = 0;

        for (int i = 0; i <= iterations; i++) {

            long startTime = System.nanoTime();
            bodyTest(collection, i);   //Body TEST
            long finishTime = System.nanoTime();

            result += finishTime - startTime;
        }

        return result / iterations;
    }

    protected abstract void bodyTest(T collection, int numberIteration);
}
