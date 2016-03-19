package com.goit.ee.module1.providers;

import com.goit.ee.module1.api.CollectionProvider;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by Администратор on 19.03.2016.
 */
public class ArrayListProvider<T> implements CollectionProvider<ArrayList<T>, T> {

    private static final PrintStream log = System.err;

    @Override
    public ArrayList<T> provide(Class<T> clazz, int size) {

        ArrayList<T> result = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            try {
                T instance = clazz.newInstance();
                result.add(instance);
            } catch (Exception e) {
                log.print("Unable to instantiate " + clazz.getSimpleName());
            }
        }

        return result;
    }

}
