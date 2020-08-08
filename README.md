# Nagwa Task


[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

This a simple assessment for Nagwa company

*	Implement a test automation framework with an object-oriented design. 
*	Implement customized reports including screenshots for failures. 
*	Follow checkout procedure
* data driven scenario
*	Open google site
* Click sign in link
* With an already created account sign in
* Click compose button
* Send an email to any recipient you want
*	Insure that email sent from sent items inbox



### Tech

This Task  uses a number of open source projects to work properly:

* [JAVA](https://www.java.com/en/download/)
* [SHAFT_ENGINE](https://github.com/MohabMohie/SHAFT_ENGINE)
* [Selenium WebDriver](https://www.selenium.dev/documentation/en/)
* [Rest Assured API ](http://rest-assured.io/) 
* [Allure Report Framework](http://allure.qatools.ru/)
* [Testng](https://testng.org/)

And of course This assessment itself is open source with a [public repository]
 on GitHub.
 
### About the Task 
SHAFT is the Selenium Hybrid Automation Framework for Testing, it is:
- Test Automation Engine.
- A source controlled Java 14 Maven project that is easily and regularly extended and enhanced with new features.
- Provides an easily understandable and user-friendly syntax for writing simple, robust, maintainable, and extendable tests.
- Provides support for Data-Driven, Keyword-Driven, Modular and Behavior-Driven tests.
- Provides extensive, yet user-friendly reporting for test execution.
Fully documented with standard JavaDocs.
- Supports web apps on Chrome, Firefox, Edge, IE, and Safari.
- Supports mobile apps (Native/Hybrid/Web).
- Supports testing APIs.
- Supports testing CLIs.
- Supports testing Databases.
- Supports AI powered Visual Validations using OpenCV and Applitools Eyes.
- Supports test execution on Linux, Windows, Mac, Android, and iOS.
- Supports remote, unattended, parallel, cloud, and dockerized test execution.
- Can be easily integrated with Continuous Integration, and DevOps solutions.

# This project integrates with:
- TestNG
- Selenium WebDriver
- Appium
- Rest Assured
- Cucumber
- Apache POI
- WebDriver Manager
- Allure Reporting
- Selenium Grid
- Zalenium (SauceLabs, BrowserStack, TestingBot, CrossBrowserTesting, LambdaTest)
- Docker-Selenium
- OpenCV
- Applitools Eyes
- Jenkins, GitHub Actions, or any CI/CD tool

And of course This assessment itself is open source with a [public repository]
 on GitHub.

### Installation

- This Assessment requires [JAVA](https://www.java.com/en/download/) v8+ to run.
- Install the dependencies and devDependencies simply run POM.xml 
- How to get started using [SHAFT_Engine](https://github.com/MohabMohie/SHAFT_ENGINE/)
- You can refer to this sample tutorial on how to import your new project into your workspace: https://tools.jboss.org/documentation/howto/git_import_projects.html#clone_uri
- you can run this task Remotley with docker and selenium grid by following the commands at docker-compose_native.yml file

# Plugins

This Assessment is currently working with [Testng](http://dl.bintray.com/testng-team/testng-eclipse-release/) plugin




### Important Notes:
- this a GUI selenium Java project but using SHAFT_Engine 
- By default reports will be automatically generated but you can check the result of the the test by running generate_allure_report.bat
- you can check the results through this [link](https://drive.google.com/file/d/1NGMnt_EYjbR0kA09c7-oerDJ2ozxzM0b/view?usp=sharing)
-	You can change the test mail at the script through excel sheet at this path src/test/recources/TestDataFiles/Google.xlsx  
-	First of all we have to clone the project from github or download it from the drive and then save POM.xml to install the dependencies and install testng plugin ,then we have 3 options :-
•	Run the project from Gmail_Testcases.java
•	Run the project from sampleTestSuite.xml
•	Run the project remotely by docker-compose and selenium Grid  through docker-compose_native.yml and following the instructions inside it


License
----

[MIT](https://opensource.org/licenses/MIT/)
**Free Software** 
