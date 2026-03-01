def call(String project_name, String image_tag, String dockerhub_user){
  withCredentials([usernamePassword("credentialsId":"dockerHubCred",usernameVariable:"dockerHubUser",passwordVariable:"dockerHubPass")]){
    sh "echo $dockerHubPass | docker login -u $dockerHubUser --pasword-stdin"
  }
  sh "docker push ${dockerhub_user}/${project_name}:${image_tag}"
}
