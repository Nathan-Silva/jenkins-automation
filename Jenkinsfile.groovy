pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Realizando o Build da aolicacao'
            }
        }
    }
}