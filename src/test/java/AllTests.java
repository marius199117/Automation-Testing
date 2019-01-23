import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
    /**
     * Returns a <code>TestSuite</code> instance that contains all the declared
     * <code>TestCase</code> to run.
     *
     * @return a <code>TestSuite</code> instance.
     */
    public static Test suite()
    {
        final TestSuite suite = new TestSuite("All Tests");

        suite.addTest((Test) TestAboutUsPage.suite());
//        suite.addTest(Test2.suite());
//        suite.addTest(Test3.suite());

        return suite;
    }

    /**
     * Launches all the tests with a text mode test runner.
     *
     * @param args ignored
     */
    public static final void main(String[] args)
    {
        junit.textui.TestRunner.run(AllTests.suite());
    }

} // AllTests



