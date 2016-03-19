package com.goit.ee.module1.api;

import java.util.Collection;

/**
 * Created by Администратор on 19.03.2016.
 */
public interface CollectionProvider<CT extends Collection<ET>, ET> {
    CT provide(Class<ET> elemType, int size);
}
