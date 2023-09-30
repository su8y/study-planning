cd ./gateway
chmod 777 ./gradlew
./gradlew clean build
cd ../discovery-server
chmod 777 ./gradlew
./gradlew clean build
cd ../config-server
chmod 777 ./gradlew
./gradlew clean build
cd ../analysis
chmod 777 ./gradlew
./gradlew clean build
