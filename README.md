# AEM Email MBean

This project exposes an MBean which allows users to test the email service without having to configure a Workflow or define code.

Go to http://localhost:4502/system/console/jmx/com.adobe.aem.core.email.jmx%3Atype%3DEmailService

Provide the necessary information in the attributes and click send()

Alternatively you can inline everthing in the other send() function

## Archetype 

mvn -B org.apache.maven.plugins:maven-archetype-plugin:3.2.1:generate \
 -D archetypeGroupId=com.adobe.aem \
 -D archetypeArtifactId=aem-project-archetype \
 -D archetypeVersion=36 \
 -D appTitle="Email Service" \
 -D appId="emailservice" \
 -D groupId="com.adobe.aem" \
 -D artifactid="email-service" \
 -D aemVersion="6.5.12"
