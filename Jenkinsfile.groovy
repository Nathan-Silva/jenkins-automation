pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Realizando o Build da aolicacao'
            }
        }

        stage('Tests') {
            steps{
                echo 'Realizando os testes'
            }
        }

        stage('Code Scanner') {
            steps{
                echo 'Escaneando o codigo'
                withSonarQubeEnv('sonarqube_server'){
                    sh './gradlew clean build sonarqube'
                }
            }
        }

        stage('Deploy Kubernetes') {
            steps{
                echo 'Realizando o Deploy em prod K8s'
            }
        }
    }
}