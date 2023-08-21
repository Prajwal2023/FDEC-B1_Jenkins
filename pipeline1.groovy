pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                git branch: 'main', url: 'https://github.com/rajatpzade/FDEC-B1_Jenkins.git'
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