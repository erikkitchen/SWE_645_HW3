pipeline {
    agent any

    

    stages {
        stage('Create new jar File') {
            steps {
                echo 'Building jar file'
                git branch: 'main', url: 'https://github.com/erikkitchen/SWE_645_HW3.git'
                sh 'rm -rf *.jar'
                //sh 'jar -cvf springboot_studentsurvey_backend.jar .'
                //sh 'jar -cvf springboot_studentsurvey_backend.jar -C ./ .'
                sh 'jar -cvfm springboot_studentsurvey_backend.jar src/main/resources/META-INF/MANIFEST.MF -C ./ .'
            }
        }
            
         stage('Build and push Spring Boot Student Survey image') {
            steps {
        echo 'Building Spring Boot Student Survey image'
        withCredentials([usernamePassword(credentialsId: 'DockerLogin', usernameVariable: 'DOCKERHUB_USER', passwordVariable: 'DOCKERHUB_PASS')]) {
            sh "docker login -u $DOCKERHUB_USER -p $DOCKERHUB_PASS"
            sh "docker build -t erikkitchen/gmuspringbootstudentsurvey:${env.BUILD_ID} ."
            echo 'pushing Spring Boot Student Survey image'
            sh "docker push erikkitchen/gmuspringbootstudentsurvey:${env.BUILD_ID}"
                }
            }
        }
        
        
        stage('Deploy cluster') {
            steps {
                echo 'Deploy cluster through Rancher'
                sh 'kubectl config view'
                sh 'kubectl get deployments'
                script {
                    // Check if the deployment already exists
                    def deploymentExists = sh(returnStdout: true, script: 'kubectl get deployments').trim()
                    
                    // Use if statement to conditionally skip the deployment creation
                    if (deploymentExists) {
                        sh "kubectl set image deployment/gmuspringbootstudentsurveydeploy gmuspringbootstudentsurvey=erikkitchen/gmuspringbootstudentsurvey:${env.BUILD_ID}"
                    } else {
                        // Create the deployment
                        sh "kubectl create deployment gmuspringbootstudentsurveydeploy --image=erikkitchen/gmuspringbootstudentsurvey:${env.BUILD_ID}"
                        sh "kubectl set image deployment/gmuspringbootstudentsurveydeploy gmuspringbootstudentsurvey=erikkitchen/gmuspringbootstudentsurvey:${env.BUILD_ID}"

                    }
                }
                /*sh "kubectl create deployment gmustudentsurveydeploy --image=erikkitchen/gmustudentsurvey:${env.BUILD_ID}"
				sh "kubectl get deployments"
                sh "kubectl set image deployment/gmustudentsurveydeploy gmustudentsurvey=erikkitchen/gmustudentsurvey:${env.BUILD_ID}"*/

            }
        }
    }
}