package QuestionsDB;

import java.util.ArrayList;

public class APIQuestions {

    public static ArrayList<String> combinedAPIQuestions = new ArrayList<>(){{
        add("1. Web Application structure?");
        add("2. Web Application Architecture types?");
        add("3. What is API?");
        add("4. What is a Web Service API?");
        add("5. What do you use as Non-Web Service API?");
        add("6. What is the difference between UI and API testing?");
        add("7. What tools do you use for API testing?");
        add("8. What is the difference between stateless and stateful protocols?");
        add("9. What is the difference between Soap and REST?");
        add("10. What is the difference between Rest and Restful?");
        add("11. What are some HTTP methods you are familiar with? What do they do?");
        add("12. HTTP Status codes?");
        add("13. What are the core components of HTTP requests and responses?");
        add("14. Headers in API?");
        add("15. XML and JSON?");
        add("16. Authorization vs. Authentication.");
        add("17. What is an Endpoint?");
        add("18. What is URI?");
        add("19. Parameters in Endpoint?");
        add("20. What is Swagger?");
        add("21. What is SOAP UI?");
        add("22. What are the main objectives of functional API testing?");
        add("23. What is the implementation process of API testing?");
        add("24. What do you check in API contract?");
        add("25. What kind of test cases do you create in API testing?");
        add("26. What do you verify in test case execution?");
        add("27. How do you implement different test flows?");
        add("28. What are the advantages of API Testing?");
        add("1. Tell me about your API automation framework?");
        add("2. Which dependencies do you have in your pom.xml file?");
        add("3. Which RestAssured methods have you used?");
        add("4. How do you automate your API test cases?");
        add("5. How can you test a Webservice/API?");
        add("6. How do you send data to service with a POST call?");
        add("7. After you post a request, how can you find the same data in database?");
        add("8. What is JsonPath?");
        add("9. How can you validate that the response you are getting is correct?");
        add("10. How do you validate a value in the response body?");
        add("11. What is Serialization and Deserialization?");
        add("12. How did you use OOP concepts in your API Framework?");
        add("13. What is POJO?");
        add("14. What is the test environment of API?");
        add("15. How did you handle environments in your project?");
        add("16. How do you use a Database in your API testing?");
        add("17. How did you do UI, API and DB testing in your framework?");
        add("18. How do you use Enum in your project?");
        add("19. How to write a method where parameter limit is 100 and employee id =100?");
        add("20. How do you handle sensitive data in your framework?");
        add("21. Scenario: Yesterday, you tested a scenario and it was working fine and you were\n" +
                "getting all the elements in your response. But today, you tried again and saw that one\n" +
                "of the elements is missing in response. How can you prove that it was working fine\n" +
                "yesterday?");
        add("22. Types of Bugs in API testing?");
        add("23. Challenges in API Testing");

    }};

    public static ArrayList<String> combinedAPIAnswers = new ArrayList<>(){{
        add("1. Front-end: user interacts with the application through web pages.\n" +
                "2. Back-end:\n" +
                "● Server layer: all business logic code is written here.\n" +
                "● Database layer: all the data is stored here.");
        add("● Monolithic- building an application as a whole.\n" +
                "● Microservice- application is broken into small pieces/ functionalities/ services, and each\n" +
                "service is a standalone functionality.");
        add("● API stands for Application Programming Interface.\n" +
                "● Provides a common platform to allow multiple applications to communicate with each\n" +
                "other.\n" +
                "● Set of rules that allow client and server to talk to each other.\n" +
                "● Connects one microservice to another.");
        add("● Communication between client and server applications over the internet. (World Wide\n" +
                "Web).\n" +
                "● Requires a network.");
        add("● Selenium API for browser.\n" +
                "● JDBC for database.\n" +
                "● RestAssured for API.\n" +
                "● Apache POI for MS Office.");
        add("UI Testing's main focus is to test the look and feel of an application.\n" +
                "API Testing’s main focus is to test the business layer of the application.");
        add("Postman, SOAP UI tools for manual API Testing, RestAssured library for API\n" +
                "Automation Testing.");
        add("Stateless: \n" +
                "Does not require the server to keep the server\n" +
                "information/ session details.\n" +
                "No tight dependency between the client and server\n" +
                "Failed server will simply restart after the crash since there is no state to restore.\n" +
                "Easy to implement on the internet\n" +
                "Handles transactions fast\n" +
                "\n" +
                "Stateful:\n" +
                "Requires the server to keep the server info/session details\n" +
                "Has tight dependency between the client and the server\n" +
                "Failed server will have a harder time than Stateless since it has to maintain session details.\n" +
                "Heavy to implement on the internet \n" +
                "Handles transactions slowly");
        add("SOAP:\n" +
                "Simple Object Access Protocol\n" +
                "Protocol\n" +
                "Supports only XML\n" +
                "Requires WSDL file to test\n" +
                "Stateful\n" +
                "Does not support catching\n" +
                "Slower\n" +
                "More secure\n" +
                "\n" +
                "REST\n" +
                "REpresentational State Transfer\n" +
                "Service architecture\n" +
                "Supports JSON, XML, TEXT, HTML, YAML, CSV\n" +
                "Requires use of HTTP for communication\n" +
                "Stateless\n" +
                "Supports catching\n" +
                "Faster\n" +
                "Less secure");
        add("Rest is an architecture style; Restful is a web service.");
        add("POST | create | 1. Creates a new record in the database.\n" +
                "2. Requires body.\n" +
                "\n GET | read | Retrieves the existing data.\n" +
                "PUT | update/replace |1. Update the existing data.\n" +
                "2. Requires body.\n" +
                "\n" +
                "PATCH | Partial update/ modify | 1. Partially update the existing data.\n" +
                "2. Requires body.\n" +
                "DELETE | delete | Removes the resource");
        add("● 1XX- Informational.\n" +
                "● 2XX- Success- request accepted successfully.\n" +
                "200- OK.\n" +
                "201- Created.\n" +
                "202- Accepted.\n" +
                "204- No content.\n" +
                "● 3XX- Redirection.\n" +
                "● 4XX- Client Error.\n" +
                "400-Bad request.\n" +
                "401- Unauthorized.\n" +
                "403- Forbidden.\n" +
                "404- Not Found.\n" +
                "405- Method not Allowed.\n" +
                "\n" +
                "● 5XX- Server Error.\n" +
                "500- Internal Server Error.\n" +
                "501- Not implemented.\n" +
                "502- Bad gateway.\n" +
                "503-Service Unavailable.");
        add("REQUEST: \n" +
                "The information client sends to the server\n" +
                "HTTP method (GET, POST, PUT, PATCH, DELETE\n" +
                "Request Header (Token, Content-type)\n" +
                "Request Body\n" +
                "URI - data to be sent to resource\n" +
                "\n" +
                "RESPONSE: \n" +
                "A result from the server\n" +
                "HTTP Status Code\n" +
                "Response Header (Content length, content type, date, server type, last modified)\n" +
                "Response body");
        add("Part of the API request and response. Handles metadata:\n" +
                "● ContentTpye- checks the sending data format.\n" +
                "● Accept- check the receiving data format (XML/ JSON)");
        add("● Data representational languages, not executable, contain states, not methods.\n" +
                "● Transfer data between server and client.\n" +
                "XML: \n" +
                "eXtensible Markup Language \n" +
                "Defines set of rules for encoding documents \n" +
                "Supports only String\n" +
                "\n" +
                "JSON: \n" +
                "JavaScript Object Notation\n" +
                "Transmits data between server and web application with key-value format\n" +
                "Supports: String, number, array, boolean");
        add("Authentication: who you are. With a username and password validating users who they\n" +
                "claim to be.\n" +
                "● Single-factor authentication: requires a password.\n" +
                "● Two-factor authentication: requires two-step verification with a password and the\n" +
                "information only the user knows.\n" +
                "\n" +
                "● Multi-factor authentication: requires more than two-step verification to grant user\n" +
                "access to the system. Common for financial organizations, banks, and law\n" +
                "enforcement agencies.\n" +
                "No Auth: will not request credentials from the client.\n" +
                "Basic:\n" +
                "● sender places the username and password into the request header.\n" +
                "● Username and password are encoded to Base64.\n" +
                "● Authorization: Basic bG9sOnNIY3VyZQ==\n" +
                "API keys:\n" +
                "● unique generated value is assigned to each first-time user.\n" +
                "● Sent as a query param.\n" +
                "● Authorization: Apikey 1234567890abcdef\n" +
                "Bearer token/ OAuth:\n" +
                "● combination of authorization and authentication.\n" +
                "● Allows authentication via 3rd party services without sharing client passwords.\n" +
                "● allows access to a certain URL generated by server.\n" +
                "● Authorization: Bearer <token>\n" +
                "Authorization: what rights do you have\n" +
                "Occurs after the identity is successfully authenticated by the system.");
        add("● Where we sent the request.\n" +
                "● Developers create public URLs, and requests are sent to the URLs.\n" +
                "● Base URI/ resource?parameters");
        add("● Uniform Resource Identifier.\n" +
                "● Locates a resource on the server hosting web service.\n" +
                "● Format: <protocol>://<service-name>/<ResourceType>/<ResourceID>");
        add("Path params (/)\n" +
                "Value is part of the URL\n" +
                "Identify a specific resource\n" +
                "\n" +
                "Query params (?)\n" +
                "Not part of the URL\n" +
                "Sorts or filters items");
        add("● Open source software tool for helping developers design, build and document RESTFul\n" +
                "Web services.\n" +
                "● Description and guidelines of API endpoints.\n" +
                "● Describes the structure of API.");
        add("● The cross-platform API testing tool supports all standard protocols.\n" +
                "● Allows executing automated functional and load tests on Web APIs.");
        add("● Ensure the implementation is working as expected- no bugs.\n" +
                "● Ensure the implementation is working as specified in the API documentation.\n" +
                "● Prevent regressions between code merges and releases.");
        add("1. Checking API contract.\n" +
                "2. Creating the test cases.\n" +
                "3. Executing the test cases.\n" +
                "4. Implementing different test flows.");
        add("● Endpoints are correct.\n" +
                "● Proper XML/JSON structure used in response.\n" +
                "● Confirm there is no missing, redundant, or duplicate functionality.");
        add("1. Basic positive test cases (happy path).\n" +
                "2. Extended positive testing (with optional parameters; valid request params, headers).\n" +
                "3. Negative testing with valid input (add existing username).\n" +
                "4. Negative testing with invalid input (add null username).\n" +
                "5. Destructive testing (sending null, empty string, integer instead of char, od date format,\n" +
                "deleting necessary parameters to check if the application throws an error).\n" +
                "6. Security/ authorization/ permission testing (sending valid and invalid tokens).");
        add("● Data accuracy- check the request and response body and verify with API documentation\n" +
                "if the data type and structure are correct.\n" +
                "● Schema validation. datatype orders, numbers, and places of elements are correct.\n" +
                "● HTTP status code.\n" +
                "● Response headers.\n" +
                "● Response body.\n" +
                "● Authorization check.\n" +
                "● Error messages.\n" +
                "● Response time.");
        add("1. Single-step workflow: executing single API request.\n" +
                "2. Multi-step workflow: execute POST request to create a resource, then execute GET\n" +
                "request to check if the resource retrieves the data, then execute PATCH request to update\n" +
                "the data, then execute GET call to verify data updated successfully.\n" +
                "3. Combined API & UI:\n" +
                "➢ Go to UI to add an employee\n" +
                "➢ Go to DB and verify if an employee has been added. All data matches.\n" +
                "➢ API- GET request and verify if an employee is added.\n" +
                "➢ Go to UI and search if an employee was added.");
        add("1. Test for Core Functionality: API testing provides access to the application without a user\n" +
                "interface. In GUI Testing, we must wait until the application is available to test the core\n" +
                "functionalities.\n" +
                "2. Time Effective: We don’t need to wait until the application becomes available since, in\n" +
                "API Testing, we can test the application without User Interface.\n" +
                "3. Reduce Testing Costs-With API Testing, we can find minor bugs before the GUI Testing.\n" +
                "These minor bugs will become bigger during the GUI Testing. So finding those bugs in\n" +
                "the API Testing will be cost-effective for the Company.\n" +
                "4. Helps to reduce risks since each service is tested independently.\n" +
                "5. Language-Independent: In API testing, data is exchanged using XML or JSON. These\n" +
                "transfer modes are completely language-independent, allowing users to select any coding\n" +
                "language when adopting automation testing services for the project.");
        add("It is a Cucumber BDD Maven framework. Java is a scripting language; and we use Rest\n" +
                "Assured library to connect the web services, Junit for assertions to validate actual results\n" +
                "against the expected ones. We use Gherkin language to write our scenarios in feature files. It\n" +
                "also helps others to understand our scenarios. In Cucumber report we attach response and\n" +
                "request to analyze all steps and data (request and response) in organized ways.\n" +
                "Runner class where I control which scenario to run.\n" +
                "ReusableMethods (FunctionLibrary) class where I keep my reusable methods.\n" +
                "RequestBuilder package I keep my java classes that I use to create request bodies during\n" +
                "runtime.\n" +
                "Properties file I keep credentials like service URI, Database URL, username, passwords.\n" +
                "TestBase class, I read all this data and load properties object than other classes extends\n" +
                "TestBase class (which is an Inheritance concept of Java) and use all data in properties\n" +
                "object.");
        add("● io.RestAssured- automate Restful APIs.\n" +
                "● Junit- write and run repeatable automated tests.\n" +
                "● Commons-io- work with files\n" +
                "● Jackson-databind- serialize and deserialize the data.\n" +
                "● Cucumber-junit-\n" +
                "● Cucumber-java-\n" +
                "● Maven-compiler-compile the source code of Maven project\n" +
                "● Json-schema-validator- validate schema of JSON\n" +
                "● Json-path- extract specific value of JSON.\n" +
                "● Maven-cucumber-reporting- produce reports what scenarios passed or failed.");
        add("● given() - we pass header(), body() ... methods.\n" +
                "● when() - we write get(), post()... methods.\n" +
                "● then() - we use validation methods.");
        add("First, I write my test case as a scenario in my cucumber feature file.\n" +
                "Then I create step definition methods which are Java methods for each step in the feature\n" +
                "file and I wrote my java code inside those methods.\n" +
                "I add tags for each scenario, then use the same tag in my runner class to run the same\n" +
                "scenario.");
        add("In order to test an API, first I need basic information about that service. I need to know URI,\n" +
                "headers(if required), parameters(if required), request schema (for POST call). I get these\n" +
                "details from API documentation. If this is a new API and documentation is not ready, I ask\n" +
                "developer to send me those details. Then first I test that service manually in Postman to\n" +
                "make sure I can get a response from that service. After I get response I check status code of\n" +
                "the response. It should be 200. If I get 200, I am sure that the service/API is up and running\n" +
                "then I start testing functionality of that service. In order to test functionality, I need to\n" +
                "understand the\n" +
                "Requirement. For example: For a POST calls, some elements in request schema are\n" +
                "required and some elements are optional. First I test optional elements. I remove one of the\n" +
                "optional elements and submit request and should be able to get a response. By this way, I\n" +
                "test all optional elements. Later I test required elements. I missed one of the required\n" +
                "elements in request body and sent the request. I should get error code for each required\n" +
                "element. Then I validate error codes. This is my negative scenario. In this way, I test\n" +
                "headers. For example My API requires header: applicationID: If I pass wrong application ID, I\n" +
                "should not get response. Note: Usually first we test manually in postman to make sure\n" +
                "functionality is working then we run our script. While developers working on story, we have to\n" +
                "make our feature file, test script, test data ready. We don't create test script/ feature files..\n" +
                "after developer deployed the story.");
        add("For huge set of data (which is more than 50 elements) we keep that data in external files,\n" +
                "then read the file and convert it to string and submit the data as string.\n" +
                "For small data that we create data during runtime I use encapsulation concept of Java. I\n" +
                "create a private variable for each element in my request data, and add setter and getter\n" +
                "methods. When I submit a post call and instantiate that class by using setter methods, and I\n" +
                "pass value to each element. Those values are coming from my feature file. At the end I pass\n" +
                "that Java object to body() method which is coming Rest Assured and submit it.");
        add("Each time we post a request, service generates a unique ID and returns us. By using that ID,\n" +
                "we can find the same record in Database by using GET.");
        add("One of the way to validate response body.\n" +
                "In RestAssured we use JsonPath as part of the body() to extract values and verify.");
        add("● status code validation- I use getStatusCode() method and retrieve the status code of\n" +
                "response. Then using Junit assertions to validate the response.\n" +
                "● each element validation- with JSON paths. To validate the elements, I use\n" +
                "JsonPath.read() method (which is coming jayway.restAssured library), and I pass\n" +
                "JSON path of an element, and it returns me its value.\n" +
                "● schema validation- I validate the whole JSON schema with JSONchemaValidator.");
        add("● Parse into JSonPath and use getInt(), getList(), getString() to read the ID value and\n" +
                "use JUnit assertion: \n" +
                "String body = ...thenReturn().body().asString();\n" +
                "JsonPath json = new JsonPath(body);\n" +
                "assertEquals(123, json.getInt(\"Id\"));\n" +
                "\n" +
                "Deserialize into a POJO object (or Object Mapping)\n" +
                "POJO myPojo = ... when().post(url).thenReturn().body().as(Pojo.class);\n" +
                "assertEquals(123,myPojo.geId());");
        add("Serialization; when we MAP a Java object (POJO (Plain Old Java Object), BEANS) to\n" +
                "JSON format (CONVERT JAVA OBJECT TO JSON);\n" +
                "{make: \"Toyota\"," +
                "Model: \"Camry\" }\n" +
                "Car car = new Car();\n" +
                "car.setMake(\"Toyota\");\n" +
                "car.setModel(\"Camry\");\n" +
                "given().body(car).when().post(uri);\n" +
                "\n" +
                "Deserialization; convert JSON/XML → Java Object.\n" +
                "Car car2 = new Car();\n" +
                "car2=when().get(uri).body().as(Car.class);\n" +
                "car2.setMake(\"Toyota\");\n" +
                "car2.setModel(\"Camry\");\n");
        add("Encapsulation: POJO/Beans class.\n" +
                "Inheritance: TestBase class, I read all this data and load properties object than other\n" +
                "classes in extends TestBase class (which is an Inheritance concept of Java) and use all data\n" +
                "in properties object.\n" +
                "Polymorphism: Assert class.\n" +
                "Abstraction: I use an interface for AuthenticationUtility. Each type of user I have a different\n" +
                "implementation of that interface.");
        add("● POJO- stands for Plain Old Java Object.\n" +
                "● POJOs are used for increasing the readability and re-usability of a program.\n" +
                "● All properties private (use getters/setters)\n" +
                "● POJO is an object which encapsulates Business Logic\n" +
                "● Following image shows a working example of POJO class. Controllers interact with\n" +
                "your business logic which in turn interact with POJO to access the database. In this\n" +
                "example a database entity is represented by POJO. This POJO has the same\n" +
                "members as the database entity.");
        add("The test environment is a set of parameters that match certain configuration of tests.\n" +
                "Includes API endpoints, authentication profiles, database connection settings, project\n" +
                "properties.");
        add("1. I had an Environment utility class to handle the information related to 3 different\n" +
                "environments. This class loads the information specific to each information from the\n" +
                "properties file for that environment. I can pass the environment type form the main\n" +
                "configuration.properties file or I can pass it from the command line.\n" +
                "2. I created steps to auto generate test data using api. This way my test cases don’t have\n" +
                "dependency on environment specific test data.");
        add("1. For one of the services, I pass an element named subscriberFirstName in request.\n" +
                "And value of that element cannot be more than 25 spellings. If the length of value is\n" +
                "more than 25, then application will keep first 25 and truncate rest of it. To test this\n" +
                "functionality, I passed a value with 40 spellings and submitted that request and went to\n" +
                "database, found that record and validated if the application actually truncated the value\n" +
                "before it saved it in database.\n" +
                "1. When we submit a GET call we get a response and service picks that response from\n" +
                "its database and passes it to us. We have an API that returns list of payments. We can\n" +
                "retrieve different results based on our search criteria. (like we can get payments made\n" +
                "between certain dates, or made from/to certain companies, etc.). By using API I\n" +
                "retrieve list of payments that are made last two months. And also I write a query to\n" +
                "retrieve the same result from database. Then I compare the result of Database and\n" +
                "API response. They should match. If the API response is different than Database\n" +
                "response it means API doesn't pick correct data and It is a bug");
        add("1. Change in UI verify in DB and RestFul API- I go to UI and add new data, then I go to\n" +
                "DB and verify if new record is added and all data is matching. Then I send GET\n" +
                "request and verify if new record was added successfully and all data is matching.\n" +
                "2. Change in RestFul API and verify in DB and UI- I POST a record using POST\n" +
                "request, then send GET request to verify. Then I go to DB and run a SQL query to\n" +
                "verify if record added successfully and all data is matching. Then I go to UI and check\n" +
                "if record displays.\n" +
                "3. Change in DB and verify in RestFul API and UI- insert a table in DB, send a GET\n" +
                "request and verify JSON is matching with table, go to UI and check if new record is\n" +
                "displaying.");
        add("I am using content type to make sure that my response type is JSON format.");
        add(".params(\"limit\",100)\n" +
                ".pathParams(\"employee_id\",110)");
        add("I use password encoders. I save encoded version of password in th eproperties file and in\n" +
                "the code I decode the password before use it.");
        add("Since we are using Cucumber, I attach each request and response to my cucumber report.\n" +
                "After I tested a scenario, I generate cucumber report and saved that report in Share Point. (I\n" +
                "take backup of the report). When I face similar situations, I can show that report. And also, I\n" +
                "can take Unique ID from report and find the same result from database with this ID and prove\n" +
                "it.");
        add("● Missing or duplicate functionality.\n" +
                "● Security.\n" +
                "● Performance Issues (API response time is very high).\n" +
                "● Response Data is not structured correctly (JSON or XML).\n" +
                "● Incorrect handling of valid argument values.\n" +
                "● Multi-threading issues\n" +
                "● Reliability Issues. Difficulty in connecting and getting a response from API.");
        add("● Selecting proper parameters and its combinations.\n" +
                "● Categorizing the parameters properly.\n" +
                "● Proper call sequencing is required as this may lead to inadequate coverage in testing\n" +
                "● Verifying and validating the output\n" +
                "● Due to absence of GUI it is quite difficult to provide input values.");

    }};

    }
