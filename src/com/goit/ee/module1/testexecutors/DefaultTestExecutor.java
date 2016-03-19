package com.goit.ee.module1.testexecutors;

import com.goit.ee.module1.api.Operation;
import com.goit.ee.module1.api.ResultsCollector;
import com.goit.ee.module1.api.TestExecutor;

/**
 * @author bkolesnykov
 * @since 19.03.16
 */
public class DefaultTestExecutor implements TestExecutor {

    private ResultsCollector<Long> collector;

    public DefaultTestExecutor(ResultsCollector<Long> collector) {
        this.collector = collector;
    }

    @Override
    public void execute(Operation op, int times) {
        long result = 0;

        for (int i = 0; i <= times; i++) {

            long startTime = System.nanoTime();
            op.apply();
            long finishTime = System.nanoTime();

            result += finishTime - startTime;
        }

        collector.collect(result / times);
    }

    public ResultsCollector<Long> getCollector() {
        return collector;
    }

    public void setCollector(ResultsCollector<Long> collector) {
        this.collector = collector;
    }
}
