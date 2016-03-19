package com.goit.ee.module1;

import com.goit.ee.module1.Providers.List.ListIntegersProvider;
import com.goit.ee.module1.Tests.List.TestListIntegersAdd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 19.03.2016.
 */
public class Runner {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        new ListIntegersProvider().provide(integers,10);

        System.out.println(Tester.<List<Integer>>startTest(integers,100, new TestListIntegersAdd()));

        System.out.println(integers.toString());

    }
}
