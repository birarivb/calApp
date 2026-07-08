pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    environment {
        SONAR_TOKEN = credentials('sonar-token')
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/birarivb/calApp.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }


    }
}
