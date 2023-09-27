node{
    def prjurl = 'https://github.com/su8y/study-planning.git'
    git poll: true, url: prjurl
	stage('Pull'){
	   git prjurl
	}
	stage('Unit Test'){
	}
	stage('Build'){
	   sh 'pwd'
	   sh 'cd /var/jenkins_home/workspace/studyplanning-app/discovery-server'
	   sh 'pwd'
	   //sh 'docker build -t discovery-server .'
	}
	stage('Tag'){
	}
	stage('Push'){
	}
	stage('Deploy'){
	}
}