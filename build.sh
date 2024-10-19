#!/bin/bash

# Step 1: Install Maven if it's not already installed
if ! command -v mvn &> /dev/null; then
    echo "Maven not found. Installing Maven..."
    # For Ubuntu/Debian systems, use the following commands to install Maven
    sudo apt update
    sudo apt install -y maven

    # Alternatively, for CentOS/RHEL systems, you could use:
    # sudo yum install -y maven
fi

# Step 2: Navigate to the project directory
cd /weightlifter || exit 1  # Change this to your project's path

# Step 3: Clean and install the Maven project (this will also build the JAR)
echo "Cleaning and installing the Maven project..."
mvn clean install

# Check if the build was successful
if [ $? -ne 0 ]; then
  echo "Failed to build the JAR file."
  exit 1
fi

echo "JAR file created successfully."

# Step 4: Build the Docker image
echo "Building the Docker image..."
docker build -t weightlifter-api:latest .

# Check if the Docker image build was successful
if [ $? -ne 0 ]; then
  echo "Failed to build the Docker image."
  exit 1
fi

docker tag  weightlifter-api:latest vinguyen15/weightlifter-api:version1.0

docker push vinguyen15/weightlifter-api:version1.0

echo "Docker image built successfully."