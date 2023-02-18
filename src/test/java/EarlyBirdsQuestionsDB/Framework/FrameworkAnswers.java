package EarlyBirdsQuestionsDB.Framework;

import java.util.ArrayList;

public class FrameworkAnswers {
    public ArrayList<String> frameworkAnswers = new ArrayList<>(){{
        add("Key points: \n" +
                "1. Introduce yourself (Name)\n" +
                "2. Years of experience (optional: started with manual and moved to automation)\n" +
                "3. Methodologies: worked on Agile & some experience with Waterfall\n" +
                "4. Domains: Healthcare, Banking, Retail, Insurance, Marketing, etc.\n" +
                "5. Manual Experience and tools you have used: Jira, Excel, SQL, a little bit of experience with ALM\n" +
                "6. Automation experience: \n" +
                "IDE: Eclipse, Intellij (optional)\n" +
                "Testing tools: Selenium, Cucumber, TestNG, JUnit\n" +
                "API tools: Postman, Soap UI, RestAssured Libraries\n" +
                "Build tools: Maven Version Control\n" +
                "Remote Repo: Git, GitHub\n" +
                "CI & CD (Continuous Integration and Continuous Development) tools: Jenkins\n" +
                "7. Framework: BDD, Data Driven, and hybrid with POM\n" +
                "8. Types of testing you have performed: Smoke, regression, functional\n" +
                "9. Soft skills: Team player, and quick learner");
        add("2. My current project is with Liberty Mutual Insurance where I worked on the Customer Service application as a contractor.\n" +
                "Our application mainly deals with connecting the insurance customer representative,\n" +
                "and the customer. In my project we do automation with Selenium and Java as a scripting language using \n" +
                "Cucumber framework followed by POM design pattern. Our Cucumber framework consists of 3 main parts:\n" +
                "Feature files, step definitions, and test runner class. I develop test scrips using Java OOPS concepts of Java\n" +
                "and different types of JUnit and Cucumber annotations. Created multiple reusable functions and components\n" +
                "such as WebDriver waits to handle environment or synchronization errors.  Our regression process within my \n" +
                "company has been designed in a way that 80% of our regression test cases are automated, and the remaining 20%\n" +
                "is manually executed. We start automation only once the application is stable and no further changes need to be\n" +
                "made until next sprint. First, we pick all the P1 (priority 1) test cases from regression suite and will start \n" +
                "automating those scenarios. In cucumber framework we are maintaining all scenarios in the feature files.\n" +
                "We have two feature file packages, one for smoke scenarios, and one for regression scenarios. We are using\n" +
                "Jenkins for continuous integration, we commit our code in Git, and we mention the GIT location in Jenkins so that we\n" +
                "can trigger the build accordingly in Jenkins. In my project we follow Agile, and our sprints are 2 weeks long,\n" +
                "where daily stand ups are held, along with sprint planning, demo, and retro meetings. ");
        add("3. In my last project, I was part of developing a single framework for API and UI automation, along with 2 other members of my team. \n" +
                "We used Maven as a build tool and with the help of the POM file, we added all the dependencies and plugins that were required.\n" +
                "We applied Java as a programming language and used a hybrid model by using a combination of POM using page factory,\n" +
                "and BDD for UI, while using RestAssured libraries with BDD for API, as well as JDBC to connect with the data base.\n" +
                "We have 5 layers in the UI part of the application, and 4 on the API side. They're both basically the same structurally,\n" +
                "except API does not have any page object classes. The 4 mutual parts are:\n" +
                "1. Step Definitions\n" +
                "2. Feature Files\n" +
                "3. Utilities (where we hold things like reusable methods, config reader, ExcelUtility, etc.)\n" +
                "4. Test Runner class that we use to execute our test cases.\n" +
                "Then, UI has page object classes which we use to hold all the elements that are useful in our automation tests.\n" +
                "We also have a config_properties file that holds important data such as valid login credentials, URLs, Endpoints, and API keys for API automation.\n" +
                "We used Jenkins for continuous integration, and GIT for storing all the scripts at a central repo.");
        add("4. I start my day by reviewing emails and smoke test reports. I have my smoke tests scheduled to run at 7 AM, so that by the time\n" +
                "I'm online to work at 8:30 I have my reports ready to go over. By the time we have our stand up meeting, I have already made sure the application is up and running as it should be.\n" +
                "If any test cases failed, I'll analyze and look for the reason. If it's a scripting issue I'll be trying to debug my code to figure it out.\n" +
                "If the environment is down, I'll send an email to tech lead while also attaching a screen shot of the failure to the Dev channel on Slack.\n" +
                "If it's a defect and something happened like mismatched status codes, I'll first check the requirement, and then start discussing with other team members to find out \n" +
                "if they're able to replicate the issue. Then, I'd send an email to the dev to inform them. Then I'd log the defect.\n" +
                "For the rest of the day I'm automating test cases. I jus review and analyze the requirement document, and based on it I \n" +
                "will look for stories that I think will be good candidates for automation testing. I will prepare test data, write psuedo code, and implement \n" +
                "new elements and methods to the pages in the framework, so that the framework is updated and prepared for the test cases that will be testing the functionalities that are new to that sprint.\n" +
                "Depends on the day and the week, but also attend the different agile ceremonies: Standups, Sprint Grooming, Planning, Demo, Retro, and Test Team meetings. ");
        add("5. We faced issues with cross browser testing at my last position. Our test scripts ran fine in Chrome, but in IE browser, we faced \n" +
                "so many issues like time out/synchronization problems. We realized IE is a lot slower than Chrome for test execution, so we implemented\n" +
                "both explicit and implicit waits in our scripts, and also changed some xpath locators to CSS to hopefully help with the speed of locating elements. \n" +
                "Now, since we work in Agile and have a close knit team, I ask the developers to provide IDs for the elements they're working on.");
        add("6. Some things I've done to improve our performance include:\n" +
                "Created reusable methods to cut down on time spent performing actions with precise logic.\n" +
                "Wrote a locator to help handle dynamic elements\n" +
                "Provided data in external files such as excel, txt, and property files.\n" +
                "Refactored legacy code to improve regression performance, by removing most instances of Thread.sleep() and replacing them with explicit waits.");
        add("7. It all depends on the types of changes. For example, if any WebElements change, since I'm maintaining a POM design, all I have to do is update that 1 web element\n" +
                "in that particular page class. However, if existing functionality changes then whatever functions I have created relating to that functionality will\n" +
                "need to be updated according to the new changes.\n" +
                "Whenever there is a new change and it fails the test, that's when I will have to refine and modify my test scripts. ");
        add("8. My current framework is Cucumber based, so I would use Scenario Outline, DataTable (I wrote logic to retrieve data in List<Map> format\n" +
                "and Excel (reading using Apache POI and a for loop)\n" +
                "My first framework was based on TestNG so for that they would just use Excel (apache POI and data provider)");
        add("9. There's a few steps to what I would do. I'd start by: \n" +
                "First, analyzing the application. \n" +
                "Then I would choose my tools that I thought would be needed for the tasks I will be doing.\n" +
                "I would start creating and executing manual test cases\n" +
                "Then analyze those cases and determine which ones would be a good fit for automation\n" +
                "I'd create a smoke test and presesnt it to the team\n " +
                "Then, I'd start work on creating a test automation framework to allow easier execution of our automated tests.\n" +
                "Develop and execution plan.\n" +
                "Write my scripts\n" +
                "Take care of reporting, and then maintain the scripts that have been created.");
        add("10. Sure, there are 7 key parts in the automation life cycle:\n" +
                "1. Analyze the application \n" +
                "2. Select the tools you need\n" +
                "3. Identify the scenarios to be automated\n" +
                "4. Design test scripts\n" +
                "5. Modify test scripts\n" +
                "6. Run the test scripts\n" +
                "7. Report the defects");
        add("11. For that, I will use the Connection, Statement, and ResultSet interfaces.\n" +
                "I use the JDBC library to integrate Java by first getting a CONNECTION from the database\n" +
                "Then, create my STATEMENTS using SQL queries and then I store the data into a RESULTSET object.");
        add("12. I think about a few different criteria when deciding weather to automate a test case:\n" +
                "1. How high is the priority? If it's high, it's a better contender for automation.\n" +
                "2. Is the functionality critical? \n" +
                "3. Does it take an unreasonable amount of time to execute manually? Will I save time by automating?\n" +
                "4. The maturity of the page that the case belongs to, if it's not a mature page and I think it will change substantially, then I might hold off automation.");
        add("13. POM is a design pattern which is great for test automation, it helps enhance test maintencance, and reduces code duplication.\n" +
                "It's advantageous because if UI changes for a page, we don't have to change the tests themselves, just the code within the page object.\n" +
                "It helps with re-usability, maintainability, and readability.");
        add("14. Page Object Model is a design approach that says to organize page objects per page, in such a way that scripts and page objects can be differentiated easily.\n" +
                " Whereas Page Factory is one way to implement that design approach. \n" +
                "Page Factory allows us to initialize all elements by using initElemens() method. We use the @FindBy annotation in Page Factory to find elements,\n" +
                "while plain POM uses the 'By' locator.");
        add("15. FindElement: Is used to find a single element, and it's return type is a single web element.\n" +
                "@FindBy: One annotation in Page Factory model that is used to locate one or more WebElements using a single criteria.");
        add("16. We conduct Batch Testing when we run multiple scripts \n" +
                "In Cucumber, I use the @Tags options for running the batch of test cases. If I'm working with a framework that uses TestNG, I can also use @Groups annotation.");
        add("17. ChromeDriver, InternetExplorerDriver, & GeckoDriver. Most of the time we perform execution in IE and Chrome.");
        add("18. We use TestNG reports/Cucumber reports. Reporting is an important role in any project, at the end of the day everyone is interested in your reports, not your code.\n" +
                "We store the reports for inside our target folder, it acts an easily accessible place to locate our reports.\n" +
                "Cucumber reports have nice graphical representation, where testNG is more focused on raw data. It generates a test-output folder\n" +
                "and combines two kinds of reports: Detailed report, and summary report. Detailed report has information like \n" +
                "errors, groups, execution times, step-by-step logs, and the TestNG XML file. \n" +
                "Summary report is like the trimmed version of detailed, it gives information on the number of passed, failed, or skipped test cases. You can find it\n" +
                "in the emailable report file. ");
        add("19. Mostly I have automated functional regression tests, smoke, sanity, and regression. and we automate user stories during the sprint.\n" +
                "In my projects we were doing automation of the current sprint only after the sprint was over. ");
        add("20. Smoke testing is a routine testing practice that is responsible for checking the critical functionalities\n" +
                "It's purpose is to verify that critical parts of the application are working as expected, I do my smoke tests in the morning before I start the day,\n" +
                "so that I know all functionality is working as expected. It's useful because it gives results in a couple minutes, and let's us know \n" +
                "if the application is performing as it should.");
        add("21. Regression testing is how we verify that new changes introduced in the application has not affected the existing functionality by being integrated into the lower environments. \n" +
                " ");
        add("22.");
        add("23.");



    }};
}
