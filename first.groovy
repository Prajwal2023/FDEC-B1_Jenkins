pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                echo 'pull successfully '
            }
        }
        stage('Build') { 
            steps {
                // 
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