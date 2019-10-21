def call(){

    withCredentials([usernamePassword(credentialsId: 'sudipa_nexus', passwordVariable: 'pass', usernameVariable: 'usr')]){
                sh 'cd client;curl -u ${usr}:${pass} --upload-file build.zip http://18.224.155.110:8081/nexus/content/repositories/devopstraining/Gamification/library-${BUILD_NUMBER}.zip;'
              }
          }