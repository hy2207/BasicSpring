# BasicSpring
includes basic theory & project of spring/spring-boot

* Inversion Of Control (IOC; 제어의 역전)
: 객체 생성을 개발자가 관리하는 것이 아닌 Spring Container에 맡김 --> 프레임워크로 제어의 객체 관리의 권한이 넘어감
- 사용방법
    - @Component : bean으로 등록되어 spring에서 관리
    - @Configuration: 한 class 내에서 여러개의 bean을 관리


* Dependency Injectio
  - 장점
   - 의존성으로부터 격리시켜 코드 테스트에 용이
   - DI를 통하여, 불가능한 상황을 Mock와 같은 기술을 통하여, 안정적으로 테스트 가능
   - 코드를 확장하거나 변경할때 영향을 최소화
   - 순환참조 방지

* Aspect Oriented Programming (AOP; 관점지향 프로그램)
  - Web Layer: REST API를 제공하며, client 중심의 로직 적용
  - Business Layer: 내부 정책에 따른 logic을 개발하며, 주로 해당 부분을 개발
  - Data Layer: 데이터 베이스 및 외부와의 연동을 처리

* Rest Template을 이용한 server to server 통신 (이부분은 업로드 생략, 추후 추가 예정 probabley,,,)
  - server <-> client 
  - http body -> object -> object mapper > json -> rest template -> http body json


* JUnit
  - TDD(Test-driven Development): 테스트 주도 개발에서 사용, 코드의 유지 보수 및 운영 환경에서 에러를 미리 방지하기 위해서 단위 별로 검증하는 테스트프레임워크
  - 단위테스트: 작성한 코드가 기대하는대로 동작을 하는지 검증하는 절차
  - JUnit: 자바기반의 단위테스트를 위한 프레임워크로, Annotation 기반으로 테스트를 지원하며, Assert를 통하여 (예상, 실제)를 통해 검증
  
* Swagger
  - 개발한 REST API를 편리하게 문서화 해주고, 이를 통해 관리 및 제 3의 사용자가 편리하게 API를 호출해보고 테스트 할 수 있는 프로젝트
  - 다만 운영환경에서는 동작안하도록, (노출되면 안되는 곳에서 사용시 주의)

* Project "네이버 지역검색 API를 활용한 맛집 List만들기"
