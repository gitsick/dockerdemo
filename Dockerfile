FROM openjdk:8-jdk-slim

LABEL maintainer=xiaobiao
#将target中的jar包复制到 linux系统中
COPY  target/*.jar   /demo.jar
 #启动命令
ENTRYPOINT ["java","-jar","/demo.jar"]