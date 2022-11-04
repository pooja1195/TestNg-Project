package MavenNotes;

public class ImportantNotes {
/*
** Explain project Structure > 
> File > New > project > MavenProject > Select an archetype :: Filter - org.apache.maven > select quickstart template > Click on Next > 
Select Group ID (package name) > artifact ID (project name) > Click on Finish.

** Quickstart template of maven. 
** Maven provides template for readymade projects
** Use of pom.xml file - We don't add jars in Maven project, instead we are adding "dependency" in pom.xml file by searching "testng/selenium maven dependency" 
   in chrome.
** After add dependency-  right click on project > Maven > update Project > Force update of Snapshots/Releases
** src/main/java - supporting files
** src/test/java - actual test cases repository

**To find location of data.properties file = right click on file > properties > copy location
** Space/semicolon should not there in data.properties file
** File extension should be ".properties" of data.properties file
 
Steps::
1. Create Maven Project
2. Create dependency
3. Create resource package under src/test/java
4. Create data.properties file (key and value) and baseclass (driver initialization code) under resource package
5. Create new package TestCases under src/test/java
6. Create new testcases VerifyLogin under package TestCases
7. Create page Object Model package (POM is design pattern for a framework)
8. For another new page - create another PageObjectmodel class
9. For another new test - create another testcase class

Modifications
1. Driver.get("")/initialize Driver - common code write in Baseclass with annotation "@BeforeMethod". Url mentioned in Data.properties file
2. Change Data.properties file path using ("user.dir").
3. Change ChromeDriver path - WebDriverManager. Add dependency of WebDriverManager
4. Add SoftAssert code in Test Class


 */
}
