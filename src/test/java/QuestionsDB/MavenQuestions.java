package QuestionsDB;

import java.util.ArrayList;

public class MavenQuestions {

    public static ArrayList<String> mavenGITJenkinsQuestions = new ArrayList<>(){{
        add("#1 What are the Maven Phases?");
        add("#2 How do you make sure that all you team members are using the same Selenium version?");
        add("#3 What is POM.XML?");
        add("#4 What is effective POM.xml?");
        add("#5 What is a dependency and how do you handle them in your framework?");
        add("#6 What is a plugin? How do you add plugins in Maven?");
        add("#7 What type of version control do you use?");
        add("#8 The difference between local vs. remote repositories");
        add("#9 What are the GIT commands?");
        add("#10 How do you see who updated the class file using GIT?");
        add("#11 Where do you see history of a GIT project repository?");
        add("#12 What is the difference between commit and push?");
        add("#13 What is staging in GIT?");
        add("#14 What is Jenkins?");
        add("#15 How do you integrate Jenkins with Selenium?");
        add("#16 How do you integrate Jenkins with Selenium Grid?");
        add("#17 How do you create a maven job in Jenkins?");
        add("#18 How do you configure a job to send an email when Jenkins job execution is complete?");
        add("#19 How can you get the log of the reports in Jenkins?");
        add("#20 What is freestyle job?");
        add("#21 How do you know if your Jenkins build failed?");
        add("#22 What is default port for Jenkins?");

    }};
    public static ArrayList<String> mavenGITJenkinsAnswers = new ArrayList<>(){{
        add("Following are the phases:\n" +
                "• validate − validate the project is correct and all necessary information is available.\n" +
                "• compile − compile the source code of the project.\n" +
                "• test − test the compiled source code using a suitable unit testing framework. These\n" +
                "tests should not require the code be packaged or deployed\n" +
                "• package − take the compiled code and package it in its distributable format, such\n" +
                "as a JAR.\n" +
                "• integration-test − process and deploy the package if necessary into an\n" +
                "environment where integration tests can be run.\n" +
                "• verify − run any checks to verify the package is valid and meets quality criteria.\n" +
                "• install − install the package into the local repository, for use as a dependency in\n" +
                "other projects locally.\n" +
                "• deploy − done in an integration or release environment, copies the final package\n" +
                "to the remote repository for sharing with other developers and projects.");
        add("As a team, we can utilize Maven, which gives version and build control for team perspective. We\n" +
                "have the same version in pom.xml file.");
        add("POM stands for Project Object Model. The pom.xml file contains information of project\n" +
                "and project configuration information for maven to build the project such as\n" +
                "dependencies, build directory, source directory, test source directory, plugin, goals etc.\n" +
                "Maven reads the pom.xml file, then executes the goal.");
        add("The Effective POM does not exist on your filesystem per se, it's generated on-the-fly\n" +
                "whenever your run a Maven build.");
        add("Dependency is just a Jar file which will be added to the classpath while executing the tasks. I update the\n" +
                "dependencies in the POM.xml.\n" +
                "I am using dependencies in my framework because of compatibility issues.\n" +
                "For example, if the Selenium WebDriver version which I have integrated to my framework is not\n" +
                "supportive, I can simple update the dependency file as given below:\n" +
                "<dependency>\n" +
                "<groupId>org.seleniumhq.selenium</groupId>\n" +
                "<artifactId>selenium-java</artifactId>\n" +
                "<version>3.141.59</version>\n" +
                "</dependency>\n" +
                "Above, I can simple change the version according the compatibility.");
        add("Maven is a plugin execution framework, where every task is done by\n" +
                "plugins.\n" +
                "Maven Plugins are generally used to:\n" +
                "• create jar file\n" +
                "• create war file\n" +
                "• compile code files\n" +
                "• unit testing of code\n" +
                "• create project documentation\n" +
                "• create project reports" +
                "A plugin generally provides a set of goals, which can be executed using the following:\n" +
                "yoll mvn [plugin-name]:[goal-name]\n" +
                "\n" +
                "EXAMPLE OF PLUGIN:\n" +
                "\n<plugin>\n" +
                "<groupId>net.masterthought</groupId>\n" +
                "<artifactId>maven-cucumber-reporting</artifactId>\n" +
                "<version>4.4.0</version>\n" +
                "<executions>\n" +
                "<execution>\n" +
                "<id>execution</id>\n" +
                "<phase>verify</phase>\n" +
                "<goals>\n" +
                "<goal>generate</goal>\n" +
                "</goals>\n" +
                "<configuration>\n" +
                "<projectName>cucumber-jvm-example</projectName>\n" +
                "\n" +
                "<!-- output directory for the generated report -->\n" +
                "<outputDirectory>${project.build.directory}</outputDirectory>\n" +
                "<!-- optional, defaults to outputDirectory if not specified -->\n" +
                "<inputDirectory>${project.build.directory}</inputDirectory>\n" +
                "<jsonFiles>\n" +
                "<!-- supports wildcard or name pattern -->\n" +
                "<param>**/cucumber.json</param>\n" +
                "</jsonFiles>\n" +
                "<classificationFiles>\n" +
                "<!-- supports wildcard or name pattern -->\n" +
                "<param>sample.properties</param>\n" +
                "<param>other.properties</param>\n" +
                "</classificationFiles>\n" +
                "<!--<parallelTesting>false</parallelTesting>-->\n" +
                "</configuration>\n" +
                "</execution>\n" +
                "</executions>\n" +
                "</plugin>");
        add("I use maven for build generation and git for version control.\n" +
                "*Version Control is essential to development. If you make a mistake, it is a simple matter of rolling back\n" +
                "to a previous version of your code that you know works. This also frees you to explore and experiment\n" +
                "with your code because you are free of having to worry about whether what you are doing is reversible\n" +
                "or not.");
        add("Local repositories reside on the computers of team members\n" +
                "Remote repositories are hosted on a server that is accessible for all team members.");
        add("• git add\n" +
                "• git status\n" +
                "• git commit\n" +
                "• git push\n" +
                "• git pull");
        add("Using “git log” command");
        add("After you have created several commits, or if you have cloned a repository with an\n" +
                "existing commit history, you’ll probably want to look back to see what has happened.\n" +
                "The most basic and powerful tool to do this is the git log command.");
        add("git commit- records changes to the repository\n" +
                "git push- updates remote repository");
        add("The staging area is a file, generally contained in your Git directory, that stores information\n" +
                "about what will go into your next commit. Its technical name in Git parlance is the “index”,\n" +
                "but the phrase “staging area” works just as well.\n" +
                "\n" +
                "The basic Git workflow goes something like this:\n" +
                "1. You modify files in your working tree.\n" +
                "2. You selectively stage just those changes you want to be part of your next commit,\n" +
                "which adds only those changes to the staging area.\n" +
                "3. You do a commit, which takes the files as they are in the staging area and stores\n" +
                "that snapshot permanently to your Git directory.");
        add("Jenkins is an open-source automation tool written in Java with plugins built for Continuous Integration\n" +
                "purposes. Jenkins is used to build and test your software projects continuously making it easier for\n" +
                "developers to integrate changes to the project, and making it easier for users to obtain a fresh build");
        add("1) Open the command prompt and type java –jar and enter the path of a .war file (.war is what Jenkins will download as)\n" +
                "2) Press enter and check if your Jenkins.war file started to run and check the status information on the command prompt console.\n" +
                "It should show – Jenkins is fully up and running\n" +
                "3) Now check whether your Jenkins is ready to use; by default, it uses port 8080.\n" +
                "Type “http://localhost:8080” in the browser and press enter. It will show you Jenkins UI.\n" +
                "It will load the Jenkins dashboard empty by default.\n" +
                "Step #2 Using Selenium with Jenkins\n" +
                "Follow the below steps:\n" +
                "\n" +
                "    Go to Jenkins dashboard\n" +
                "    Click on manage Jenkins\n" +
                "    Click on configure Jenkins\n" +
                "    Click on JDK installation – In JDK name section enter the name, under Java Home section – give your java path\n" +
                "Uncheck install automatically so that it doesn't update with the newest Java version. Then click apply and save." +
                "Now your Jenkins is configured with Selenium and is ready to go!\n" +
                "The last step is to create a Selenium script and a TestNG XML file. \n" +
                " This TestNG XML file will be required for creating a batch file and we will use that batch file in Jenkins.");
        add("1) Installation\n" +
                "\n" +
                "Installation is easy: just search for \"Selenium Grid\" on Jenkins' \"Manage Plugins\" screen.\n" +
                " The plugin adds a “Selenium Grid” option to the sidebar of the Jenkins dashboard. \n" +
                "This screen gives an overview of the status of the Hub, such as console output, and will list any connected Nodes. \n" +
                "Most importantly, it lists the URL needed in your Selenium test code to utilize the Grid: you’ll need this in your Web Driver declaration in your test code.\n" +
                "2) Creating a Node Configuration\n" +
                "\n" +
                "To set up your first Node, navigate to “Configurations” in the sidebar. This page lists all your configurations for Selenium Nodes. \n" +
                " These configurations are used to define options for each Node, such as what browsers are present, and where their binaries are stored. \n" +
                " For now, select “New Configuration”. The default options on this screen should be fine for your first Node, but you may prefer to match by a label to specify which Jenkins Slave this configuration is for. \n" +
                " The same goes for the browsers: by default, the configuration will allow for 5 instances of Firefox, 5 instances of Chrome, and 1 instance of Internet Explorer. \n" +
                " For more advanced configuration options, you can attach a JSON configuration file.\n" +
                "3) Launching a Node\n" +
                "\n" +
                "Once you have a configuration, navigate to “Nodes Matching Configuration”.\n" +
                "This screen lists any available Jenkins Slaves that match your configurations; currently, it should list any Jenkins slaves that match the configuration you just made. \n" +
                " Now you can connect a Node to the Selenium Hub using the configuration. \n" +
                " Click on the name of the slave you’d like to run Selenium Tests on, and click the “Start” button to enable it as a Selenium Node. \n" +
                "You should now see the Node listed on the main Selenium Grid plugin page.  If it isn’t there, you can check the Selenium Grid console output or RDP into the Slave to diagnose the issue. \n" +
                " If you’re using a remote network, make sure that the Jenkins server and slave allow traffic on the ports you’re using for Selenium Grid.");
        add("a) Run Jenkins\n" +
                "b) Add Maven plugins\n" +
                "c) Create a Maven Job\n" +
                "d) Specify the location of your Selenium project for example provide the github location\n" +
                "e) Click build");
        add("Inside your Jenkins project, Click Configure > Under Post-build Actions select Email Notification and\n" +
                "enter your Email Address");
        add("When you are at Jenkins Home > Click Manage Jenkins > Click System Log");
        add("Jenkins can be used to perform the typical build server work, such as doing continuous/official/nightly\n" +
                "builds, run tests, or perform some repetitive batch tasks. This is called \"free-style software project\" in\n" +
                "Jenkins. Freestyle build jobs are general-purpose build jobs, which provides a maximum of flexibility.");
        add("I click and open my Maven project under Build History. If the icon is in red color, it\n" +
                "means the build failed. I can then click and view the details of the failed build and see console logs\n" +
                "to view the details/reason of the failure.");
        add("The default is port 8080");
    }};
}
