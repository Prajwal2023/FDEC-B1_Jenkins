pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                
            }
        }
        stage('Build') { 
            steps {
              echo 'Build successfully'
            }
        }
        stage('Test') { 
            steps {
                echo 'Test successfully'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'yahoo  Deploy successfully'
            }
        }
    }
}