package com.goit.ee.module1.collectors;

import com.goit.ee.module1.api.ResultData;
import com.goit.ee.module1.api.ResultsCollector;
import com.goit.ee.module1.model.CollectionPerformanceResultData;

/**
 * @author bkolesnykov
 * @since 19.03.16
 */
public class TimeByOperationResultCollector implements ResultsCollector<Long> {

    private String operationName;
    private Long time;

    public TimeByOperationResultCollector(String operationName) {
        this.operationName = operationName;
    }

    @Override
    public void collect(Long result) {
        this.time = result;
    }

    @Override
    public ResultData getResult() {
        return new CollectionPerformanceResultData(operationName, time);
    }
}
