# ToDo List Service

This is a simple ToDo list service built using Spring Boot. It allows users to create and read ToDo list items. The project includes validation for request parameters and uses Springdoc OpenAPI for API documentation.

## Table of Contents
- [Features](#features)
- [Requirements](#requirements)
- [Project Structure](#project-structure)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)
- [Usage](#usage)
- [Testing](#testing)

## Features
- Create new ToDo list items.
- Read ToDo list items for a specific user.
- Input validation using `javax.validation`.
- API documentation using Springdoc OpenAPI.

## Requirements
- Java 11
- Maven

## Setup
1. **Clone the repository**:
   ```bash
   git clone <repository_url>
   cd <repository_directory>

2. **Build the project**: mvn clean install
3. **Run the application**: mvn spring-boot:run
