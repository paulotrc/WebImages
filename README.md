# WebImages

This is a web project CRUD java using the below tecnologies:
Java / Maven / AngularJS / Rest / JPA / Hibernate / Embeded Jetty / Enbeded Derby

Para rodar no Jetty:

Adicionar no seu arquivo de configurações do maven:
${user.home}/.m2/settings.xml

O seguinte Plugin do Jetty:
<pluginGroups>
  <pluginGroup>org.mortbay.jetty</pluginGroup>
</pluginGroups>

executar mvn jetty:run