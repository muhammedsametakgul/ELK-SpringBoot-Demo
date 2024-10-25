# Spring Boot Logging with ELK Stack (Elasticsearch, Logstash, and Kibana)

This project demonstrates the integration of the ELK stack with a Spring Boot application for centralized logging. By configuring Elasticsearch, Logstash, and Kibana, we can monitor logs in real-time, filter them, and visualize metrics to enhance monitoring and troubleshooting.


## Overview

This demo showcases centralized logging by integrating a Spring Boot application with the ELK stack. ELK allows monitoring of application activity and errors in real-time, offering fast debugging and enhanced insights into application health.

### Why ELK?

The ELK stack provides a solution for centralized logging and real-time data analysis, featuring:
- **Elasticsearch**: Stores logs and enables quick searching.
- **Logstash**: Aggregates and processes log data from various sources.
- **Kibana**: Visualizes logs through a user-friendly interface.

## Architecture

1. **Spring Boot**: Application generates logs.
2. **Logstash**: Collects and processes logs from the Spring Boot application.
3. **Elasticsearch**: Stores processed logs for efficient searching.
4. **Kibana**: Provides a graphical UI for log visualization and querying.
