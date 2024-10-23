def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials{[usernamePassword(credentialId: 'docker', passwordVariable:'dockerHubPass', usernameVariable: 'dockerhubuser')])
                 sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
                 }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTage}
}
