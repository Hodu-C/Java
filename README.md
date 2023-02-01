(남궁 성. Java의 정석 3rd Edition. 도우출판, 2016년 02월) 공부 내용 정리 2023.01.30

자바(Java Programming Language)<br>
"Write once, run anywhere"

===

### 자바의 특징

- 운영체제에 독립적
- 객체지향언어 -> 재사용성과 유지보수의 용이성 등
- 자동 메모리 관리(Garbage Collection)
- 네트워크와 분산처리를 지원 -> Java API
- 멀티쓰레드 지원 -> 스케줄링(scheduling)을 자바 인터프리터가 담당
- 동적 로딩(Dynamic Loading) 지원 -> 클래스가 필요한 시점에 로딩
- JVM은 OS에 종속적, Java는 OS와 독립적

### 자바프로그램 실행과정

.java 소스파일 -> javac.exe(컴파일) ->(.class 생성) -> java.exe(인터프리터) -> 실행

- 실행에 필요한 컴파일된 클래스 파일을 로드 -> 파일 검사 -> 지정된 클래스 main 호출
- 올바른 작성
  1.  java를 실행할 때 main 메소드를 포함한 클래스 이름을 적어줘야한다.
  2.  public 클래스가 있는 경우 반드시 소스파일의 이름은 public 클래스와 이름을 일치해야한다.
  3.  public 클래스는 소스파일에 하나만 존재해야한다.

public static void main(String[] args) -> 인터프리터에 의해 호출되는 약속된 부분

#### Q1. 생성되는 클래스 파일을 어디있는지 알고 호출하는지?
