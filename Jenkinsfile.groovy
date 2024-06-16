pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Realizando o Build da aolicacao'
            }
        }

        stage('Tests') {
            echo 'Realizando os testes'
        }

        stage('Code Scanner') {
            echo 'Escaneando o codigo'
        }

        stage('Deploy Kubernetes') {
            echo 'Realizando o Deploy em prod K8s'
        }
    }
}