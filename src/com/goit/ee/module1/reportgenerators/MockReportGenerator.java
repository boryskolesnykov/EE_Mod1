package com.goit.ee.module1.reportgenerators;

import com.goit.ee.module1.api.ReportGenerator;
import com.goit.ee.module1.api.ResultData;
import com.goit.ee.module1.model.Report;

/**
 * @author bkolesnykov
 * @since 19.03.16
 */
public class MockReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport(ResultData data) {
        //generate report here
        return null;
    }
}
