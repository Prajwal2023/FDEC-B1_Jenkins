pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                git branch: 'main', url: 'https://github.com/Prajwal2023/studentapp.ui.git'
            }
        }
        stage('Build') { 
            steps {
              sh '/opt/apache-maven/bin/mvn clean package'
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
