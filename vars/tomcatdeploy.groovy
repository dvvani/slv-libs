def call(source,IP,){
   sshagent(['tomcat']) {
     sh "scp -o StrictHostKeyChecking=no ${source} ec2-user@${IP}:opt/tomcat9/webapps"
                
                sh "ssh ec2-user@${IP} /opt/tomcat9/bin/shutdown.sh"
                sh "ssh ec2-user@${IP} /opt/tomcat9/bin/startup.sh"
   }
                    
}
