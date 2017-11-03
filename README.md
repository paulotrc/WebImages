# WebImages

This is a web project CRUD java using the below tecnologies:
Java / Maven / AngularJS / Rest / JPA / Hibernate / Embeded Jetty / Enbeded Derby

To run the eclipse project on Jetty you will need configure these settings:

Add on your maven settings.xml "${user.home}/.m2/settings.xml"
The folow plugin from run Jetty: 
Add between the pluginGroups tags like the example below:
<pluginGroups>
  <pluginGroup>org.mortbay.jetty</pluginGroup>
</pluginGroups>

And execute the maven command: mvn jetty:run