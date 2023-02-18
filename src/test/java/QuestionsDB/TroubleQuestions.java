package QuestionsDB;

import java.util.ArrayList;

public class TroubleQuestions {
    public static ArrayList<String> troubleQuestions = new ArrayList<>(){{
        add("1. Maven lifecycle?");
        add("2. Bug life cycle");
        add("3. Life cycle of a thread?");
        add("4. TestNG annotation sequence?");
        add("5. What is JSON?");
        add("6. How to read data from properties file?");
        add("7. How to connect an excel file to Java? ");
        add("8. Levels of testing?");
        add("9. Built-in maven build life cycle ");
    }};

    public static ArrayList<String> troubleAnswers = new ArrayList<>(){{
        add("There are 8 parts to the maven life cycle.\n" +
                "1. Validate: Checks if the project structure is correct\n" +
                "2. Compile: Compiles the source code, converts .java files to .class\n" +
                "3. Test: It runs unit tests for the project\n" +
                "4. Package: This step packages the compiled code in a distributable format like JAR or WAR\n" +
                "5. Integration Test: Runs the integration tests for the product\n" +
                "6. Verify: Checks to verify that the project is valid and meets the quality standards\n" +
                "7. Install: This step installs the packaged code to the local Maven repository\n" +
                "8. Deploy: Copies the packaged code to the remote repository for sharing with other developers.");
        add("Bug life cycle consists of 9 states.\n" +
                "1. New: This is the first stage of the bug\n" +
                "2. Assigned: This is when a newly created bug is assigned to the dev team\n" +
                "3. Open: This is where the dev has started to look at the bug, depending on their input the bug may be either\n" +
                "Duplicate, Deferred, Rejected, or not a bug.\n" +
                "4. Fixed: When the developer has finished the task of fixing a defect.\n" +
                "5. Pending Retest: The bug will stay in the pending retest phase until the tester has started work on\n" +
                "  retesting the bug.\n" +
                "6. Retest: This is when the tester starts the task of retesting the defect.\n" +
                "7. Reopen: If there is still an issue, then it will be reassigned to the dev again.\n" +
                "8. Verified: If the tester doesn't find any issue in the defect after it's assigned to the dev, then the bug is verified.\n" +
                "9. Closed: Defect doesn't exist any longer, then the tester can change the status to closed. ");
        add("A thread consists of 5 states, these states are:\n" +
                "1. New - The thread has just been created\n" +
                "2. Active - The thread is running\n" +
                "3. Blocked/Waiting - The thread is either blocked or in waiting\n" +
                "4. Timed Waiting - When a thread is waiting for a specified amount of time (Thread.sleep())\n" +
                "5. Terminated - Thread has been terminated.");
        add("Here is the sequence of TestNG annotations in order:\n" +
                "1. BeforeSuite\n" +
                "2. BeforeTest\n" +
                "3. BeforeClass\n" +
                "4. BeforeMethod\n" +
                "5. Test\n" +
                "6. AfterMethod\n" +
                "7. AfterClass\n" +
                "8. AfterTest\n" +
                "9. AfterSuite");
        add(" JSON stands for JavaScript Object Notation and it is a file format for storing and transporting data.");
        add(" You start by creating a FileReader object, and a Properties object. You can load the FileReader object\n" +
                "into the properties object by using the .load() method. Once we do that, we can use .getProperty method to access the data.");
        add("My company doesn't use Excel, but I know you have to create an object of XSSFWorkbook and then a sheet from XSSFSheet,\n" +
                "create rows and add cells to the sheet. I just haven't had much experience doing it.");
        add("There are 4 levels of testing:\n" +
                "Unit testing\n" +
                "Integration testing\n" +
                "System testing\n" +
                "Acceptance testing");
        add("There are 3 build-in build cycles in Maven:\n" +
                "1. Default - handles project deployment\n" +
                "2. Clean - handles project cleaning\n" +
                "3. Site - handles creation of the project's website.");
    }};
}
