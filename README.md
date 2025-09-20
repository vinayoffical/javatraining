Git--> version control tool
In order to manage the code base


feature/Branch --> added the code 
Main/ Develop --> Develop environment (developer)
Release --> SIT/UAT (System Integration Test (QA))/User Acceptance Testing 
Tag --> Production(Release) --> End user


Git commands-->
1. Cloning the repo in local
git clone <ssh Repo Url>
2. For creating new branch 
git checkout -b <branch_name>
3. To push the changes to remote
git push
4. to commit the changes
git commit -m'<Message>'
5. For switching branch 
git checkout
6. For taking the latest code from remote repo
git pull

Java Basic
1. Var ags
2. Static method can call another static method
3. Static Block execute always first and only one time
4. Overloading and Overriding
5. Overriding Rule
    you can't limit the scope
    you can't throw child exception 
6. Interfaces (Java 8 interface updates) -- static and default method 
7. Abstract Class and interface--> variable of abstract class can be private protected 
    you can implement multiple interface but can't extends multiple abstract
8. Java don't support multiple inheritance.
9. Marker Interface --> serializable, cloneable 
    Provides instruction to do something don't have any method
10. Functional Interface -->@FunctionalInterface --> Lambda Expression
    That contains single abstract method
    example-> comparable,comparator, runnable
11. Exception --> Checked and Unchecked
12. RuntimeException --> is the base class for all the Unchecked
13. Exception Handling--> try catch finally throw and throws
                            Throwable
                    Exception         Errors
               Runtime                OutOfMemory,StackOverflow
Stack is Last In first out 
Queue is First In First out 
14. Collection Framework --> 
                        Iterable(Interface)
                        Collection(Interface)
            List(Interface)    Set(Interface)          Queue(Interface)
            ArrayList(class)   HashSet(class)          PriorityQueue(class)
            LinkedList(class)  LinkedHasSet(class)     ArrayDeque(class)
            Vector(class)      TreeSet(class)
            Stack(class)
Project Started 
Oracle v2012 --> jdbc v12// removed even 
Oracle v2025 --> jdbc v25
For example you company
15. Dependency Management --> maven 
Apache Maven is a build automation and project management tool.
    * Build lifecycle (compile, test,package,deploy) mvn clean install 
    * Dependencies
    * Project Structure(standard director layout)
    * Plugins & goals(extend build capabilities)
    * Project documentation and reporting

Key features
1. Dependency management
2. Convention over Configuration 
3. Build Lifecycle clean(remove old build files) , default(compile,test,package,install,deploy) ,site 
4. Plugins 

important commands:
mvn clean
mvn install
mvn compile
mvn package