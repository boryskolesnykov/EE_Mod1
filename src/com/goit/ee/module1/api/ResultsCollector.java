package com.goit.ee.module1.api;

/**
 * @author bkolesnykov
 * @since 19.03.16
 */
public interface ResultsCollector<T> {

    void collect(T result);
    ResultData getResult();

}
