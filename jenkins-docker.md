## jenkins 설치

docker pull jenkins/jenkins:jdk17

* mount 해줘야 하는 것
    * /var/run/docker.sock
    * /var/jenkins_home
* port
  * 8080
  * 50000

```bash
docker run -d --name jenkins -p 8080:8080 -p 50000:50000 -v /var/run/docker.sock:/var/run/docker.sock -v ~/workspace/jenkins_data:/var/jenkins_home jenkins/jenkins:jdk17
```
jenkins에서 docker를 사용하기 위해 해줘야 하는 것들 
```sh 
$ curl https://get.docker.com/ > dockerinstall && chmod 777 dockerinstall && ./dockerinstall
$ apt install sudo curl docker-compose
```

```

docker 에서 설치한 jenkins를 java 17버전을 위해서 apt-get install로 설치를 해준다.

* apt-get install openjdk-17-jdk -y
