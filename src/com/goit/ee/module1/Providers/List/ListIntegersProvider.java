package com.goit.ee.module1.Providers.List;

import java.util.List;

/**
 * Created by Администратор on 19.03.2016.
 */
public class ListIntegersProvider extends DefaultListProvider<Integer> {

    @Override
    public List<Integer> provide(List<Integer> collection, int size) {

        for (int i = 0; i <= size; i++) {
            collection.add(i);
        }

        return collection;
    }
}
