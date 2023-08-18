pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                echo 'pull successfully'
            }
        }
        stage('Build') { 
            steps {
              echo 'pull successfully'
            }
        }
        stage('Test') { 
            steps {
                // 
            }
        }
        stage('Deploy') { 
            steps {
                // 
            }
        }
    }
}