김영한님의 [스프링 핵심 원리 - 고급편](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B3%A0%EA%B8%89%ED%8E%B8/dashboard?cid=327901) 실습 코드 아카이브

---

### 💻 Development Environment

* Java 21
* Spring Boot 4.0.3
* Gradle
* IDE: IntelliJ

### 🏆 실습 목표

* 디자인 패턴(템플릿 메서드, 전략, 프록시, 데코레이터 패턴)을 활용하여 핵심 비즈니스 로직과 부가 기능(로그 추적 등)을 분리하는 객체지향 설계 기법 숙달
* 동시성 문제의 원인을 파악하고 `ThreadLocal`을 활용하여 쓰레드 안전한 애플리케이션 구현
* 리플렉션, JDK 동적 프록시, CGLIB 등 동적 프록시 생성 기술의 원리를 이해하고 스프링 `ProxyFactory`와의 관계 파악
* 스프링 AOP의 핵심 개념(포인트컷, 어드바이스)을 이해하고, 발생하는 프록시 내부 호출 문제 등 트러블슈팅 역량 확보

### 📝 Curriculum

1. [**예제 만들기**](https://mxxikr.github.io/posts/spring-advanced-example-log-tracer/)
   * 로그 추적기 요구사항 분석 및 V0~V2(파라미터 동기화) 애플리케이션 점진적 개발


2. [**쓰레드 로컬 - ThreadLocal**](https://mxxikr.github.io/posts/spring-advanced-thread-local/)
   * 멀티 쓰레드 환경에서의 동시성 문제 원인 파악
   * `ThreadLocal`을 활용하여 쓰레드 안전한 상태 유지 및 로그 추적기 구현


3. [**템플릿 메서드 패턴과 콜백 패턴**](https://mxxikr.github.io/posts/spring-advanced-template-callback-pattern/)
   * 변하는 핵심 기능과 변하지 않는 부가 기능의 분리
   * 템플릿 메서드 패턴, 전략 패턴, 템플릿 콜백 패턴의 구조적 차이와 적용


4. [**프록시 패턴과 데코레이터 패턴**]()
   * 원본 코드를 수정하지 않고 부가 기능을 추가하는 프록시의 역할 이해
   * 인터페이스 기반 프록시와 구체 클래스 기반 프록시의 적용 및 데코레이터 패턴 실습


5. [**동적 프록시 기술**]()
  * 자바 리플렉션(Reflection)의 이해
  * JDK 동적 프록시(인터페이스 기반)와 CGLIB(구체 클래스 기반)를 활용한 런타임 프록시 객체 생성 로직 구현


6. [**스프링이 지원하는 프록시**]()
   * 스프링 `ProxyFactory`를 이용한 프록시 생성 기술 추상화
   * `Pointcut`(적용 위치), `Advice`(부가 기능 로직), `Advisor`(포인트컷+어드바이스)의 개념 이해 및 적용


7. [**빈 후처리기**]()
   * `BeanPostProcessor`를 활용한 프록시 자동 등록 및 컴포넌트 스캔 대상 프록시 적용
   * 스프링이 제공하는 `AnnotationAwareAspectJAutoProxyCreator`의 동작 원리 분석


8. [**@Aspect AOP**]()
   * `@Aspect` 애노테이션을 활용한 직관적이고 편리한 프록시 생성 및 적용


9. [**스프링 AOP 개념**]()
   * AOP(관점 지향 프로그래밍)의 핵심 개념(위버, 타겟, 조인 포인트 등) 확립
   * 컴파일 타임, 로드 타임, 런타임 위빙 등 다양한 AOP 적용 방식 비교


10. [**스프링 AOP 구현**]()
   * 포인트컷 시그니처 분리 및 다양한 어드바이스(`@Around`, `@Before`, `@After` 등) 활용
   * 다중 어드바이스 적용 시 `@Order`를 통한 실행 순서 제어


11. [**스프링 AOP - 포인트컷**]()
   * `execution`, `within`, `args`, `@annotation` 등 포인트컷 지시자(PCD)의 문법 및 활용법
   * 매개변수 전달 및 `this`, `target` 지시자의 차이점 분석


12. [**스프링 AOP - 실전 예제**]()
   * 애플리케이션 전반에 걸친 로그 출력 AOP 및 예외 발생 시 재시도(Retry) AOP 구현


13. [**스프링 AOP - 주의사항**]()
  * 프록시 내부 호출(Self-invocation)로 인해 AOP가 적용되지 않는 문제 분석 및 대안(자기 자신 주입, 지연 조회, 구조 변경) 마련
  * JDK 동적 프록시와 CGLIB 사용 시 발생하는 타입 캐스팅 문제와 의존관계 주입 한계 파악
