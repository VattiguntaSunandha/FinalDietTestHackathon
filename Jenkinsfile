pipeline {
    agent any
    
    environment{
        PATH = "Downloads/apache-maven-3.8.5-bin/apache-maven-3.8.5/bin:$PATH"
    }

    stages {
        
        
        stage("build code"){
            steps{
                
                bat 'mvn clean install'
                
            }
        }
    }
}

