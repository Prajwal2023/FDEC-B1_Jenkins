pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                git branch: 'main', url: 'https://github.com/rajatpzade/studentapp.ui.git'
            }
        }
        stage('Build') { 
            steps {
              sh '/opt/apache-mevenmvn clean package'
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