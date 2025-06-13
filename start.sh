#!/bin/bash
echo "Starting Spring Boot application..."
java -Dspring.profiles.active=prod -jar target/AgentManagementBE-0.0.1-SNAPSHOT.jar 