# WebImages

This is a web project CRUD java using the below tecnologies:

Java / Maven / AngularJS / Rest with Jersey / JPA / Hibernate / Embeded Jetty / Oracle XE

To run the eclipse project on Jetty you will need configure these settings:

Add on your maven settings.xml "${user.home}/.m2/settings.xml"
The following plugin from run Jetty: 
Add between the pluginGroups tags like the example below:

< pluginGroups >
  <pluginGroup>org.mortbay.jetty</pluginGroup>
< / pluginGroups >

And execute the maven command: mvn jetty:run

PS: This project its not finished yet.
