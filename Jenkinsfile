pipeline {
    agent any

    stages {
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
