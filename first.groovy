pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                echo 'pulling...'
            }
        }
        stage('Building') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}