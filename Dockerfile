# 베이스 이미지 선택 (OpenJDK 17 사용 예시)
FROM openjdk:17-jdk-slim

# 작업 디렉토리 설정
WORKDIR /app

# JAR 파일 복사
COPY build/libs/*.jar app.jar

# 포트 노출
EXPOSE 8080

# 환경 변수로 profile 설정
ENTRYPOINT ["java", "-jar", "app.jar"]