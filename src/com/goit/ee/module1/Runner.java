package com.goit.ee.module1;

import com.goit.ee.module1.api.CollectionProvider;
import com.goit.ee.module1.api.Operation;
import com.goit.ee.module1.api.ReportGenerator;
import com.goit.ee.module1.api.ResultsCollector;
import com.goit.ee.module1.api.TestExecutor;
import com.goit.ee.module1.collectors.TimeByOperationResultCollector;
import com.goit.ee.module1.providers.ArrayListProvider;
import com.goit.ee.module1.reportgenerators.MockReportGenerator;
import com.goit.ee.module1.testexecutors.DefaultTestExecutor;

import java.util.ArrayList;

/**
 * @author Администратор
 * @since 19.03.2016
 */
public class Runner {
    public static void main(String[] args) {

        CollectionProvider<ArrayList<Integer>, Integer> provider = new ArrayListProvider<>();
        final ArrayList<Integer> integers = provider.provide(Integer.class, 100);

        ResultsCollector<Long> collector = new TimeByOperationResultCollector("ArrayList performance");

        TestExecutor testExecutor = new DefaultTestExecutor(collector);
        testExecutor.execute(new Operation() {
            @Override
            public void apply() {
                int index = (int) Math.round(Math.random() * integers.size());
                integers.add(index, index);
            }

            @Override
            public String getName() {
                return "Performance test: collection size: 100, times: 100";
            }
        }, 100);

        ReportGenerator reportGenerator = new MockReportGenerator();
        reportGenerator.generateReport(collector.getResult());
    }
}
