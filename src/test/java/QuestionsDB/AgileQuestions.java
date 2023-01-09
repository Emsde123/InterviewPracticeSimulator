package QuestionsDB;

import java.util.ArrayList;

public class AgileQuestions {
    public static ArrayList<String> agileQuestions = new ArrayList<>(){
        {
            add("1. What is a hotfix?");
            add("2. Currently, you are working at ______ company which is not related to this job how can you relate or help our company?");
            add("3. What are some tools you have used in your project?");
            add("4. If there isn’t enough time for testing what would you do?");
            add("5. What would you do if you end up with unclear requirements?");
            add("6. How many people are on your team or describe me your team?");
            add("7. Let's say you have a bug that comes in the day before the sprint is ending, do you let it go into production or move it to the next sprint?");
            add("8. What do you do when you find a bug?");
            add("9. Where do you write your test cases?");
            add("10.Can you explain agile and how are agile practices implemented in your company?");
            add("11. Have you done any performance testing?");
            add("12. Can you tell me the Difference between Verification and Validation?");
            add("13. How would you test an application if the requirements are not available?");
            add("14. When do you know if you have enough test cases for your project or a specific module?");
            add("15. What Is the Difference between Black Box and White Box testing?");
            add("16. Why do Software Applications have bugs?");
            add("17. Who is responsible for writing test cases and test plans?");
            add("18. What is a test case and what does it include?");
            add("19. What do you do if there isn’t enough time for thorough testing?");
            add("20.Can you explain the difference between bug severity and bug priority.");
            add("21. How do you determine the level of severity of a defect?");
            add("22.Tell us some key challenges you face in Testing industry?");
            add("23.What is the difference between system testing and integration testing?");
            add("24. Can you do 100% manual testing and find all bugs?");
            add("25.What is Requirement Traceability Matrix?");
            add("26. Can you tell us the difference between STLC (Software Testing Life Cycle) and SDLC (Software Development Life Cycle)?");
            add("27. What is the difference between static and dynamic testing?");
            add("28. How do you define the bug life cycle?");
            add("29.Can you tell us the different type of testing you are aware of?");
            add("30.How do you deal with a bug which is not consistently reproducible?");
            add("31. What would you do if a developer rejects your bug and refuse to fix it?");
            add("32. In which phase should testing begin: requirements, planning, design, or coding?");
            add("33. What is the most difficult problem you’ve found during testing?");
            add("34. What is Ad-Hoc Testing? Exploratory testing?");
            add("35. What is unit testing, and have you ever done unit testing?");
            add("36. What is component testing?");
            add("37. What is Integration testing?");
            add("38. What is the difference between UAT and QA? What is Acceptance testing?");
            add("39. What is system testing?");
            add("40.What is Beta Testing?");
            add("41. What is 508 Compliance testing?");
            add("42. What is Boundary Testing?");
            add("44. What is Negative Testing and what is Positive Testing?");
            add("45.Other than testing what else have you done to contribute to the team?");
            add("46. What is a peer review?");
            add("47. What is the difference between bug release and bug leakage?");
            add("48. When is a test considered to be successful?");
            add("49. What is non-functional testing?");
            add("50. What are differences between a Test Plan and Test Strategy?");
            add("51. When is a good time to stop testing?");
            add("52. Who approves test cases?");
            add("53. When do you choose automation testing over manual testing?");
            add("54. What is test coverage?");
            add("55. What is a testing hierarchy?");
            add("56. What is Functional testing?");
            add("57. What is the difference between regression testing and retesting?");
            add("58. How many bugs do you find a day?");
        }
    };

    public static ArrayList<String> agileAnswers =  new ArrayList<>() {
        {
            add(
                    "A hotfix is an emergency issue that needs to be fixed right away and does not need to go\n" +
                            "through a whole sprint cycle. It’s an exception where it can be developed tested and deployed\n" +
                            "in few hours or a day since it’s an extreme priority and client wants the critical issue fixed ASAP\n" +
                            "and deployed.");
            add(
                    "Yes, I don’t have the domain knowledge of this position, but I have testing experience. I know\n" +
                            "testing principals how to test, how to break a system and be detailed orientated to find issues\n" +
                            "in an application. Plus, I have done various type of testing that is common all across and are in\n" +
                            "practice.");
            add(
                    "I have used various tools throughout my career. For bug tracking, I have used JIRA mostly but\n" +
                            "have some exposure to ALM. For automation, I have been using Selenium for several years. SQL\n" +
                            "developer for back- end, Cucumber Reporting for screen capture for reporting purpose. Besides\n" +
                            "that, I use Outlook for email and Skype Business/LYNC and Slack chat for communication. Also,\n" +
                            "for document sharing across the company I have used SharePoint and Version ONE as well.\n" +
                            "IF they ask, have you used RALLY, JAZZ, Microsoft TFS or some other tools, just mention you are\n" +
                            "very familiar with it but other team members used it in other projects and they are very similar\n" +
                            "and it won&#39;t be a problem for me to work with it.");
            add(
                    "If we are short on time, I would prioritize my test cases and tackle ones that cover most\n" +
                            "functionality. I will also check with my team members to see if they can help. Since I have been\n" +
                            "on agile projects we work together in matters as such.");
            add(
                    "In this scenario, your knowledge of application plays a big role I would start to do some random\n" +
                            "testing to understand what is being asked or what is at least attempted basically discovering to\n" +
                            "get an idea, so I can start writing scripts. Then I will check our meeting notes, emails, and\n" +
                            "discussions on this requirement. On top of that, I look for a wire frame which might give me an\n" +
                            "Idea but overall my common sense and experience plays a part here and also I would think\n" +
                            "from a customer’s perspective here. I can also ask if BA is available to clarify them as well.");
            add(
                    "There are 2 Automation Testers,\n" +
                            "1 manual tester\n" +
                            "4 Developers,\n" +
                            "1 scrum master,\n" +
                            "1 QA manager or product owner,\n" +
                            "1 BA.\n" +
                            "*Tell them how many there are also mention we are cross-functional team etc.");
            add(
                    "into production or move it to the next sprint?\n" +
                            "IF the bug is of a very low priority and severity we will log it and fix it at a later time since it\n" +
                            "doesn’t impact the system much and release it into production, but if it’s a show stopper we\n" +
                            "will never release it into production since it can cause other issues.");
            add(
                    "First you will go back and retest it to make sure it is a bug, then you take a screenshot and\n" +
                            "create/log a bug in Jira with as many details as possible such as short description, environment\n" +
                            "found in, exact steps to reproduce, severity, priority etc. so the developer can try to recreate it.");
            add(
                    "In my company, all test cases are written in excel. In past when I was exposed to ALM you could\n" +
                            "create Test Cases in ALM under Test Plan Module but last few years in this project I have been\n" +
                            "using JIRA. We only have Atlassian Confluence where our team only uploads and holds our\n" +
                            "Systems Documents, BRD, and other documents.");
            add(
                    "Yes, in our company we have daily stand up every morning... also, we have sprint planning\n" +
                            "meeting where we discuss and allocate user stories. Towards the end of sprint we have a sprint\n" +
                            "demo and then we have retrospective where we talk about what went right and wrong etc.");
            add(
                    "Simply say NO you have not done so and that performance testing was conducted by a separate\n" +
                            "Team.");
            add(
                    "Verification is when you are analyzing requirements and test cases to ensure we cover\n" +
                            "all scenarios and we are creating the right product and here there is no code involved.\n" +
                            "Simply reviewing documents to ensure everything is covered and NO coding is involved.\n" +
                            "Validation is when we are executing our test cases and actually writing code to verify\n" +
                            "the system");
            add(
                    "In this scenario you experience plays a role I would do significant amount of AD-hoc testing to\n" +
                            "start off then I will gather as much information from end- user and also see competitors\n" +
                            "application if available to get an idea. I will schedule meetings with end client or SME who can\n" +
                            "really guide me.");
            add(
                    "If all requirements have at least one test case, then we know we have covered everything also\n" +
                            "in this case an RTM is very useful since it maps out Requirements to Test Cases");
            add(
                    "Black box testing is a testing approach which depends completely on the product\n" +
                            "requirements and specifications. Basically, front-end testing. The knowledge of internal\n" +
                            "paths, structures, or implementation of the software is not needed\n" +
                            "White box testing is when you know the internal structure of the application meaning\n" +
                            "you know coding and can perform unit testing as well.");
            add(
                    "There are various reasons why a system might have bugs, such as bad design, coding errors,\n" +
                            "miscommunication, continues change in requirements, rushing to meet deadline and also the\n" +
                            "complexity of the application");
            add(
                    "We testers write test cases for various scenarios, while test lead or even QA Manager is\n" +
                            "responsible for making a test plan.");
            add(
                    "A test case is a document which has a set of actions that needs to be executed to verify a\n" +
                            "feature or functionality of your software application. It includes\n" +
                            "• Test Scenario/Objective\n" +
                            "• Pre-Condition\n" +
                            "• Test Case ID\n" +
                            "• Test Data\n" +
                            "• Test Description\n" +
                            "• Expected Result\n" +
                            "• Actual Result\n" +
                            "• Pass or Fail\n" +
                            "• Comments");
            add(
                    "You have to prioritize here, there are many scenarios:\n" +
                            "• Which functionality is most visible to the user?\n" +
                            "• Which functionality has the largest safety impact?\n" +
                            "• Which aspects of the application are most important to the customer?\n" +
                            "• Which aspects of the application can be tested early in the development cycle?\n" +
                            "• Which parts of the code are most complex and thus most subject to errors?\n" +
                            "• Which parts of the application were developed in rush or panic mode?\n" +
                            "• Which parts of the requirements and design are unclear or poorly thought out?\n" +
                            "• What do the developers think are the highest-risk aspects of the application?\n" +
                            "• What kinds of problems would cause the most customer service complaints?\n" +
                            "• What kinds of tests could easily cover multiple functionalities?\n" +
                            "• Which tests will have the best high-risk- coverage to time-required ratio?");
            add(
                    "A bug severity is how damaging a bug can be, how much impact it will have on the system while\n" +
                            "bug priority is how fast a bug needs to be fixed, it’s the time frame of its urgency");
            add(
                    "Severity can be broken by the functionality here are some examples\n" +
                            "• Low priority bugs are small errors that don&#39;t stop shipping or cause real trouble for any user.\n" +
                            "• Medium priority bugs cause some internal users trouble but have known workarounds.\n" +
                            "• High priority bugs are problems that our customers will see, can corrupt data, or crash a\n" +
                            "system.\n" +
                            "• High Priority &amp; High Severity: An error which occurs on the basic functionality of the\n" +
                            "application and will not allow the user to use the system.\n" +
                            "• High Priority &amp; Low Severity: The spelling mistakes that happens on the cover page or heading\n" +
                            "or title of an application.\n" +
                            "• High Severity &amp; Low Priority: An error which occurs on the functionality of the application (for\n" +
                            "which there is no workaround) and will not allow the user to use the system but it’s on part of\n" +
                            "the application rarely used.\n" +
                            "• Low Priority and Low Severity: Any cosmetic or spelling issues which is within a paragraph or\n" +
                            "in the report (Not on cover page, heading, title).");
            add(
                    "• Requirements changing.\n" +
                            "• Application not stable.\n" +
                            "• Rush testing to meet deadline\n" +
                            "• Unclear requirements\n" +
                            "• Domain knowledge and business user perspective understanding.\n" +
                            "• Lack of Regression testing or not enough.\n" +
                            "• Lack of skilled testers.\n" +
                            "• Lack of resources, tools and training");
            add(
                    "System testing is when the entire system is checked such as hardware, software, servers,\n" +
                            "databases etc., whereas for integration testing, the integration between the individual modules\n" +
                            "is tested.");
            add(
                    "No, it is impossible because there are a number of possibilities and scenarios. If we cover all\n" +
                            "functionalities and test them then we can reduce the risk of bugs and have a satisfied client.");
            add(
                    "RTM is mapping requirement to test cases and test cases to the defect. If there is a defect\n" +
                            "found, we can trace back to tell which specific requirement failed. RTM also tells us if we are\n" +
                            "missing test cases in case requirement is there and no test case is available.");
            add(
                    "SDLC stands for Software Development Life Cycle. Which consists of the following\n" +
                            "phases Requirement gathering, Design, Coding, Testing, Production\n" +
                            "STLC stands for Software Testing Life Cycle. Which consists of the following phases\n" +
                            "Requirement analysis, Test Planning, Test case Development, Setup testing\n" +
                            "environment, Test Execution, Test closure");
            add(
                    "Static Testing (Done In Verification Stage).\n" +
                            "Static Testing is a White Box testing technique where the developers verify or test their code\n" +
                            "with the help of checklist to find errors in it, this type of testing is done without running the\n" +
                            "developed application or program. Code Reviews, Inspections, Walkthroughs are mostly done\n" +
                            "at this stage of testing.\n" +
                            "Dynamic Testing (Done In Validation Stage).\n" +
                            "Dynamic Testing is done by executing the actual application with valid inputs to check the\n" +
                            "expected output. Examples of Dynamic Testing methodologies are Integration Testing, System\n" +
                            "Testing, Regression and Acceptance Testing.");
            add(
                    "Bug life cycle basically comprises of numerous statuses of an error during its life cycle. A few\n" +
                            "examples are open, deferred, solved, reopened, fixed, retest, Reject, solved and closed.");
            add(
                    "• Unit testing\n" +
                            "• Integration testing\n" +
                            "• Regression testing\n" +
                            "• Ad-Hoc\n" +
                            "• Smoke testing\n" +
                            "• Performance testing\n" +
                            "• Load testing\n" +
                            "• stress testing\n" +
                            "• White box and Black box testing\n" +
                            "• System testing");
            add(
                    "The best approach is to take a screenshot of it if you are using Snagit you can even capture\n" +
                            "video of it and note it down. Discuss the bug with the team so everyone can keep an eye on it.");
            add(
                    "Go back and retest it several times that it is a bug. Then check it against the requirements’. If\n" +
                            "the developer still refuses to fix it then set up a meeting between BA and developers. If in rare\n" +
                            "situation developer still does not want to fix, then QA manager or Project manager get them\n" +
                            "involved last resort.");
            add(
                    "Testing should start at the requirements phase.");
            add(
                    "An unclear requirement is the most challenging part it requires continues meeting and going\n" +
                            "back forth for clear explanation and even justifying a bug sometimes since requirements are\n" +
                            "vague. It also makes writing test cases difficult at time and modifying them when they are\n" +
                            "already created.");
            add(
                    "Both are the same thing, it is informal testing where you are testing without a test case and\n" +
                            "randomly testing a module conducting negative testing and positive testing but not in any order\n" +
                            "etc.");
            add(
                    "No, I haven’t done unit testing. Unit testing is done by the developers before they deploy their\n" +
                            "code from the Development environment to QA environment.");
            add(
                    "It’s when you are testing each component of the application separately. In application, it could\n" +
                            "be one component. One component has stand-alone functionalities, for example, Amazon\n" +
                            "Prime, Amazon Fresh etc.");
            add(
                    "Once every individual component is tested we must make sure that when we integrated these\n" +
                            "components together they must work as expected. Example amazon.com has fresh and prime,\n" +
                            "but the entire website works together even it has different components.");
            add(
                    "QA is one lower environment to UAT. QA can be a separate team that does testing and after\n" +
                            "PASS QA environment code is moved to UAT environment where again Testing is conducted to\n" +
                            "make sure no bugs have been missed. Also, UAT is mostly conducted by the business side or\n" +
                            "client side. Acceptance testing is UAT testing another name for it.");
            add(
                    "It is testing the entire system where Front-end, Back-end, Database, Server, Hardware,\n" +
                            "Software everything is tested.");
            add(
                    "Beta testing is conducted to gather feedback from the real-time usage of the product. It\n" +
                            "happens after the installation at the client-end or another good example is in real-world gaming\n" +
                            "industry they release a game to a certain audience before a mass release to get feedback.");
            add(
                    "All government websites are supposed to be 508 compliant meaning disable personel should be\n" +
                            "able to use it. Features are specific font is used on these types of websites, Text to speech\n" +
                            "capability and magnify capability etc. Just know what it is but you don’t have to tell the\n" +
                            "interviewer that you have done so.");
            add(
                    "Boundary testing is to make sure software accepts valid data inside the valid Boundary and\n" +
                            "rejects invalid data outside the valid Boundary. A simple example input field limitation is from 0\n" +
                            "to 100 so lower boundary 0 higher boundary 100. We make sure we can’t go lower than 0 and\n" +
                            "higher than 100. We only test the edges and not the middle");
            add(
                    "Negative testing is testing application with a negative/ incorrect/ invalid data and\n" +
                            "verifies weather application reject or accept/expected error message is displayed or not.\n" +
                            "Positive testing is, testing the system with correct and valid data and expecting to not\n" +
                            "see any errors.");
            add(
                    "In my experience I have created documentation like, user guides, PowerPoint slides, conducted\n" +
                            "demos and attended meetings and traveled for projects representing my team.");
            add(
                    "Peer review is when you would go over your co-worker testers test case to make sure\n" +
                            "everything is good, no issues with test case grammatically or logically it makes sense.\n" +
                            "An example at (your Company) we have a code meeting review every Wednesday. When\n" +
                            "someone developed a function all team members review/test/try to break/ provide suggestions\n" +
                            "to the newly developed function before placing it in the shared folder.");
            add(
                    "A bug release is when a version of a software is released with a set of known bugs.\n" +
                            "These bugs are usually of low severity/priority. It is done when a software company can\n" +
                            "afford the existence of a bug in the released software rather than the time/cost for\n" +
                            "fixing it in that version.\n" +
                            "Bug leakage is something when the bug is discovered by the end users or customer and\n" +
                            "missed by the testing team to detect while testing the software.");
            add(
                    "A test that discovered more errors. The whole purpose of testing process is to discover as many\n" +
                            "bugs and errors as possible. Test that covers more functionality and discovers more errors in\n" +
                            "your software product, therefore, considered more successful.");
            add(
                    "Performance testing, Security testing");
            add(
                    "Test Plan provides more details on how the testing should take place in the entire\n" +
                            "project lifecycle\n" +
                            "Test Strategy is a high-level plan usually initiated by QA manager. It captures all the\n" +
                            "primary testing activities. It is basically for the stakeholders who have high influence but\n" +
                            "low interest in the project. includes a plan for how to test the application and exactly\n" +
                            "what will be tested (user interface, modules, processes, etc.). It establishes limits for\n" +
                            "testing and indicates whether manual or automated testing will be used.");
            add(
                    "Here are some factors that tell us when to stop:\n" +
                            "• Deadlines (Release or Testing timelines)\n" +
                            "• Test case completion with expected pass percentage.\n" +
                            "• Testing cost overruns.\n" +
                            "• Attained the desired coverage of code/functionality/requirements.\n" +
                            "• Defect discovery rate falls below the threshold.");
            add(
                    "It varies, from company to company. In some companies, test lead would approve them. In\n" +
                            "other places, just a peer review is good enough and you don’t need formal approval, while in\n" +
                            "some cases a business analyst can approve as well it all depends.");
            add(
                    "When you have complex functionality that is time-consuming. Automate test cases that are\n" +
                            "redundant for manual testers. High priority test cases.\n" +
                            "Smoke test cases and regression test cases.");
            add(
                    "What we are testing and How much we are testing.\n" +
                            "Test coverage means how many test cases we have and what functional areas of those test\n" +
                            "cases are being covered. Do our test cases cover the entire application or not?");
            add(
                    "• Unit testing: Developers test their code to make sure the functionality they are working on\n" +
                            "created is working.\n" +
                            "• Component Testing: Component is a standalone functionality that can work by itself.\n" +
                            "• Integration Testing: All modules are combined. When integrated do they still work together.\n" +
                            "• System Testing: Hardware, Software, Database, servers everything.\n" +
                            "• Acceptance Testing: (User Acceptance Testing) It&#39;s testing by UAT team mostly\n" +
                            "business/client-side team or hired UAT team that validates what QA team tested before moving\n" +
                            "to production.");
            add(
                    "Simply testing any functionality is functional testing. Manual testers do functional testing.");
            add(
                    "Regression testing is performed if new functionality is added or bug fix occurs, and we want to\n" +
                            "make sure other parts of the application is still functioning correctly. While retesting means if a\n" +
                            "defect gets fixed, I must retest the functionality to see it is really fixed or not.");
            add(
                    "We don’t test every day since we have meetings and time must be allotted to creating test\n" +
                            "cases. When we do actual testing anywhere from 2 to 3 bugs a day at the very beginning and as\n" +
                            "we continue testing the bug rate falls to 0 to 1.");
        }
    };


}
