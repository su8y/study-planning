## jenkins 설치

docker pull jenkins/jenkins:lts

* mount 해줘야 하는 것
    * /var/run/docker.sock
    * /var/jenkins_home
* port
  * 8080
  * 50000

jenkins에서 docker를 사용하기 위해 해줘야 하는 것들 
```sh 
$ curl https://get.docker.com/ > dockerinstall && chmod 777 dockerinstall && ./dockerinstall
apt install docker-compose```

