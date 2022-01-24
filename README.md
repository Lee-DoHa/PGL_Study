# **PGL_Study**

## **Java 기본 문법**
생활코딩(https://www.youtube.com/watch?v=-dPXqgWQBGE&list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR&index=1)영상으로 학습

*자세한 내용은 코드 및 주석 참고*


## **Java Spring Boot**
### **Chapter1.Basic**
#### #1 *JAVA 프로젝트*
* **JVM** = Java Virtual Machine : java Bytecode를 받고 그걸 기계어로 컴퓨터에게 전달해줌
* **JRE** = Java Runtime Environment : java를 실행하기 위한 환경(이 안에 JVM과 JVM이 쓰는 라이브러리 포함)
* **JDK** = Java Development Kit : java 언어를 java Bytecode로 만드는 과정 - 컴파일

MacOS에 맞게 home brew를 이용해서 JDK설치

명령어

    ~ /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
    ~ brew install adoptopenjdk11

#### #2 *Code Editor와 IDE*
* **OpenJDK** -> Java 코드를 실행하기 위한 프로그램 / **IntelliJ IDEA** -> Java 코드를 효율적으로 작성하기 위한 도구 
* **Code Editor** : 프로그래밍 언어에 따라 문법 검증 및 편집 편의성 제공 (ex. VSCode)
* **IDE** : 사용하는 언어 및 프레임워크에 따라 다양한 기능 제공 (ex. Visual Studio, Xcode)


본 교육에서는 **IntelliJ**를 사용
#### #3 *Docker Setting*
* **Docker** : 컨테이너 개념을 활용한 가상화 기술의 일종 -> OS 위에 컨테이너를 올려 어플리케이션을 활용(이전의 가상화 기술에 비하여 훨씬 가볍다.)
* **MySQL / redis / RabbitMQ** 등 웹 어플리케이션 개발에 필요한 다양한 소프트웨어의 설치를 간소화 해준다.

본 교육에서 **Docker(MAC OS)** 버전으로 설치

    ~ docker --help                                     //docker 명령어 모음
    ~ docker --version                                  //현재 docker 버전 확인
    ~ docker run -d -p 80:80 docker/getting-started     //docker 시작하기 
#### #4 *Client-Server Model*
* **Spring Boot** - (web)Application Framework
* **Front** -> Html(브라우저에 표시될 내용을 기술하는 언어) / CSS(표현되는 형식을 정의하는 언어) / JS(브라우저에 동작을 제공하는 언어)
* **Frontend 개발자** - 브라우저에 보이는걸 중점으로 공부하는 개발자(React 등)
* **Backend 개발자** - 상황에 맞는 로직과 데이터를 다루는 개발자
* **인터넷(Internet)** - 원격으로 연결된 수많은 컴퓨터들이 이루는 네트워크

**결론** -> Spring Boot : HTTP 요청 등을 받으면 요청에 따른 응답을 돌려주는 Web Application을 만드는 Framework


#### #5 *Spring Boot 프로젝트 시작하기*
* Spring 시작하기 **(https://start.spring.io/)**
* **Gradle Project** 선택, **2.5.8**버전, **Group**은 (ex. dev.어쩌구저쩌구), **Jar** 선택, **Java버전 11**, **Dependencies**는 추후 하나씩 추가하면서 배울 예정

### Chapter2

#### #1 *Build Automation Tool*
* Java로 이뤄진 프로젝트는 '.java'파일에 정의된 Java Source 코드로 구성된다.
* javac = Java Compiler, (comfile : 소스코드를 기계어로 바꾸는 과정)

Maven - Java를 위한 Build Automation Tool
* C#, Ruby 등의 다른 언어를 위해서도 사용 가능
* Project Object Model(POM)
* xml의 형태로 프로젝트를 정의
* pom.xml을 분석해 프로젝트 빌드

Gradle - Java를 위한 Build Automation Tool
* C, C++, Javascript 등을 위해서도 사용할 수 있다.
* build.gradle
* groovy라는 언어로 프로젝트 정의
* Sub-project 등을 포함시키는 용도의 settings.gradle도 있다.
* Kotlin을 사용하여 정의할 수도 있다.(build.gradle.kts)

#### #2 *Spring Boot 실행하기*
* Presentation Layer : 사용자와 직접적으로 맞닿는 부분
* Logic Layer : 요청을 처리하는 결정을 내리는 부분
* Data Layer : 데이터를 저장하고 불러오는 부분

<img width="1293" alt="스크린샷 2022-01-24 오후 1 41 40" src="https://user-images.githubusercontent.com/70997596/150723332-972bc2bd-defb-40f6-9fe7-65b67b424dc8.png">

* Dispatcher Servlet : http 요청 같은거
* Controller : Dispatcher Servlet의 직접적인 요청을 받는 부분. class 형태
* Service : Controller가 검증해낸 요청을 받아서 사용자의 입력에 따른 데이터의 조작을 결정해주는 부분. class
* Repository : Data의 표현을 받아서 저장하고 불러와서 데이터를 돌려주는 부분.


#### #3 *Spring IoC*
* 코드 참조

### Chapter3

### Chapter4

### Chapter5

### Chapter6

### Chapter7

### Chapter8

### Chapter9




