pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            parallel(
                  stage('Test On Windows'): {
                      steps {
                            echo "This is branch a"
                          }
                  },
                  stage('Test On Windows'): {
                      steps {
                            echo "This is branch a"
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
