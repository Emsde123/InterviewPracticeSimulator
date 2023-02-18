package QuestionsDB;

import java.util.ArrayList;

public class TechnicalQuestions {

    public static ArrayList<String> technicalQuestions = new ArrayList<>(){{
        add("1. How many APIs do you have in your current project?");
        add("2. What types of API testing have you performed?");
        add("3. How do you verify response code?");
        add("4. What status codes do you have in your project?");
        add("5. How do you validate the elements from the response?" );
        add("6. How to retrieve data from a response in API?");
        add("7. How many internal/partner APIs you have?");
        add("8. Why did you pick Cucumber instead of Karate in your API framework?" );
        add("9. What is \"final\" in Java?");
        add("10. How do you update an integer element in Arraylist?");
        add("11. What was the purpose of adding functional interface to Java? Why do we need to\n" +
                "have a function like this in Java?");
        add("12. What is the Iterator interface and how to use it?");
        add("13. What is static in Java? Why do we need to create static methods if we can have a\n" +
                "non-static and can call it by instantiating the class?");
        add("14. How do you use Collection interface in your framework?");
        add("15. What is the difference between ArrayList and LinkedList?");
        add("16. What is abstract class?");
        add("17. Difference between ArrayList and HashMap?");
        add("18. How will you compare 2 decimal numbers with more than 4 digits after decimal, by\n" +
                "rounding the decimal values to 2 digits?");
        add("19. What is reflection in Java?");
        add("20. What is Singleton and how do you use it in your framework?");
        add("21. What do you know about Unix shell?");
        add("22. How do you handle multiple windows/tabs in selenium?");
        add("23. How do you press enter in selenium?");
        add("24. How do you pass text into a textbox in alert pop up?");
        add("25. How do you double click in selenium?");
        add("26. What class do you use to take screenshots?" );
        add("27. What is Background in cucumber?");
        add("28. How to scroll down/to element on a webpage?");
        add("29. How do you hover over a WebElement?");
        add("30. How do you locate elements? Do you use siblings/predecessor/ancestors xpath?");
        add("31. quit() vs close()?");
        add("32. In a web element search, selenium developer wants the program to wait for an\n" +
                "element to show up and looks for it repeatedly for a specified amount of time before\n" +
                "messaging what’s called “NoSuchElementException”. Which Selenium wait option does\n" +
                "the developer need to use to achieve this?");
        add("33. What is a staleElement exception and how to handle that?");
        add("34. How do you handle exceptions in your framework?");
        add("35. A selenium developer finds an element within a frame object and wants to work\n" +
                "with the element. What is mandatory for the developer to do before initiating the\n" +
                "element object?");
        add("36. In a web element search, selenium developer wants to wait for an element for a fixed\n" +
                "amount of time no matter if the element is already available or not. Once the time is\n" +
                "passed, the program should throw an exception called “ NoSuchElementException”.\n" +
                "Which element wait option can be used to achieve this?");
        add("37. A selenium tester wants to log information before, after and during an event is\n" +
                "triggered. Which Selenium feature can be used to achieve this goal?");
        add("38. How do you use collection in your Cucumber framework?");
        add("39. Tell me about HashMaps?");
        add("40. How do you add values to HashMap?");
        add("41. How does Java check the equality between 2 objects? Explain the logic (He\n" +
                "wanted to hear about the hashcodes)");
        add("42. Can java hashCode produce the same value for different strings?");
        add("43. Difference between Object class equals() and String class equals()?");
        add("44. How to use methods and variables from abstract class without extending this\n" +
                "class.");
        add("45. Arraylist,what is it and how do you use it?");
        add("46. Difference between List , Set and Map.");
        add("47. When to use List, Set and Map in Java?");
        add("48. Difference between HashMap and HashTable.");
        add("49. Difference between ArrayList and Vector.");
        add("50. Difference between abstract class and interface.");
        add("51. What was added to the interface in Java 8.");
        add("52. How to sort HasMap?");
        add("53. What is Thread and Sequential programing?");
        add("54. What is Parallel Programming and MultiThreading?");
        add("55. How to create Thread?");
        add("56. What is DeadLock?");
        add("57. How to resolve DeadLock?");
        add("58. What is Lock?");
        add("59. What is the difference between Infinite Recursion and Infinite Loop?");
        add("60. What is the use case of isAlive method in Thread process?");
        add("61. What is the difference between Join , Sleep and Wait methods?");
        add("62. What is Thread.Priority and use case in MultiThreading?");
        add("63. What do you understand by inter-thread communication?");
        add("64. Why must wait() method be called from the synchronized block?" );
        add("65. What are the advantages of multithreading?");
        add("66. What are the states in the lifecycle of a Thread?");
        add("67. Is it possible to start a thread twice?");
        add("68. Can we call the run() method instead of start()?");
        add("69. What is the synchronization?");
        add("70. What is the purpose of the Synchronized block?");
        add("71. What is static synchronization?");
        add("72. What is the difference between notify() and notifyAll()?");
        add("73. How is the safety of a thread achieved?");
        add("74. How to detect a deadlock condition? How can it be avoided?");
        add("75. How do you stop a thread in Java?");
        add("76. What is a daemon thread?");
        add("77. Volatile Keyword in Java.");
        add("78. When to use Volatile Keyword in Java.");
        add("79. Difference between synchronization and volatile keyword");
        add("80. ThreadLocal class?" );
        add("81. Difference between ThreadLocal class and volatile keyword in Java.");
        add("82. How did you use ThreadLocal in your framework?");
        add("83. How do I create a ThreadLocal variable?");
        add("84. Accessing a ThreadLocal Variable.");
        add("85. When should I use a ThreadLocal variable?");
        add("86. When should we interrupt a thread?");
        add("87. Does each thread have its stack in multithreaded programming?");
        add("88. What is a Thread Scheduler in java?");
        add("89. How to run parallel tests in TestNG?");
        add("90. How to handle parallel execution and multithreading in TestNG?");
        add("91. How to run testng scenarios multiple times?");
        add("92. What is Parallel Testing and Why is it important?");
        add("93. Advantages of Parallel Testing?");
        add("94. Disadvantages of Parallel Testing ?");
        add("95. Where can we apply Parallel Test execution in TestNG?");
        add("96. Parallel test execution using DataProviders in TestNG ?");
        add("97. What do the listeners do in TestNG?");
        add("98. How can we use TestNG listeners ?");
        add("99. Give an example adding listeners in testng.xml ? → very important question");
        add("100. Give an example adding listeners using TestNG @Listeners annotation ? important question ");
        add("101. What type of version control do you use?");
        add("102. The difference between local vs. remote repositories");
        add("103. What are the GIT commands?");
        add("104. How do you see who updated the class file using GIT?");
        add("105. Where do you see history of a GIT project repository?");
        add("106. What is the difference between commit and push?");
        add("107. What is staging in GIT?");
        add("108. GIT workflow? ");
        add("109. What is Jenkins?");
        add("110. How do you create a maven job in Jenkins?");
        add("111. How do you configure a job to send an email when Jenkins job execution is complete?");
        add("112. How can you get the log of the reports in Jenkins?");
        add("113. What is freestyle job?");
        add("114. How do you know if your Jenkins build failed?");
        add("115. What is default port for Jenkins?");



    }};

    public static ArrayList<String> technicalAnswers = new ArrayList<>(){{
        add("1.");
        add("2.");
        add("3.");
        add("4.");
        add("5.");
        add("6.");
        add("7.");
        add("8.");
        add("9.");
        add("10.");
        add("11.");
        add("12.");
        add("13.");
        add("14.");
        add("15.");
        add("16.");
        add("17.");
        add("18.");
        add("19.");
        add("20.");
        add("21.");
        add("22.");
        add("23.");
        add("24.");
        add("25.");
        add("26.");
        add("27.");
        add("28.");
        add("29.");
        add("30.");
        add("31.");
        add("32.");
        add("33.");
        add("34.");
        add("35.");
        add("36.");
        add("37.");
        add("38.");
        add("39.");
        add("40.");
        add("41.");
        add("42.");
        add("43.");
        add("44.");
        add("45.");
        add("46.");
        add("47.");
        add("48.");
        add("49.");
        add("50.");
        add("51.");
        add("52.");
        add("53.");
        add("54.");
        add("55.");
        add("56.");
        add("57.");
        add("58.");
        add("59.");
        add("60.");
        add("61.");
        add("62.");
        add("63.");
        add("64.");
        add("65.");
        add("66.");
        add("67.");
        add("68.");
        add("69.");
        add("70.");
        add("71.");
        add("72.");
        add("73.");
        add("74.");
        add("75.");
        add("76.");
        add("77.");
        add("78.");
        add("79.");
        add("80.");
        add("81.");
        add("82.");
        add("83.");
        add("84.");
        add("85.");
        add("86.");
        add("87.");
        add("88.");
        add("89.");
        add("90.");
        add("91.");
        add("92.");
        add("93.");
        add("94.");
        add("95.");
        add("96.");
        add("97.");
        add("98.");
        add("99.");
        add("100.");
        add("101.");
        add("102.");
        add("103.");
        add("104.");
        add("105.");
        add("106.");
        add("107.");
        add("108.");
        add("109.");
        add("110.");
        add("111.");
        add("112.");
        add("113.");
        add("114.");
        add("115.");
        //TODO Technical Answers


    }};
}
