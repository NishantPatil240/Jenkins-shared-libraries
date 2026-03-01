def call(String project_name, String image_tag, String dockerhub_user){
  sh "docker build -t ${dockerhub_user}/${project_name}:${image_tag} ."
}
