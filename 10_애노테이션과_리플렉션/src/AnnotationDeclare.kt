/**
 * 아래 선언된 애노테이션은 제이키드의 애노테이션중 하나이다.
 * 아무런 파라미터도 없는 가장 단순한 애노테이션의 형태
 * 애노테이션 선언 구문은 class 키워드앞에 annotation 변경자만 붙여주면 된다.
 */
annotation class JsonExclude

/**
 * 애노테이션은 선언이나 식과 관련된 메타데이터 구조만을 정의한다.
 * 따라서 본문을 정의할 수 없으며, 파라미터가 존재하는 애노테이션을 정의하려면
 * 주 생성자에 파라미터를 정의해야 한다.
 */
annotation class JsonName(val name: String)