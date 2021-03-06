package org.unidal.cat.plugin.transaction;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.unidal.cat.plugin.transaction.config.TransactionConfigServiceTest;
import org.unidal.cat.plugin.transaction.config.TransactionConfigTest;
import org.unidal.cat.plugin.transaction.filter.TransactionReportFilterTest;
import org.unidal.cat.plugin.transaction.model.TransactionReportAggregatorTest;
import org.unidal.cat.plugin.transaction.reducer.TransactionReportReducerTest;
import org.unidal.cat.plugin.transaction.report.page.PayloadTest;

@RunWith(Suite.class)
@SuiteClasses({

TransactionConfigServiceTest.class,

TransactionConfigTest.class,

TransactionReportAggregatorTest.class,

TransactionReportFilterTest.class,

TransactionReportReducerTest.class,

PayloadTest.class,

})
public class AllTests {

}
