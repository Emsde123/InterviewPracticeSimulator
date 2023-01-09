package QuestionsDB;

import java.util.ArrayList;

public class TestNGandSeleniumQuestions {

    public static ArrayList<String> TestNGandSeleniumQuestions = new ArrayList<>(){{
        add("1. What is TestNG?\n");
        add("2. What are some advantages of TestNG?");
        add("3. How is TestNG different from Selenium WebDriver?");
        add("4. What is the use of testng.xml file?\n");
        add("5. How can we group test cases like separate test cases for Sanity suite, Regression suite, etc?");
        add("6. How can we exclude a Test method from getting executed via testng.xml file?");
        add("7. What are some commonly used TestNG annotations?");
        add("8. What is the order of execution of the test method based on the different annotations?\n");
        add("9. What are some common assertions provided by TestNG?\n");
        add("10. How can we disable or prevent a test case from running?\n");
        add("11. How can we make one test method dependent on others using TestNG?");
        add("12. How can we set the priority of test cases in TestNG?");
        add("13. What is the default priority of test cases in TestNG?");
        add("14. How can we run a Test method multiple times in a loop(without using any data provider)?\n");
        add("15. What is threadPoolSize? How can we use it?\n");
        add("16. What is the difference between soft assertion and hard assertion in TestNG?\n");
        add("17. How to fail a testNG test if it doesn’t get executed within a specified time?\n");
        add("18. How can we skip a test case conditionally?\n");
        add("19. How can we make sure a test method runs even if the test methods or groups on which it depends fail or get skipped?\n");
        add("20. How can we pass the parameter to test script using TestNG?");
        add("21. How can we create data driven framework using TestNG?");
        add("22. What is the use of @Listener annotation in TestNG?");
        add("23. What is the use of @Factory annotation in TestNG?");
        add("24. What is the difference between @Factory and @DataProvider annotation?");
        add("25. How can we run test cases in parallel using TestNG?");
    }};

    public static ArrayList<String> TestNGandSeleniumAnswers = new ArrayList<>(){{
        add("TestNG(NG for Next Generation) is a testing framework that can be integrated with selenium or any other automation tool \n" +
                " to provide multiple capabilities like assertions, reporting, parallel test execution, etc.");
        add("Following are the advantages of TestNG-\n" +
                "1.\tTestNG provides different assertions that help in checking the expected and actual results.\n" +
                "2.\tIt provides parallel execution of test methods.\n" +
                "3.\tWe can define the dependency of one test method over others in TestNG.\n" +
                "4.\tWe can assign priority to test methods in Selenium.\n" +
                "5.\tIt allows grouping of test methods into test groups.\n" +
                "6.\tIt allows data-driven testing using @DataProvider annotation.\n" +
                "7.\tIt has inherent support for reporting.\n" +
                "8.\tIt has support for parameterizing test cases using @Parameters annotation.\n");
        add("Selenium is an automation tool using which we can automate web-based applications. In order to add testing capabilities in the Test Automation suites \n" +
                "– Selenium is clubbed with TestNG. With TestNG, we can have different features in our automation suite \n" +
                " like different types of assertions, reporting, parallel execution, and parameterization, etc.\n" +
                "In short, for doing Automation Testing, Selenium helps with ‘automation’ and TestNG helps with ‘testing’ capabilities.\n");
        add("The testng.xml file is used for configuring the whole test suite. In testng.xml file, \n" +
                " we can create a test suite, create test groups, mark tests for parallel execution, add listeners, and pass parameters to test scripts. \n" +
                " We can also use this testng.xml file for triggering the test suite from the command prompt/terminal or Jenkins.\n");
        add("Using groups attribute in TestNG, we can assign the test methods to different groups.\n" +
                "//Test method belonging to sanity suite only\n" +
                "@Test(groups = {\"sanitySuite\"})\n" +
                "public void testMethod1() {\n" +
                "  //Test logic\n" +
                "}\n" +
                "\n" +
                "\n" +
                "//Test method belonging to both sanity and regression suite\n" +
                "@Test(groups = {\"sanitySuite\", \"regressionSuite\"})\n" +
                "public void testMethod2() {\n" +
                "  //Test logic\n" +
                "}\n");
        add(" Using the exclude tag in testng.xml file, we can exclude a particular test method from getting executed.\n" +
                "<suite name=\"Test Suite\" verbose=\"1\">\n" +
                "   <test name=\"TestName\">\n" +
                "      <classes>\n" +
                "         <class name=\"TestClassName\">\n" +
                "            <methods>\n" +
                "               <exclude name=\"testMethodToBeExcluded\"/>\n" +
                "            </methods>\n" +
                "         </class>      \n" +
                "      </classes>\n" +
                "   </test>\n" +
                "</suite>\n");
        add("The commonly used TestNG annotations are-\n" +
                "⦁\t@Test – @Test annotation marks a method as a Test method.\n" +
                "⦁\t@BeforeSuite – The annotated method will run only once before all tests in this suite have run.\n" +
                "⦁\t@AfterSuite – The annotated method will run only once after all tests in this suite have run.\n" +
                "⦁\t@BeforeClass – The annotated method will run only once before the first test method in the current class is invoked.\n" +
                "⦁\t@AfterClass – The annotated method will run only once after all the test methods in the current class have been run.\n" +
                "⦁\t@BeforeTest – The annotated method will run before any test method belonging to the classes inside the <test> tag is run.\n" +
                "⦁\t@AfterTest – The annotated method will run after all the test methods belonging to the classes inside the <test> tag have run.\n" +
                "⦁\t@BeforeMethod – The annotated method will run before each test method marked by @Test annotation.\n" +
                "⦁\t@AfterMethod – The annotated method will run after each test method marked by @Test annotation.\n" +
                "⦁\t@DataProvider – The @DataProvider annotation is used to pass test data to the test method. The test method will run as per the number of rows of data passed via the data provider method.\n");
        add("The test methods in TestNG follow the Suite->Test->Class->Method sequence combined with the Before annotions->Test annotations->After annotations sequence. So, the order of execution is-\n" +
                "@BeforeSuite\n" +
                "@BeforeTest\n" +
                "@BeforeClass\n" +
                "@BeforeMethod\n" +
                "@Test\n" +
                "@AfterMethod\n" +
                "@AfterClass\n" +
                "@AfterTest\n" +
                "@AfterSuite\n");
        add("Some of the common assertions provided by testNG are-\n" +
                "1.\tassertEquals(String actual, String expected, String message) and other overloaded data types in parameter\n" +
                "2.\tassertNotEquals(double data1, double data2, String message) and other overloaded data types in parameter\n" +
                "3.\tassertFalse(boolean condition, String message)\n" +
                "4.\tassertTrue(boolean condition, String message)\n" +
                "5.\tassertNotNull(Object object)\n" +
                "6.\tfail(boolean condition, String message)\n" +
                "7.\ttrue(String message)\n");
        add("By setting the “enabled” attribute as false, we can disable a test method from running.\n" +
                "//In case of a test method\n" +
                "@Test(enabled = false)\n" +
                "public void testMethod1() {\n" +
                "  //Test logic\n" +
                "}\n" +
                "\n" +
                "\n" +
                "//In case of test method belonging to a group\n" +
                "@Test(groups = {\"NegativeTests\"}, enabled = false)\n" +
                "public void testMethod2() {\n" +
                "  //Test logic\n" +
                "}\n");
        add("Using dependsOnMethods parameter inside @Test annotation in TestNG \n" +
                " we can make one test method run only after the successful execution of the dependent test method.\n" +
                " @Test(dependsOnMethods = { \"preTests\" })\n");
        add("We can define the priority of test cases using the “priority” parameter in @Test annotation. \n" +
                " The tests with lower priority value will get executed first. Example-\n" +
                "@Test(priority=1)\n");
        add("The default priority of a test when not specified is integer value 0. \n" +
                " So, if we have one test case with priority 1 and one without any priority then the test without any priority value will get executed first \n" +
                "(as default value will be 0 and tests with lower priority are executed first).");
        add("Using invocationCount parameter and setting its value to an integer value, makes the test method to run n number of times in a loop.\n" +
                "@Test(invocationCount = 10)\n" +
                "public void invocationCountTest(){\n" +
                "   //Test logic\n" +
                "}\n");
        add("The threadPoolSize attribute specifies the number of threads to be assigned to the test method. This is used in conjunction with invocationCount attribute. \n" +
                " The number of threads will get divided with the number of iterations of the test method specified in the invocationCount attribute.\n" +
                "@Test(threadPoolSize = 5, invocationCount = 10)\n" +
                "public void threadPoolTest(){\n" +
                "   //Test logic\n" +
                "}\n");
        add("Soft assertions (SoftAssert) allows us to have multiple assertions within a test method, even when an assertion fails the test method continues with the remaining test execution. \n " +
                "The result of all the assertions can be collated at the end using softAssert.assertAll() method.\n" +
                "@Test\n" +
                "public void softAssertionTest(){\n" +
                "   SoftAssert softAssert= new SoftAssert();\n" +
                " \n" +
                "   //Assertion failing\n" +
                "   softAssert.fail();\n" +
                "   System.out.println(\"Failing\");\n" +
                "\n" +
                "   //Assertion passing\n" +
                "   softAssert.assertEquals(1, 1);\n" +
                "   System.out.println(\"Passing\");\n" +
                "\n" +
                "   //Collates test results and marks them pass or fail\n" +
                "   softAssert.assertAll();\n" +
                "}\n" +
                "Here, even though the first assertion fails still the test will continue with execution and print the message below the second assertion.\n" +
                "Hard assertions on the other hand are the usual assertions provided by TestNG. In case of hard assertion in case of any failure, the test execution stops, \n " +
                "preventing the execution of any further steps within the test method.\n");
        add("We can use the timeOut attribute of @Test annotation. The value assigned to this timeOut attribute will act as an upperbound, \n" +
                " if test doesn’t get executed within this time frame then it will fail with timeOut exception.\n" +
                "@Test(timeOut = 1000)\n" +
                "public void timeOutTest() throws InterruptedException {\n" +
                "   //Sleep for 2sec so that test will fail\n" +
                "   Thread.sleep(2000);\n" +
                "   System.out.println(\"Will throw Timeout exception!\");\n" +
                "}\n");
        add("Using SkipException, we can conditionally skip a test case. On throwing the skipException, \n " +
                "the test method is marked as skipped in the test execution report and any statement after throwing the exception will not get executed.\n" +
                "@Test\n" +
                "public void testMethod(){\n" +
                "  if(conditionToCheckForSkippingTest)\n" +
                " throw new SkipException(\"Skipping the test\");\n" +
                "  //test logic\n" +
                "}\n");
        add("Using “alwaysRun” attribute of @Test annotation, we can make sure the test method will run even if the test methods or groups on which it depends fail or get skipped.\n" +
                "@Test\n" +
                "public void parentTest() { \n" +
                "  Assert.fail(\"Failed test\");\n" +
                "}\n" +
                "\n" +
                "@Test(dependsOnMethods={\"parentTest\"}, alwaysRun=true) \n" +
                "public void dependentTest() { \n" +
                "  System.out.println(\"Running even if parent test failed\");\n" +
                "}\n" +
                "Here, even though the parentTest failed, the dependentTest will not get skipped instead it will executed because of “alwaysRun=true”. \n" +
                " In case, we remove the “alwaysRun=true” attribute from @Test then the report will show one failure and one skipped test, \n" +
                " without trying to run the dependentTest method.\n");
        add("Using @Parameter annotation and ‘parameter’ tag in testng.xml we can pass parameters to test scripts.\n" +
                "Sample testng.xml –\n" +
                "<suite name=\"sampleTestSuite\">\n" +
                "   <test name=\"sampleTest\">   \n" +
                "      <parameter name=\"sampleParamName\" value=\"sampleParamValue\"/>\n" +
                "      <classes>\n" +
                "         <class name=\"TestFile\" />\n" +
                "      </classes>      \n" +
                "   </test>\n" +
                "</suite>\n" +
                "\n" +
                "Sample test script-\n" +
                "public class TestFile {\n" +
                "   @Test\n" +
                "   @Parameters(\"sampleParamName\")\n" +
                "   public void parameterTest(String paramValue) {\n" +
                "      System.out.println(\"Value of sampleParamName is - \" + sampleParamName);\n" +
                "   }\n");
        add("Using @DataProvider we can create a data-driven framework in which data is passed to the associated test method and multiple iterations \n" +
                " of the test run for the different test data values passed from the @DataProvider method. The method annotated with @DataProvider annotation return a 2D array of object.\n" +
                "//Data provider returning 2D array of 3*2 matrix\n" +
                " @DataProvider(name = \"dataProvider1\")\n" +
                "   public Object[][] dataProviderMethod1() {\n" +
                "      return new Object[][] {{\"kuldeep\",\"rana\"}, {\"k1\",\"r1\"},{\"k2\",\"r2\"}};\n" +
                "   }\n" +
                "\n" +
                "   //This method is bound to the above data provider returning 2D array of 3*2 matrix\n" +
                "   //The test case will run 3 times with different set of values\n" +
                "   @Test(dataProvider = \"dataProvider1\")\n" +
                "   public void sampleTest(String s1, String s2) {\n" +
                "      System.out.println(s1 + \" \" + s2);\n" +
                "   }\n");
        add(" TestNG provides us different kinds of listeners using which we can perform some action in case an event gets triggered. \n" +
                " Usually, testNG listeners are used for configuring reports and logging. One of the most widely used listeners in testNG is ITestListener interface. \n " +
                "It has methods like onTestSuccess, onTestFailure, onTestSkipped etc. We need to implement this interface creating a listener class of our own. \n" +
                " After that using the @Listener annotation we can use specify that for a particular test class our customized listener class should be used.\n" +
                "@Listeners(PackageName.CustomizedListenerClassName.class)\n" +
                "\n" +
                "public class TestClass { \n" +
                "    WebDriver driver= new FirefoxDriver();@Test \n" +
                "    public void testMethod(){\n" +
                "    //test logic\n" +
                "    }\n" +
                "} \n");
        add("@Factory annotation helps in the dynamic execution of test cases. Using @Factory annotation we can pass parameters to the whole test class at run time. \n" +
                " The parameters passed can be used by one or more test methods of that class.\n" +
                "Example – there are two classes TestClass and the TestFactory class. Because of the @Factory annotation, \n" +
                " the test methods in class TestClass will run twice with the data “k1” and “k2”\n" +
                "public class TestClass{\n" +
                "    private String str;\n" +
                " \n" +
                "    //Constructor\n" +
                "    public TestClass(String str) {\n" +
                "        this.str = str;\n" +
                "    }\n" +
                " \n" +
                "    @Test\n" +
                "    public void TestMethod() {\n" +
                "        System.out.println(str);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "public class TestFactory{\n" +
                "    //The test methods in class TestClass will run twice with data \"k1\" and \"k2\"\n" +
                "    @Factory\n" +
                "    public Object[] factoryMethod() {\n" +
                "        return new Object[] { new TestClass(\"K1\"), new TestClass(\"k2\") };\n" +
                "    }\n" +
                "}\n");
        add("@Factory method creates instances of test class and run all the test methods in that class with a different set of data.\n" +
                "Whereas, @DataProvider is bound to individual test methods and run the specific methods multiple times.\n");
        add(" In order to run the tests in parallel just add these two key-value pairs inside the suite tag of the testng.xml file-\n" +
                "⦁\tparallel=”{methods/tests/classes}”\n" +
                "⦁\tthread-count=”{number of thread you want to run simultaneously}”.\n" +
                "<suite name=\"ArtOfTestingTestSuite\" parallel=\"methods\" thread-count=\"5\">\n");
    }};
}
