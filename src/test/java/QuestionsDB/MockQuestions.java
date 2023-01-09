package QuestionsDB;

import java.util.ArrayList;

public class MockQuestions {

    public static ArrayList<String> mockQuestions = new ArrayList<>(){{
        add("1. Tell me about OOP concepts.");
        add("2. How do you use encapsulation in your project?");
        add("3. How do you use polymorphism in your project?");
        add("4. Is overloading and overriding part of polymorphism?");
        add("5. What is multi level inheritance?");
        add("6. What type of inheritance is not supported by Java?");
        add("7. What do you understand about collections?");
        add("8. Tell me about super keyword");
        add("9. Find element vs Find elements");
        add("10. What exception will you get if there's no such element for find element vs find elements");
        add("11. Tell me about your framework ");
        add("12. How many projects you worked on? ");
        add("13. Difficulties on manual and automation testing ");
        add("14. How many test cases have you designed? ");
        add("15. What is the difference between regression and retesting? ");
        add("16. What is the variables in Java?");
        add("17. Access modifiers ");
        add("18. Where did you use inheritance?");
        add("19. What are the types of inheritance?");
        add("20. Can we make constructor private ");
        add("21. What is constructor?");
        add("22. Super, this keyword? ");
        add("23. Can we call super and this at the same time? ");
        add("24. What exceptions do you get mostly?");
        add("25. How do you handle exceptions? ");
        add("26. What is the difference between throw and throws?");
        add("27. What is the difference between checked and unchecked exception?");
        add("28. What is finally? ");
        add("29. What is the list interface?");
        add("30. What is the garbage collector?");
        add("31. How can we call gc?");
        add("32. What are the locators in selenium? ");
        add("33. Difference between xpath and css?");
        add("34. What are the waits?");
        add("35. What is thread.sleep?");
        add("36. Exceptions in selenium?");
        add("37. Tell me about Assertions, what kinds of Assertions do you use? ");
        add("38. What is Jira?");
        add("39. TestNG advantages?");
        add("40. TestNG annotations? ");
        add("41. What is the workflow? ");
        add("42. Bug life cycle? ");
        add("43. Maven cycle?");
        add("44. What is central deposits? ");
        add("45. What do you need verify in API?");
        add("46. HTTP methods? ");
        add("47. Ad hoc testing?");
        add("48. Levels of testing?");
        add("49. How do you get attribute?");
        add("50. What do you do when you have conflict with developer?");
        add("51. How do you send data to service with a POST call?");
        add("52. What is the thread life cycle?");
        add("53. How to stop thread?");
        add("54. JBDC?");
        add("55. Which dependencies do you have in your pom.xml file?");
        add("56. How do you handle popups in Selenium?");
        add("57. How do you like Selenium version 3? Is Selenium 3 drastically different from Selenium 2");
        add("58. How to read properties files in selenium");
        add("59. super interface in selenium");
        add("60. how to check boxes in Selenium");
        add("61. assert vs verify in selenium");
        add("62. Maven cycle thread safe steps");
        add("63. method overloading and overriding in selenium");
        add("64. How to connect excel sheet to java");
        add("65. Jira workflow ( colors?)");
        add("66. Testng annotations");
        add("67. Do you know typecasting? What is casting?");
        add("68. testng group execution order");
        add("69. Assert method examples");
        add("70. JUnit annotation");
        add("71. Maven life cycle");
        add("72. Central repository");
        add("73. maven version command  selenium");
        add("74. build profile annotation in cucumber");
        add("75. types of hooks");
        add("76. git commit command");
        add("77. how to upload data in jenkins");
        add("78. GIT init command ");
        add("79. API testing is ");
        add("80. API what needs to be verified ");
        add("81. How do we send attachments to do test cases");
        add("82. implicit wait vs explicit wait");
        add("83. write the syntax of explicit wait ");
        add("84. create an object of actions and use movetoelement method ");
        add("85. if you want to scroll down on the screen - how do you perform that action?");
        add("86. What is the difference between Hashtable and TreeMap?");
        add("87. how to set priority for test cases");
        add("88. how to set priority in JUnit");
        add("89. Ignore the Test in TestNG");
        add("90. why do we use parameterization selenium");
        add("91. difference between scenario and scenario outline in selenium");
        add("92. Page Object Model - what is it?");
        add("93. What is the difference between HashMap and TreeMap?");
        add("94. maven repository types in selenium");
        add("95. what is remote repository ");
        add("96. What is JSON");
        add("97. difference put and patch");
        add("98. What GIT commands are you familiar with");
        add("99. What is GIT fetch used for");
        add("100. What is the use of Jenkins?");
    }};

    public static ArrayList<String> mockAnswers = new ArrayList<>(){{
        add(" There are 4 OOP concepts:\n" +
                "Abstraction: Helps represent complex underlying code by using simple things\n" +
                "like objects, classes, and variables. It allows us to hide the details of \n" +
                "the implementation, while only showing the functionality.\n" +
                "Inheritance: Is the act of a parent class passing down it's properties to a child class, so that the child can use them as well.\n" +
                "Polymorphism: Changing the behavior of an object depending on how it's created.\n" +
                "Encapsulation: The act of hiding data so that the data can only be accessed from inside that class.\n" +
                "We use getters and setters to interact with encapsulated data.");
        add(" We use encapsulation for POJO/Beans, we can make all data private and set them \n" +
                "with our request builder class.");
        add(" We use polymorphism in our assert class, we overload methods every day.");
        add("Yes, they are both part of Polymorphism since they both change how something behaves.");
        add(" Multi level inheritance is when a child class extends another child class.");
        add(" Multiple inheritance is not supported by Java. That's when one class inherits more than one parent class.");
        add(" Collections is a framework in Java that holds various interfaces. \n" +
                "It's top level interfaces are: Collection, Map, and Iterator \n" +
                "Under Collection we have List, Set, and Queue. \n" +
                "Under Map we have SortedMap\n" +
                "And under Iterator we have ListIterator.\n" +
                "We use these interfaces everyday when working with Java.");
        add(" super keyword refers to superclass (parent) objects. It's used to call superclass methods, and to access\n" +
                "the superclass constructor. We see it used to clear up confusion between subclasses and superclasses \n" +
                "that have methods with the same name.");
        add(" Find element will look for one element, find elements will look for multiple elements, and make a list of them.");
        add(" Find element will throw a NoSuchElementException, while find elements will return an empty list. \n" +
                "If you try to use an element that doesn't exist in the list you'll get IndexOutOfBoundsException.");
        add(" My framework is a Cucumber BDD Maven framework. Java is the scripting language, and we use Rest Assured library \n" +
                "to connect the web services, Junit for assertions to validate the actual results vs expected ones. \n" +
                "We use Gherkin language to write our scenarios in feature files. It also helps others to understand our scenarios. \n" +
                "In Cucumber report we attach the response and request to analyze all seps and data (request and response) in organized ways. \n" +
                "Runner class is where I control what scenario to run. \n" +
                "ReusableMethods (FunctionLibrary) class is where I keep my reusable methods. \n" +
                "RequestBuilder package is where I keep all my Java classes that I use to create request data during runtime.\n" +
                "Properties file I keep credentials like service URI, Database URL, username, passwords. \n" +
                "TestBase class, I read all this data and load the properties object, then other classes extends the TestBase class\n" +
                "(which is accomplished using inheritance) and use all the data in the properties object.");
        add("12. ");
        add(" For manual testing difficulties, the first thing that comes to mind is the higher chance of risk associated with it, \n" +
                "It's harder to catch bugs when we don't have the tools to compare actual vs expected. \n" +
                "For automation I think it's test scalability, there's a lot of variables that can change like browser type, resolution, \n" +
                "OS, etc. Which can make things difficult while working on an expanding application. \n" +
                "Synchronizing events can also become a challenge. ");
        add("14. ");
        add(" Regression and retesting are really only similar in the fact that regression will be executed multiple times.\n" +
                "Retesting is the act of testing something again after the dev has fixed it and sent it back to the tester.\n" +
                "Regression testing is a big sweeping test that checks for any defects that may have popped up due to changes in the program.");
        add(" Variables in Java are what we use to hold data. There are 8 types of primitive variables that belong to Java, and aren't user defined.\n" +
                "byte\n" +
                "short\n" +
                "int\n" +
                "long\n" +
                "boolean\n" +
                "double\n" +
                "float\n" +
                "char\n" +
                "String");
        add(" There are 4 access modifiers in Java:\n" +
                "private: sets the access to private so that it is not accessible outside of the class.\n" +
                "public: can be accessed from anywhere inside the project.\n" +
                "protected: can only be accessed inside the same package, or a subpackage.\n" +
                "default: can only be accessed inside the same package.");
        add(" We use inheritance in our TestBase class, it takes the information from he properties file\n" +
                "and loads it, then other classes will extend TestBase class where we can use all the data.");
        add("There are 4 types of inheritance:\n" +
                "Single: single base class and single derived class\n" +
                "Hierarchical: When a class has more than one child class\n" +
                "Multiple: Inheriting multiple super classes (not possible, only possible with interfaces)\n" +
                "Multilevel: When you extend a class that already extends another class.");
        add(" You can make constructor private, we do that as part of the Singleton design pattern\n" +
                "It's used when you don't want any other class to make an object of that class, in my framework we\n" +
                "use singleton design as part of our driver class, so we don't have multiple instances of drivers running at the same time.");
        add(" Constructor is a block of code responsible for initializing an object of a class.");
        add(" Super is used to access methods of the parent class\n" +
                "While this is used to poin ot methods of the current class.\n" +
                "this keyword is reserved in java, so we can't use it as an identifier.\n" +
                "Used to refer to current class's instance, as well as staic members.");
        add(" No, we can't use both of them in the same constructor. They can't be executed simultaneously.");
        add(" The most common exceptions I get are:\n" +
                "NoSuchElementException\n" +
                "ArrayIndexOutOfBoundsException\n" +
                "NullPointerException\n" +
                "NoSuchFrameException");
        add(" I handle checked exceptions using a try/catch block, but unchecked exceptions are handled by me figuring out\n" +
                "what is going wrong and fixing it in code.");
        add(" throws is used to pass the responsibility of the exception up to he function signature, \n" +
                "We can declare multiple exceptions in the signature separated by a comma, if the exception matches any\n" +
                "of the exceptions in the signature, then that exception is thrown automatically.\n" +
                "throw is used to explicitly throw an exception, it can only throw one exception at a time.\n" +
                "the syntax of throw includes the instance of the Exception to be thrown. You have to follow the exception with a variable name.");
        add(" A checked exception is something that happens at compile time, and can be handled with a try/catch block or a throws keyword in the signature\n" +
                "while an unchecked exception is caught at runtime and is due to an issue with the way the program was written, and there is nothing to be done about it, except fixing the issue in the code.");
        add(" Finally keyword is used at the end of a try/catch block. It is telling Java that no matter what the result of the \n" +
                "try/catch block was, you need to execute this block at the end of it.");
        add("List interface is an interface that extends Collections, it holds:\n" +
                " ArrayList\n" +
                " LinkedList\n" +
                " Vector ");
        add(" Garbage collector is a function in Java whose purpose is to clean up unused items in the heap memory\n" +
                "It's automatic and we don't have to call it for it to work, even if we do invoke it, we can't force it to run.");
        add(" We call garbage collecter like this:\n" +
                "System.gc()");
        add(" Locators are how we identify elements in Selenium. There are 8 types of locators:\n" +
                "id\n" +
                "name\n" +
                "className\n" +
                "tagName\n" +
                "linkText\n" +
                "partialLinkText\n" +
                "CssSelector\n" +
                "xpath");
        add("xpath can maneuver both forwards and backwards, while CSS can only move forwards.");
        add(" Waits are used to tell WebDriver to wait for something.\n " +
                "There are two types of waits that we use, implicit and explicit.\n" +
                "Explicit wait belongs to a single element and we can give it conditions, like wait for element to be clickable\n" +
                "Implicit wait belongs to the whole class, and has no conditions, you just set the max time for an element to be loaded.\n" +
                "Implicit waits are better when it doesn't matter if any elements load slow or fast, \n" +
                "But explicit waits are better for control over the execution, we can give conditions to each individual element.");
        add("Thread.sleep method is used to pause the execution of the current thread for a specified amount of time.");
        add(" Some  exceptions that come from Selenium are:\n" +
                "NoSuchWindowException\n" +
                "NoSuchElementException\n" +
                "NoSuchFrameException\n" +
                "ElementNotVisibleException\n" +
                "NoAlertPresentException\n" +
                "ElementNotSelectableException\n" +
                "InvalidSelectorException");
        add(" Assertions are a way to check expected values against actual values. There are different types of \n" +
                "assertions that we can use depending on what we want to do. Assertions that I use are: \n" +
                "assertEquals <- Checks if both expected and actual values are equal to eachother\n" +
                "assertNotNull <- asserts that the value we pass into the method is not null\n" +
                "assertTrue     <- asserts weather a boolean condition is true \n" +
                "assertFalse    <- asserts weather a boolean condition is false\n" +
                "assertNotEquals  <- asserts the two values are not equal to eachother");
        add(" Jira is a bug tracking, and project management software that helps with managing big projects,\n" +
                "it gives us a lot of tools to help with daily activities at work. We can track bugs, see what work \n" +
                "needs to be done, what work will need to be done in the future, what work has been completed, who certain work is assigned to, etc.");
        add(" TestNg advantages include things like: \n" +
                "Grouping tests \n" +
                "Dependency test configuration\n" +
                "Test prioritization");
        add(" Annotations in TestNG in hierarchical order:\n" +
                "@BeforeSuite\n" +
                "@BeforeTest\n" +
                "@BeforeClass\n" +
                "@BeforeMethod\n" +
                "@Test\n" +
                "@AfterMethod\n" +
                "@AfterClass\n" +
                "@AfterTest\n" +
                "@AfterSuite");
        add(" Workflow is a series of steps that are needed to complete a task. \n " +
                "For example a single-step workflow for API testing would be executing a single API request.\n" +
                "A multi-step workflow would be executing POST to create a resource, and then executing GET to check if the \n" +
                "resource retrieves the data, then execute PATCH request to update the data, then call GET again to verify.");
        add(" Bug life cycle is all the states a bug goes through in it's life cycle. \n" +
                "New\n" +
                "Rejected\n" +
                "Open\n" +
                "Deferred\n" +
                "Fixed\n" +
                "Retest\n" +
                "Reopen" +
                "Closed");
        add(" " +
                "    Clean - During this phase, the project is cleaned (for a fresh build & deployment)\n" +
                "    Site - this phase generates the project's java documentation.\n" +
                "    Default - this phase handles the project's complete deployment.\n");
        add("44. ");
        add("  The most common thing to validate is the status code in the response, but depending on the requirements\n" +
                "                we can go a lot deeper, we can validate the response payload, like making sure the body is valid, and all field names, types, etc are correct.\n" +
                "                We can validate response headers, verify the amount of time it took for the operation to complete, etc.");
        add(" . POST creates new records, body is required\n" +
                "GET  reads and retrieves data, body is not required. \n" +
                "PUT updates/replaces existing data, body required.\n" +
                "PATCH is a partial update/modification to existing data, requires body.\n" +
                "DELETE deletes and removes the resource, can have a body, but is optional.");
        add("  It's an informal/unstructured way to test software, it's done randomly and is usually unplanned, it doesn't follow any documentation.\n" +
                "It's goal is to find defects by randomly checking the application. Defects found during ad hoc will not be bound to test cases.");
        add("  Unit testing - done by developers, it's the first level of testing.\n" +
                "Integration testing - combining different modules and testing as a group to make sure the integrated system is ready for System testing.\n" +
                "System testing - is the last test before we move to acceptance testing, it's the act of\n" +
                "all the components of the software being tested in order to make sure the overall product meets the specified requirements.\n" +
                "It involves load, reliability, performance, and security testing.\n" +
                "Acceptance testing - the last level of testing. Evaluates weather the system complies with the end-user \n" +
                "requirements and if it's ready for deployment.");
        add(" We can get any attribute of an element by passing the element to the getAttribute method, \n" +
                "the syntax looks like this: elementName.getAttribute(\"attributeName\")");
        add(" I'd try to identify why we're having conflict, make sure to listen and assess the situation carefully. \n" +
                "It depends on what the conflict is about, but in general I'd just try to make sure to listen to their side.");
        add(" For huge set of data (which is more than 50 elements) we keep that data in external files,\n" +
                "then read the file and convert it to string and submit the data as string.\n" +
                "For small data that we create data during runtime I use encapsulation concept of Java. I\n" +
                "create a private variable for each element in my request data, and add setter and getter\n" +
                "methods. When I submit a post call and instantiate that class by using setter methods, and I\n" +
                "pass value to each element. Those values are coming from my feature file. At the end I pass\n" +
                "that Java object to body() method which is coming Rest Assured and submit it.");
        add(" There are 5 stages in a thread's life cycle:\n" +
                "1. New - code hasn't been run yet, so the Thread hasn't been executed.\n" +
                "2. Active - Once a thread invokes the start() method, it moves from new to active state.\n" +
                "             active stage contains two states within it, Runnable and Running. \n" +
                "3. Blocked/Waiting - Whenever a thread is inactive for a certain amount of time then it's either \n" +
                "                     in the blocked or the waiting state. \n" +
                "4. Timed waiting - avoids starvation of threads, a real world example of timed waiting is invoking the sleep() method.\n" +
                "                   it will put the thread in a timed wait state, after the time is up then the thread wakes and resumes execution.\n" +
                "5. Terminated - A thread will be terminated for the following reasons: When it's job is finished,\n" +
                "                or abnormal termination, when some unusual event causes the termination, such as an unhandled exception. ");
        add(" We can use Thread.interrupt() method, it will most likely terminate the thread,\n" +
                "another way is to use a boolean flag that will get set to true when we want to terminate the thread.");
        add(" Java database connectivity (JDBC) \n" +
                " is the JavaSoft specification of a standard application programming interface (API) that allows Java programs to access database management systems");
        add(" ● io.RestAssured- automate Restful APIs.\n" +
                "● Junit- write and run repeatable automated tests.\n" +
                "● Commons-io- work with files\n" +
                "● Jackson-databind- serialize and deserialize the data.\n" +
                "● Cucumber-junit-\n" +
                "● Cucumber-java-\n" +
                "● Maven-compiler-compile the source code of Maven project\n" +
                "● Json-schema-validator- validate schema of JSON\n" +
                "● Json-path- extract specific value of JSON.\n" +
                "● Maven-cucumber-reporting- produce reports what scenarios passed or failed.");
        add(" We handle popups with the Alert class. We can assign driver.switchTo.alert() to an object of Alert class\n" +
                "and then use that object to handle alerts. The syntax is below: \n" +
                "Alert myAlert = driver.switchTo().myAlert();\n" +
                " click on cancel button: myAlert.dismiss;\n" +
                "click on ok button: myAlert.accept();\n" +
                "get the alert message text: myAlert.getText();\n" +
                "send keys to alert message: myAlert.sendKeys(\"Text\")");
        add(" ● Selenium 3 has bug fixes from selenium 2 also it is more mobile automation\n" +
                "focused.\n" +
                "● Mozilla have made changes to Firefox that mean that from Firefox 48 you must\n" +
                "use their geckodriver to use that browser, regardless of whether you're using\n" +
                "Selenium 2 or");
        add(" We have to user the Java Filereader, and set the path of the properties file. Syntax below:\n" +
                "FileReader reader = new FileReader(\"file path\")\n" +
                "Then we have to load the File into the properties by using the load method, syntax is below:\n" +
                "Properties props = new Properties()\n" +
                "props.load(reader);");
        add(" The super most interface of Selenium is the SearchContext interface. It is extended by WebDriver and WebElement.\n" +
                "The methods that come from SearchContext are findElements, and findElement");
        add(" For checkboxes all we need to do is make sure we're identifying a box with an input tag, and then we can do a normal click on them.");
        add(" Hard assertions will stop executing the test if one assertion is not met. Soft assertions, or verifications \n" +
                "will not halt the execution if one is not met. ");
        add("62.");
        add(" We overload in Selenium by using Assert class.\n" +
                "We override different Selenium methods to better fit with our framework, for example\n" +
                "overriding the isDisplayed() method to return true if the title and the url are both displaying correctly.");
        add(" We can do that by reading the excel sheet's data into java, we do this with Apache POI.\n" +
                "We'll have to add the required jar files for reading files, and then create a FileInputStream object,\n" +
                " example below:\n" +
                "FileInputStream fis=new FileInputStream(new File(\"C:\\\\demo\\\\student.xls\"));\n" +
                "Then we need to create a new HSSFWorkbook object to refer to the above file,\n" +
                "HSSFWorkbook wb=new HSSFWorkbook(fis);\n" +
                "Afer that we need a Sheet object to retrieve the workbook, \n" +
                "HSSFSheet sheet=wb.getSheetAt(0);");
        add(" To Do (Blue)\n" +
                "In Progress (Yellow)\n" +
                "Done (Green)");
        add(" The TestNG annotations in order are:\n" +
                "@BeforeSuite\n" +
                "@BeforeTest\n" +
                "@BeforeMethod\n" +
                "@BeforeClass\n" +
                "@Test\n" +
                "@AfterClass\n" +
                "@AfterMethod\n" +
                "@AfterTest\n" +
                "@AfterSuite");
        add("Auto-boxing → is converting a primitive value into an object of the corresponding wrapper class\n" +
                "Un-boxing → is a process when you take Wrapper class object and convert to primitive.\n" +
                "Assigning a value of one type to a variable of another type is known as Type Casting.");
        add(" If there is no priority assigned to the test cases, then TestNG will execute alphabetically. \n" +
                "Even with priority set right, you can't guarantee the order of execution, so if you really need to you\n" +
                "can set a dependency on another test. ");
        add(" Assert.assertEquals(10, 12)  <-- FAIL\n" +
                "Assert.assertNotEquals(10, 12) <-- PASS\n" +
                "Assert.true(10==12) <- FAIL\n" +
                "Assert.false(10==12) <- PASS");
        add("@Test\n" +
                "@Before\n" +
                "@Ignores\n" +
                "@BeforeClass\n" +
                "@After\n" +
                "@AfterClass");
        add(" The default Maven lifecycle consists of 8 major steps or phases for compiling, testing, building and installing a given Java project as specified below:\n" +
                "\n" +
                "    Validate: This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.\n" +
                "    Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.\n" +
                "    Test: It runs unit tests for the project.\n" +
                "    Package: This step packages the compiled code in distributable format like JAR or WAR.\n" +
                "    Integration test: It runs the integration tests for the project.\n" +
                "    Verify: This step runs checks to verify that the project is valid and meets the quality standards.\n" +
                "    Install: This step installs the packaged code to the local Maven repository.\n" +
                "    Deploy: It copies the packaged code to the remote repository for sharing it with other developers.");
        add(" A central repository is a singular storage location for all data within an organization.");
        add(" mvn-version command will return us the maven version currently installed.");
        add("74. ");
        add(" Cucumber only supports two types of hooks, Before and After.\n" +
                "@before hook gets executed before any other test scenarios, and @after gets executed after the scenario is executed. ");
        add(" The \"commit\" command is used to save your changes to the local repository. \n" +
                "Note that you have to explicitly tell Git which changes you want to include in a commit before running the \"git commit\" command. \n" +
                " This means that a file won't be automatically included in the next commit just because it was changed. ");
        add("You need to specify that the project is parameterized from the config page,\n" +
                "then you select File Parameter from the params dropdown, next you enter the upload location, and choose what file to upload.");
        add(" GIT init command is used to create a new GIT repository, it can either be used to convert an existing, unversioned project\n" +
                "to a Git repo, or it can initialize a new, empty repository. Since most other Git commands\n" +
                "aren't available outside of an initialized repo, this is usually the first command that is run when creating a project.");
        add(" API testing is essentially testing the layer of the application that the user can not see, it's testing all of our logic\n" +
                "and everything that is happening behind the scenes.");
        add(" The most common thing to verify is the response status code. But validatation can go as deep as is required.\n" +
                "for example, we can validate content type, JSON schema, we can validate the body, \n" +
                "we can validate the request headers, and request URL.  ");
        add("81.");
        add(" Implicit wait is not specific to one element, it is not dynamic and we can't give it conditions, it is just \n" +
                "telling Selenium to wait for a specified amount of time if an element is not showing up, and if the time runs out before\n" +
                "it can locate the element, it will fail the step. Syntax:\n" +
                "driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);\n" +
                "Explicit wait is specific to elements, we can give it conditions, for example tell it to wait until the element is clickable. \n" +
                "You can put an explicit wait on as many elements as you want. Syntax:\n" +
                "WebDriverWait wait = new WebDriverWait(driver,30);\n" +
                "wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(\"//a[2]/li[4]\")))\n" +
                "wait.until(ExpectedConditions.titleIs(title))");
        add(" WebDriverWait wait = new WebDriverWait(driver, 30);\n" +
                "wait.until(ExpectedConditions.titleIs(title))\n" +
                "wait.until(ExpectedConditions.elementToBeClickable(element))\n" +
                "wait.until(ExpectedConditions.visibilityOfElementLocated(element))");
        add(" Actions act = new Actions(driver);\n" +
                "act.moveToElement(element).build().perform();");
        add(" There are a couple ways to scroll, you can either move to a specific element, or you can manually scroll using PAGE_UP or PAGE_DOWN\n" +
                " Actions act = new Actions(driver)\n" +
                "act.moveToElement(element).build().perform();\n" +
                "act.sendKeys(Keys.PAGE_DOWN).build().perform();");
        add(" Hashtable and TreeMap both implements Map interface and looks similar, however, there is\n" +
                "the following difference between HashMap and TreeMap.\n" +
                "TreeMap can have multiple null values but Hashtable cannot have any null values. Both\n" +
                "Hashtable and TreeMap cannot have any null key.\n" +
                "TreeMap is not synchronized but Hashtable is synchronized .");
        add(" We can set priority using (priority = x) next to the @Test annotation.");
        add(" There isn't a great way to set priority in JUnit, there are workarounds but if priority is important, then TestNG is superior.\n" +
                "If you want a way around it in JUnit you need to use the @FixMethodOrder annotation, and sort alphabetically.");
        add(" You can ignore tests by adding (enabled = false) next to the @Test annotation. ");
        add(" Parameterization helps cut down drastically on duplicate and un-needed extra code and work.\n" +
                "Why would I want to write out 10 test cases individually that are 90% the same when only the data is changing?\n" +
                "For example, with parameterization I can run 5 scenarios by only writing out the amount of code that one scenario would take,\n" +
                "it makes life a lot easier when all we have to do is change the data that is being passed.");
        add(" Scenario is used for one scenario, for example logging in with the wrong user name and wrong password.\n" +
                "Scenario outline is used to outline multiple scenarios in one block of code using data tables.\n" +
                "For example if I'm testing error messages on logging in with different types of invalid credentials,\n" +
                "I would have a table with username, password, and error message columns. Each row would represent one test case.\n" +
                "I can now pass all the data into each test case with ease instead of manually writing out 5 different scenarios that are very similar.");
        add(" POM is a design pattern used in web design. It helps organize the web pages we work with, and creates an object repository for storing all web elements.\n" +
                "It helps reduce code duplication and improves test case maintenance. We can think about each web page being it's own class file.");
        add(" HashMap and TreeMap both implements Map interface and looks similar, however, there is\n" +
                "the following difference between HashMap and TreeMap.\n" +
                "1. HashMap allows one null key whereas TreeMap doesn’t allow any null key. But both can\n" +
                "have multiple null values\n" +
                "2. HashMap maintains no order but TreeMap maintains ascending order of elements.");
        add(" There are only two Maven repo types, local and remote.");
        add(" Remote repository is the central location where your project is stored on the internet or a server somewhere.");
        add(" JSON is a file type that stores and transports data, it stands for JavaScript Object Notation\n" +
                "It is often used when data is sent from a server to a web page.");
        add(" put is for updating entire entities, it will usually overwrite any missing fields to null.\n" +
                "whereas patch is used to partially update, and will not overwrite any missing data.");
        add(" • git add - adds a change in the working directory to the staging area.\n" +
                "• git status - displays the state of the working directory and the staging area \n" +
                "• git commit - Commit a snapshot of all changes in the working directory\n" +
                "• git push -  used to upload local repository content to a remote repository. \n" +
                "• git pull -  used to fetch and download content from a remote repository and immediately update the local repository to match that content.\n" +
                "git fetch - a primary command used to download contents from a remote repository, it will not automatically integrate changes into your local repo. \n" +
                "git clone - primarily used to point to an existing repo and make a clone or copy of that repo at in a new directory, at another location.");
        add(" A primary command used to download contents from a remote repository, it will not automatically integrate changes into your local repo.");
        add(" It is used to continually create and test software projects, making it easier for developers and DevOps engineers to integrate changes to the project and for consumers to get a new build.");


    }};

}
