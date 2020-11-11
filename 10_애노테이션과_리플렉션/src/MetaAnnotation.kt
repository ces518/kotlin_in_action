/**
 * 표준 라이브러리에 있는 메타애노테이션인 @Target 은, 애노테이션을 적용할 수 있는 대상을 지정한다.
 * 애노테이션 클래스에 @Target 을 지정하지 않으면, 기본적으로 모든 선언에 적용이 가능하다.
 * AnnotationTarget Enum 에 적용된 Enum 들을 이용하여 클래스, 파일, 프로퍼티 등 정의를 할 수 있다.
 */
@Target(AnnotationTarget.FUNCTION)
annotation class Hello