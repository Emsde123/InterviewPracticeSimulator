package QuestionsDB;

import java.util.ArrayList;

public class JavaQuestions {

    public static ArrayList<String> JavaQuestions = new ArrayList<>(){
        {
            add("#1 What are Access Modifiers (Public, Protected, Private & Default)?");
            add("#2 What is a main method?");
            add("#3 Why do we need one in java?");
            add("#4 Do we have to have a main method in java?");
            add("#5 Explain Public Static void main (String args[])?");
            add("#6 What is java regular expression?");
            add("#7 What is constructor?");
            add("#8 Use of constructor in class");
            add("#9 Can you make the constructor static?");
            add("#10 What is difference between constructor and method?");
            add("#11 Can we overload a constructor?");
            add("#12 Explain OOPS concepts?");
            add("#13 Is Java 100% object oriented?");
            add("#14 What is Encapsulation?");
            add("#15 What is inheritance and benefits of it?");
            add("#16 Types of Inheritance?");
            add("#17 How do you use it in your code?");
            add("#18 What is Polymorphism?");
            add("#19 Types of Polymorphism");
            add("#20 Method overloading & overriding?");
            add("#21 How do you use it in your framework?");
            add("#22 Can you override a static method?");
            add("#23 Can we override/overload main method? Explain the reason");
            add("#24 Can we overload and override private method?");
            add("#25 Can we achieve 100% abstraction in JAVA?");
            add("#26 What is the difference between a class and interface?");
            add("#27 Give an Example of interface from your framework");
            add("#28 Difference between abstract class and interface?");
            add("#29 When to use abstract class and interface in Java?");
            add("#30 this vs. this()");
            add("#31 Super vs. super()");
            add("#32 Can a super() and this() keywords be in the same constructor?");
            add("#33 Which versions of Java have you worked with?");
            add("#34 What version of Java do you currently use in your framework?");
            add("#35 What are the primitives and wrapper classes?");
            add("#36 What is the difference between String and StringBuffer/StringBuilder?");
            add("#37 What is mutable and immutable?");
            add("#38 StringBuffer vs. StringBuilder?");
            add("#39 What is local and instance variable?");
            add("#40 How do you access the instance variable?");
            add("#41 How can we access a variable without creating an object instance of it?");
            add("#42 Differences between Instance Variable and Static Variable?");
            add("#43 What is Static keyword in Java?");
            add("#44 Where did you use Static in your framework?");
            add("#45 What the difference is between wait and sleep in java?");
            add("#46 What is collection in Java and what type of collections have you used?");
            add("#47 What is Map/ HashMap?");
            add("#48 How did you use Map/HashMap it in your framework?");
            add("#49 Difference Hashtable vs. HashMap ?");
            add("#50 What are the differences between Array & ArrayList?");
            add("#51 Difference between ArrayList vs LinkedList?");
            add("#52 What is the difference between ArrayList and Vector?");
            add("#53 What is the difference between ArrayList and HashSet?");
            add("#54 Difference between HashSet vs HashMap ?");
            add("#55 What is the difference between final, finally and finalize?");
            add("#56 What is garbage collector and how to call Garbage Collector?");
            add("#57 What is the difference between throws and throw?");
            add("#58 How can you handle exceptions?");
            add("#59 What is the parent of all exceptions?");
            add("#60 Types of exceptions you have faced in your project");
            add("#61 How many catch blocks can you have?");
            add("#62 Which catch block will get executed if you get ArithmeticException?");
            add("#63 What is Singleton and have you used Singleton concept in your project ?");
            add("#64 When is an example of a practical time to use abstraction?");
        }
    };

    public static ArrayList<String> javaAnswers = new ArrayList<>(){
        {
            add("1. Java provides access modifiers to set access levels for classes, variables, methods and constructors.\n" +
                    "public: A class or interface may be accessed from outside the package. Constructors, inner classes,\n" +
                    "methods and field variables may be accessed wherever their class is accessed.\n" +
                    "protected: Accessed by other classes in the same package or any subclasses of same package or\n" +
                    "different package.\n" +
                    "private: Accessed only within the class in which they are declared.\n" +
                    "default: When no access modifier is specified for a class , method or data member – It is said to be\n" +
                    "having the default access modifier by default.");
            add("2. Main method is the starting point of an application. JVM starts execution by invoking the main method of\n" +
                    "some specified class, passing it a single argument, which is an array of strings.");
            add("3. Whenever I execute a\n" +
                    "program, the main() is the first function to be executed. I can call other functions from main to execute\n" +
                    "them.");
            add("4. It is not mandatory to have main method in Java, without main() my Java code will compile but\n" +
                    "won’t run. ");
            add("5. public: it is a access specified that means it will be accessible by any Class.\n" +
                    "static: is a keyword to call this method directly using class name without creating an object of it. void: it\n" +
                    "is a return type i.e. it does not return any value.\n" +
                    "main(): it is the name of the method which is searched by JVM as a starting point for an application with\n" +
                    "a particular signature only. it is the method where the main executions occurs.\n" +
                    "string args[]: it’s a command line argument passed to the main method.");
            add("6. Regular Expressions or Regex (in short) is an API for defining String patterns that can be used for\n" +
                    "searching, manipulating and editing a text. Regular Expressions are provided under java.util.regex\n" +
                    "package.");
            add("7. A constructor in java is a block of code similar to a method. Constructor is called when an instance of a\n" +
                    "class is created.");
            add("8. The primary use of constructor is to initialize the instance and/or class variables. Constructors are\n" +
                    "special function which are called automatically when I create object of the class.\n" +
                    "Once I create object of the class, all the variables get initialized and I do not need to write extra code for\n" +
                    "initialization of variables.");
            add("9. Constructors cannot be abstract, final, static.\n" +
                    "Constructor is the property of an object while static has nothing to do with object. That is why there is\n" +
                    "nothing like static constructor. But I have a static block to do the similar task as constructor i.e.\n" +
                    "initialization of fields etc.");
            add("10. • Constructor must not have return type whereas method must have return type.\n" +
                    "• Constructor name same as the class name whereas method may or may not the same class\n" +
                    "name.\n" +
                    "• Constructor will be called automatically whenever object is created whereas method invoke\n" +
                    "explicitly.\n" +
                    "• Constructor compiler provide default constructor whereas method compiler does not provide.");
            add("11. Yes, I CAN OVERLOAD A CONSTRUCTOR (using different parameters)");
            add("12. OOP concepts in Java are the main idea behind Java’s Object Oriented Programming.\n" +
                    "They are an abstraction, inheritance, polymorphism and encapsulation.\n" +
                    "• Inheritance is a mechanism in which one object acquires all the properties and behaviors of\n" +
                    "parent object.\n" +
                    "• Polymorphism is the ability of an object to take on many forms.\n" +
                    "• Abstraction is the methodology of hiding the implementation of internal details and\n" +
                    "showing the functionality to the users.\n" +
                    "• Encapsulation is a mechanism of binding code and data together in a single unit.");
            add("13. No, Java is not 100% object oriented, since it has primitive data types, which are different from objects.");
            add("14. It is the technique of making the fields in a class private and providing access to the fields via public\n" +
                    "methods. If a field is declared private, it cannot be accessed by anyone outside the class, thereby hiding\n" +
                    "the fields within the class. Therefore encapsulation is also referred to as data hiding. The main benefit of\n" +
                    "encapsulation is the ability to modify our implemented code without breaking the code of others who use\n" +
                    "our code. With this Encapsulation gives maintainability, flexibility and extensibility to our code.\n" +
                    "EXAMPLE: Partial example of Encapsulation I can achieve in my framework through POM classes, where I declare\n" +
                    "the data members as private and initialization of data members will be done using Constructor to utilize\n" +
                    "those in methods.");
            add("15. The process of acquiring properties (variables) &methods (behaviors) from one class to another\n" +
                    "class is called inheritance. The biggest benefit is code reusability. It saves time, and effort.");
            add("16. • Single Inheritance - single base class and single derived class.\n" +
                    "\n" +
                    "• Hierarchical Inheritance - when a class has more than one child classes (sub\n" +
                    "classes)\n" +
                    "\n" +
                    "• Multilevel Inheritance - single base class, single derived class and multiple\n" +
                    "intermediate base classes.\n" +
                    "\n" +
                    "• Multiple Inheritance - multiple classes and single derived class (Possible\n" +
                    "through interface only)\n" +
                    "\n" +
                    "• Hybrid Inheritance - combination of both Single and Multiple Inheritance\n" +
                    "(Possible through interface only)");
            add("17. We achieve inheritance with extends keyword.\n" +
                    "In our current Cucumber framework we have BaseClass where we initialize and read Property file,\n" +
                    "initialize WebDriver interface. And after we extend the Base Class in other classes such as Pages, Tests\n" +
                    "and Utility Class. ");
            add("18. Polymorphism is the ability of an object to take on many forms. Polymorphism allows us to perform a\n" +
                    "task in multiple ways. Combination of overloading and overriding is known as Polymorphism.");
            add("19. There are two types of Polymorphism in Java\n" +
                    "1. Compile time polymorphism (Static binding) – Method overloading\n" +
                    "2. Runtime polymorphism (Dynamic binding) – Method overriding");
            add("20. Method overloading is the act of having multiple methods with the same name," +
                    "and only changing the parameter list so that the only method that is called is the method with matching params." +
                    "Overriding is when the child class takes a method from the parent through inheritance, and defines the body.");
            add("21. Selenium WebDriver provides an interface WebDriver, which consists of abstract methods getDriver() and\n" +
                    "closeDriver(). So any implemented class with respect to browser can override those methods as per their\n" +
                    "functionality, like ChromeDriver implements the WebDriver and can override the getDriver() and\n" +
                    "closeDriver().");
            add("22. No! Static methods are bounded with class it is not possible to override static methods");
            add("23. We cannot override static method, so we cannot override main method. However, you can overload\n" +
                    "main method in Java. But the program does not execute the overloaded main method when you run\n" +
                    "your program; you have to call the overloaded main method from the actual main method. Practically I\n" +
                    "do not see any use of it and we don’t use it in my framework. ");
            add("24. It is possible to overload a private method in java but it is not possible to override it, because these\n" +
                    "methods are specific to classes and not visible in child classes. .");
            add("25. We cannot achieve 100% abstraction in JAVA unless we use Interfaces");
            add("26. Class\n" +
                    "• Class will contain concrete methods\n" +
                    "• Class is extended\n" +
                    "• We can create an Object of the class\n" +
                    "• Class can inherit only one Class and can implement many interfaces\n" +
                    "Interface\n" +
                    "• Interface will have Interface keyword.\n" +
                    "• Interface will contain only abstract methods\n" +
                    "• We cannot create object of interface\n" +
                    "• Interface needs to be implemented\n" +
                    "• Class can extends many interfaces\n" +
                    "• We need to provide implementation to all methods when we implement interface to the class");
            add("27. Basic statement we all know in Selenium:\n" +
                    "WebDriver driver = new ChromeDriver();\n" +
                    "WebDriver itself is an Interface. I am initializing Chrome browser using Selenium\n" +
                    "WebDriver. It means I am creating a reference variable (driver) of the interface\n" +
                    "(WebDriver) and creating an Object. Here WebDriver is an Interface and ChromeDriver is\n" +
                    "a class");
            add("28. One of the biggest differences is that interfaces can not have state, \n" +
                    "where abstract class can have state with instance variables.");
            add("29. Abstract classes should be mostly used for objects that are closely related\n" +
                    "whereas interfaces are best suited for providing a common functionality to unrelated classes.\n" +
                    "● An abstract class is good if you think you will plan on using inheritance since it provides a common\n" +
                    "base class implementation to derived classes.\n" +
                    "● An abstract class is also good if you want to be able to declare non-public members. In an\n" +
                    "interface, all methods must be public.\n" +
                    "Also, abstract classes are nice because you can add methods without breaking implementation.");
            add("30.  - this keyword is used to refer current object and differentiate between local and instance variables, \n" +
                    " -this() is used to access one constructor from another where both constructors belong to the same class.");
            add("31. Both are used in a subclass as a way to invoke or refer to its superclass.\n" +
                    "• super keyword is used to call super class(parent class/ base class) variables and methods by the\n" +
                    "subclass object when they are overridden by subclass.\n" +
                    "• super() is used to call super class constructor from subclass constructor.");
            add("32. I can use super() and this() only in constructor not anywhere else, any attempt to do so will lead to\n" +
                    "compile-time error. this() and super() are always have to be in first line within constructor and for that\n" +
                    "reason we CANNOT use them within same constructor. I have to keep either super() or this() as the first\n" +
                    "line of the constructor but NOT both simultaneously.");
            add("33. Java SE 7 \n" +
                    "Java SE 8 \n" +
                    "\n" +
                    "Java SE 9 \n" +
                    "Java SE 10\n" +
                    "\n" +
                    "Java SE 11 ");
            add("34. I am currently using Java 10 in my framework.");
            add("35. Primitives are data types in Java. There is total of 8 primitive data types in Java: byte, short, int, long,\n" +
                    "float, double, char, boolean.\n" +
                    "Every primitive data type has a class dedicated to it and these are known as wrapper classes.\n" +
                    "These classes wrap the primitive data type into an object of that class.");
            add("36. The most important difference between String and StringBuffer/StringBuffer in Java is that String object\n" +
                    "is immutable whereas StringBuffer/StringBuilder object is mutable.");
            add("37. Mutable means that the object state or values can be changed after creation. \n" +
                    "Immutable means that the object values are fixed. Like if we try to change a String, it will create a new String.\n" +
                    "If we want to make a String mutable we need to use either StringBuffer or StringBuilder class.");
            add("38. Both Classes are mutable, except StringBuffer is thread-safe (synchronized) and StringBuilder is not\n" +
                    "thread-safe (non synchronized) which makes StringBuilder faster compare to StringBuffer.");
            add("39. • Variables which are declared inside a method, constructor or blocks are called local variables.\n" +
                    "Local variables are created when a method is called and destroyed when the method exits\n" +
                    "• Variables which are declared inside the class, but outside a method, constructor or any block are\n" +
                    "called instance variables.");
            add("40. I can access the instance variable by creating an Object of the class it belongs to. Instance variables are\n" +
                    "created when an object is created with the use of the keyword 'new' and destroyed when the object is\n" +
                    "destroyed.");
            add("41. By declaring variable as a static I can access it from different class without creating an Object - those\n" +
                    "variables called class variables and also known as static variables.");
            add("42. Part 1. Static variables are declared with the “static” keyword in a class, but outside a method, constructor\n" +
                    "or a block. Whereas, Instance variables are declared in a class, without the “static”. To access instance\n" +
                    "variables I need to create an object of the Class it belongs to whereas static variables can be accessed\n" +
                    "without object creation by the class name.\n \n" +
                    "Part 2. Static variables also known as Class variables only have one copy that is shared by all the different\n" +
                    "objects of a class, whereas every object has its own personal copy of an instance variable.\n" +
                    "Instance variables across different objects can have different values and when I make changes to\n" +
                    "the instance variable they don't reflect in other instances of that class whereas class variables\n" +
                    "across different objects can have only one value.\n \n" +
                    "Part 3. Static variables are created when the program starts and destroyed when the program stops.\n" +
                    "Instance variables are created when an object is created with the use of the keyword 'new'\n" +
                    "and destroyed when the object is destroyed.");
            add("43. • Static keyword means that the variable or method belongs to the class and shared between all\n" +
                    "instances.\n" +
                    "• Using static keyword we can access class variables and method without object reference\n" +
                    "• Static methods can not call/refer Non Static members ");
            add("44. In my utility package I have a class where I store common methods, such as wait, switch between frames,\n" +
                    "clicking on buttons, selecting values from drop down. Those methods are written using static keyword and\n" +
                    "I can easily access them in our program.");
            add("45. Both wait() and sleep() methods are used to pause the execution of current thread for some period of\n" +
                    "time.\n" +
                    "sleep()\n" +
                    "• is a method which is used to pause the process for few seconds or the time we want to\n" +
                    "• usage - just to put thread on sleep for time-synchronization\n" +
                    "wait()\n" +
                    "• method, thread goes in waiting state and it won’t come back automatically until we call the\n" +
                    "notify() or notifyAll().\n" +
                    "• usage - is normally done on condition, Thread wait until a condition is true so we use it for for\n" +
                    "multi-thread-synchronization.");
            add("46. Java provides Collection Framework which defines several classes and interfaces to\n" +
                    "represent a group of objects as a single unit.\n" +
                    "\n" +
                    "Maps are not part of Collection but built based on the collection concepts\n" +
                    "In my current project I am mostly using ArrayList and HashMap.");
            add("47. Java Map Interface. A map contains values on the basis of key, i.e. key and value pair. Each key and value\n" +
                    "pair is known as an entry. A Map Contains unique keys. A Map is useful if I have to search, update or delete\n" +
                    "elements on the basis of a key.");
            add("48. Example 1:\n" +
                    "In my current Cucumber framework I work with map object whenever I use Cucumber tables.\n" +
                    "Example 2:\n" +
                    "Whenever I store external data in excel I bring data in a test, in a form of key and value pair.\n" +
                    "In framework I can verify each month using HashMap → Use key for each number from 1-12 and each\n" +
                    "number has a value in months");
            add("49. Both HashMap and Hashtable implement Map Interface\n" +
                    "HashMap\n" +
                    "• HashMap is non synchronized, so it is not-thread safe\n" +
                    "• HashMap is fast\n" +
                    "• HashMap allows one null key and multiple null values\n" +
                    "Hashtable\n" +
                    "• Hashtable is synchronized, so it is thread-safe\n" +
                    "• Hashtable is slow\n" +
                    "• Hashtable does not allow any null key or value");
            add("50. • Arrays are fixed in size but ArrayLists are dynamic in size.\n" +
                    "• Arrays can store homogeneous elements whereas collections can store both.\n" +
                    "Example: in Array I can store either int or String or boolean whereas in Array list I can store all of them\n" +
                    "together\n" +
                    "• To find the size on an Array I use ArrayName.length() and for ArrayList I use\n" +
                    "ArrayListName.size()");
            add("51. ArrayList and LinkedList, both implements List interface and provide capability to store and get objects as\n" +
                    "in ordered collections. Both are non synchronized classes and both allow duplicate elements.\n" +
                    "ArrayList\n" +
                    "• ArrayList internally uses a dynamic array to store the elements.\n" +
                    "• Manipulation with ArrayList is slow because it internally uses an array. If\n" +
                    "any element is removed from the array, all the bits are shifted in memory.\n" +
                    "• ArrayList is better for storing and accessing data.\n" +
                    "LinkedList\n" +
                    "• LinkedList internally uses a doubly linked list to store the elements (consist on value + pointer to\n" +
                    "previous node and pointer to next node)\n" +
                    "• Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit\n" +
                    "shifting is required in memory.\n" +
                    "• LinkedList is better for manipulating data.");
            add("52. Both implement List Interface and maintains insertion order\n" +
                    "ArrayList - is not synchronized, so it is fast.\n" +
                    "Vector - is synchronized, so it is slow.");
            add("53. ArrayList vs. HashSet\n" +
                    "ArrayList and HashSet both are non synchronized collection class\n" +
                    "ArrayList and HashSet can be traversed using Iterator\n" +
                    "ArrayList\n" +
                    "• ArrayList implements List interface\n" +
                    "• ArrayList allows duplicate values\n" +
                    "• ArrayList maintains the order of the object in which they are inserted\n" +
                    "\n" +
                    "• In ArrayList we can add any number of null values\n" +
                    "• ArrayList is index based\n" +
                    "HashSet\n" +
                    "\n" +
                    "• HashSet implements Set interface\n" +
                    "• HashSet doesn’t allow duplicates values\n" +
                    "• HashSet is an unordered collection and doesn’t maintain any order\n" +
                    "• HashSet allow one null value\n" +
                    "• HashSet is completely object based");
            add("54. HashSet\n" +
                    "• HashSet class implements Set interface\n" +
                    "• In HashSet, stores objects (elements or values)\n" +
                    "• HashSet does not allow duplicate elements\n" +
                    "• HashSet permits only single null value.\n" +
                    "• HashSet is not synchronized.\n" +
                    "HashMap\n" +
                    "• HashMap class implements the Map interface\n" +
                    "• HashMap is used for storing Key, Value paired objects.\n" +
                    "\n" +
                    "• HashMap does not allow duplicate keys however it allows having\n" +
                    "duplicate values.\n" +
                    "• HashMap permits single null key and any number of null values.\n" +
                    "• HashMap is not synchronized.");
            add("55. Final keyword\n" +
                    "• Used to apply restrictions on class, methods, and variable.\n" +
                    "• Used to declare constant values. The variable declared as final should be initialized only once\n" +
                    "and cannot be changed.\n" +
                    "• Used to prevent inheritance. Java classes declared as final cannot be extended.\n" +
                    "• Used to prevent method overriding. Methods declared as final cannot be overridden.\n" +
                    "Finally block\n" +
                    "The finally block always executes when the try block exits. This ensures that the finally block is executed\n" +
                    "even if an unexpected exception occurs.\n" +
                    "Finalize() method\n" +
                    "• finalize() is protected method of java.lang.object class and it is inherited to every class we\n" +
                    "create in java.\n" +
                    "• finalize() method is used to perform some clean up operations on an object before it is\n" +
                    "removed from memory.");
            add("58. Garbage collection is the process of looking at heap memory and identifying which objects are in use\n" +
                    "and which are not and deleting unused objects.\n" +
                    "Once object is created it uses some memory and the memory remains allocated till there are references\n" +
                    "for the use of the object.\n" +
                    "When there are no references to an object, it is assumed to be no longer needed. There is no explicit\n" +
                    "need to destroy an object as Java handles the deallocation automatically by using Garbage Collection\n" +
                    "process. Garbage collection in Java happens automatically during the lifetime of the program. Garbage\n" +
                    "collection in java can not be enforced. But still sometimes, we call the System.gc( ) method explicitly.\n" +
                    "System.gc() method provides just a \"hint\" to the JVM that garbage collection should run. It is not\n" +
                    "guaranteed!");
            add("57. throws\n" +
                    "\n" +
                    "• is used to declare an exception, which means it works similar to the try-catch block.\n" +
                    "• is used in method declaration.\n" +
                    "• is followed by exception class names.\n" +
                    "• you can declare multiple exception with throws\n" +
                    "• throws declare at method it might throws Exception\n" +
                    "• used to handover the responsibility of handling the exception occurred in the method to the\n" +
                    "caller method.\n" +
                    "throw\n" +
                    "\n" +
                    "• is used in the method body to throw an exception\n" +
                    "• throw is followed by an instance variable\n" +
                    "• you cannot declare multiple exceptions with throw\n" +
                    "• The throw keyword is used to handover the instance of the exception created by the\n" +
                    "programmer to the JVM manually.\n" +
                    "• throw keyword is mainly used to throw custom exceptions.");
            add("58. An Exception is a problem that can occur during the normal flow of an execution. Depending on\n" +
                    "situation, I can use try, catch, and finally blocks.\n" +
                    "In try block: Code that might throw some exception\n" +
                    "In catch block: I define exception type to be caught and what to do if exception happens in TRY block\n" +
                    "code");
            add("59. Throwable class is parent of all Exceptions");
            add("60. Types of Exception\n" +
                    "1. Checked Exception - are the exceptions that are checked at compile time.\n" +
                    "Example of checked exceptions\n" +
                    "• ClassNotFoundException - Class not found\n" +
                    "• InstantiationException - Attempt to create an object of an abstract class or interface\n" +
                    "• FileNotFoundException - Attempt to open file that does not exist or open file to write but\n" +
                    "have only reading permission\n" +
                    "2. Unchecked Exception - are the exceptions that are not checked at compile time, they are\n" +
                    "Runtime Exceptions.\n" +
                    "Exception faced as part of Java perspective\n" +
                    "• ArithmeticException - Arithmetic error, such as divide-by-zero.\n" +
                    "• ArrayIndexOutOfBoundsException - Array index is out-of-bounds.\n" +
                    "• NullPointerException - Invalid use of a null reference.\n" +
                    "• IllegalArgumentException - Illegal argument used to invoke a method.");
            add("61. There can be any number of catch block for a single try block and it is not necessary that each try block\n" +
                    "must be followed by a catch block. It can be followed by either a catch block or a finally block.");
            add("62. Only the catch block encountered first on the call stack that satisfies the condition for the exception will\n" +
                    "be executed for that particular exception, rest will be ignored.");
            add("63. Yes, I am using Singleton Pattern in my current framework. A singleton class is a class that can have only one object (an instance of the class) at a time. After first\n" +
                    "time, if we try to instantiate the Singleton class, the new variable also points to the first instance\n" +
                    "created. So whatever modifications we do to any variable inside the class through any instance, it\n" +
                    "affects the variable of the single instance created.\n" +
                    "• Singleton pattern restricts the instantiation of a class and ensures that only one instance of the\n" +
                    "class exists in the java virtual machine.\n" +
                    "• The singleton class must provide a global access point to get the instance of the class.\n" +
                    "• Singleton pattern is used for logging, drivers objects");
            add("64. In Page Object Model design pattern, I write locators (such as id, name, xpath etc.,) in a Page Class. I utilize\n" +
                    "these locators in tests but I can’t see these locators in the tests. Literally, I hide the locators from the tests. ");


        }
    };


}
