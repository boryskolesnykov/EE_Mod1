package com.goit.ee.module1.model;

import com.goit.ee.module1.api.ResultData;

/**
 * @author bkolesnykov
 * @since 19.03.16
 */
public class CollectionPerformanceResultData implements ResultData<String> {

    private String operationName;
    private Long time;

    public CollectionPerformanceResultData(String operationName, Long time) {
        this.operationName = operationName;
        this.time = time;
    }

    @Override
    public String getResult() {
        return "Operation: " + operationName + "; Time consumed: " + time;
    }
}
