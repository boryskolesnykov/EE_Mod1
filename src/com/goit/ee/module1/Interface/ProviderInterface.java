package com.goit.ee.module1.Interface;

import java.util.Collection;

/**
 * Created by Администратор on 19.03.2016.
 */
public interface ProviderInterface<T extends Collection> {
    T provide(T collection, int size);
}
