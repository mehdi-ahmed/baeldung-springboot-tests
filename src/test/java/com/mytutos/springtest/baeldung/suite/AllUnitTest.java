package com.mytutos.springtest.baeldung.suite;

import com.mytutos.springtest.baeldung.Junit5ExamplesTest;
import com.mytutos.springtest.baeldung.JunitSuiteTest;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.mytutos.springtest.baeldung")
@ExcludePackages("com.mytutos.springtest.baeldung.suite")
@SelectClasses({Junit5ExamplesTest.class, JunitSuiteTest.class})
public class AllUnitTest {
}
