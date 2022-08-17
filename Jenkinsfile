pipeline {
    agent any
    
    environment{
        PATH = "Downloads/apache-maven-3.8.5-bin/apache-maven-3.8.5/bin:$PATH"
    }

    stages {
        stage("clone code") {
            steps {
                git credentialsId: 'MyGithub', url: 'https://github.com/VattiguntaSunandha/FinalDietTestHackathon.git'
            }
        }
        
        stage("build code"){
            steps{
                sh "mvn clean install"
            }
        }
    }
}
