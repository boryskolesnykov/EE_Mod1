package com.goit.ee.module1.api;

import com.goit.ee.module1.model.Report;

/**
 * @author bkolesnykov
 * @since 19.03.16
 */
public interface ReportGenerator {

    Report generateReport(ResultData data);

}
