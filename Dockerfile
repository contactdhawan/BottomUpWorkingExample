FROM tomcat:8.0.20-jre8

COPY /target/paymentprocess-svc-1.0.0-SNAPSHOT.war /usr/local/tomcat/webapps/paymentprocess-svc-1.0.0-SNAPSHOT.war
