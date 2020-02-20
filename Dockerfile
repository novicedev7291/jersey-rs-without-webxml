FROM jboss/wildfly:latest

EXPOSE 8080

COPY target/myapp.war /opt/jboss/wildfly/standalone/deployments/

RUN /opt/jboss/wildfly/bin/add-user.sh admin test@123 --silent

CMD /opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0
