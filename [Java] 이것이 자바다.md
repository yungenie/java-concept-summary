# 자바 언어 기초
## 1.5 바이트코드 파일과 자바 가상머신

### 바이트 코드 파일
- 바이트 코드 파일은 자바 소스 파일이 컴파일된 파일 입니다.
- 자바 소스 파일 (.java) -> 바이트코드 파일(.class)
- 컴파일 할 때는 javac(java compiler) 명령어로 자바 소스 파일을 컴파일 합니다.
- ex) javac -d hello.java

### 자바 가상 머신
- 바이트 코드 파일을 java명령어로 JDK와 함께 설치된 JVM(Java Virtual Machine)을 구동시켜 OD가 이해하는 완전한 기계어로 변역하고 실행합니다.
- ex) java -cp hello
