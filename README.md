# JavaSpringBootCRUD
A Java Spring-Boot Application to add Aliens and do CRUD Operations on them.
Created With: Java, SpringBoot Framework, Bootstrap, CSS, JSP and H2 DataBase.
Download the Project and you are good to go!

Every Alien has 5 Columns: a) Id / Serial_Number, b)Alien Name. 
                                                            ********"Id is the Primary Key"********

Steps on Use: 1] Open the project on IntelliJ or Eclipse or STS. Run it, Tomcat will start at port 8080. Use "http://localhost:8080", to go the Entry Page.

2] Use [ http://localhost:8080/h2-console ] to access the database which is H2 an in memory database. Then Test the connection and "Connect" to the database.

3] Click On the ALIEN table on the left and click RUN. We can see the changes after each Operation after Clicking run after Each Operation.

4] In the Home Page, Enter the details and Click on "Add Alien" to isert the student entry at database <== ADD / Insert / CREATE. After Adding / Inserting the Details will be shown on a new Page, it will have a "HOME" Button to come back to home.

5] To update the details, Fill up the details on the second form and click "Update Alien" to Update the Details of the Student <== UPDATE After Updating the Details will be shown on a new Page, it will have a "HOME" Button to come back to home.

6] To Find/Get the details of a Alien Fill up the Id/Serial Number of the Student in the 4th table and click "Fetch Student" <== GET After Fetching the details of the Student will be Shown on a new Page with a HOME Button to go back.

7] To delete fill the Id of the Alien in the 5th table, and click "Delete Student" to delete the Sudent from the Database. <== DELETE After Deleting the details of the Student will be Shown on a new Page with a HOME Button to go back.

After doing each Operation we can see the CRUD Operations on the Database from "http://localhost:8080/h2-console", and Connecting to the Database. After which we need to click on the ALIEN Table and click RUN.
