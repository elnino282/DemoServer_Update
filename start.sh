#!/bin/bash
echo "Starting Spring Boot application..."
java -jar -Dspring.profiles.active=prod target/AgentManagementBE-0.0.1-SNAPSHOT.jar 