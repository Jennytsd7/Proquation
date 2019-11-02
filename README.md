Configuration for Proquation

Follow the following steps to setup the environment for Proquation:
Clone the project folder from github.
https://github.com/Jennytsd7/Proquation.git
Create a new workspace in eclipse keeping the root directory of the cloned git repo.
Create a new maven project and select archetype as webapp. Enter “Group ID” as com.ser515 and “Artifact ID” as Proquation.
Right click on the project and go to Build path → Configure Build Path
Under the libraries select the correct jre version running on your system.
Download and configure environment variables for Maven version 3.6.2.
Check mvn -version in the command prompt.
Select project and then Run → Run As → Maven Install
Download Tomcat 8.0.50.
Under servers tab next to the console in eclipse, setup a new tomcat server and select the tomcat root directory which configuring.
Download MySQL database from the below link 
https://dev.mysql.com/downloads/mysql/ - In this link click on looking for latest GA version? And select version 5.7.27 and the respective operating system.
For mac, please check the steps mentioned in the below link:
https://dev.mysql.com/doc/refman/5.7/en/osx-installation-pkg.html
During installation, select custom install. Then click on edit and select current GA in the filters. Then select MySQL server, Connector/J and MySQL Workbench.
I will leave a video in the MySQL setup folder outside this file if you didn’t follow this step. Please refer to that.
Leave the port numbers as it is. Please refer the image in MySQL folder.
Enter password as root. Add a new user with username as admin and password as root. Take a look at the two images attached in the MySQL folder.
Once setup is done, create a database called “proquation” in MySQL command line.
Setup database with eclipse. Since we are using maven project, the downloaded mysql jar file will in m2 folder in users.
