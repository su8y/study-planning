node{
    def prjurl = 'https://github.com/su8y/study-planning.git'
    git poll: true, url: prjurl
	stage('Pull'){
	   git prjurl
	}
	stage('Unit Test'){
	}
	stage('Build'){
	   sh './docker_build_all.sh'
	   sh 'docker-compose build'
	}
	stage('Tag'){
	}
	stage('Push'){
	}
	stage('Deploy'){
	    try {
            sh 'docker stop study/discovery-server'
            sh 'docker rm study/discovery-server'
	    } catch(e) {
	        echo "No Starting App"
	    }
	    sh 'docker-compose up'
	}
}