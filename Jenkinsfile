pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    
    stages {
        stage('Git Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/dev']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AKDEJESUSG/Java8.git']])
                echo 'Git Checkout Completed'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('ServerNameSonar') {
                    bat '''mvn clean verify sonar:sonar -Dsonar.projectKey=testing-github -Dsonar.projectName='testing github' -Dsonar.host.url=http://localhost:9000''' 
            }
        }
            
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            parallel {
                  stage('Test On Windows') {
                    steps {
                            echo "Testing in windows"
                    }
                  }
                  stage('Test On Linux') {
                    steps {
                            echo "testing in linux"
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
