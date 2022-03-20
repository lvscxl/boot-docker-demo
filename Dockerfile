
#基于openjdk:8-jdk-alpine
FROM java
# 指定当前操作目录
WORKDIR /opt/bootdemo/project/finalName
#容器启动后执行的操作

CMD java -jar finalName.jar