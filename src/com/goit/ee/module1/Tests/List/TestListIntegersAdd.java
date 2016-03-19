package com.goit.ee.module1.Tests.List;

import com.goit.ee.module1.Tests.Templates.TestListIntegersTemplate;

import java.util.List;

/**
 * Created by Администратор on 19.03.2016.
 */
public class TestListIntegersAdd extends TestListIntegersTemplate {

    @Override
    protected void bodyTest(List<Integer> collection, int iteration) {

            int index = (int) Math.round(Math.random() * collection.size());
            collection.add(index, iteration);

    }
}
