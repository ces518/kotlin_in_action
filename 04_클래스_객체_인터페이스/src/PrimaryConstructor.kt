/**
 * 클래스 명 뒤에오는 () 괄호로 둘러쌓인 코드를 주 생성자 라고 한다.
 *
 */
class SimpleUser(val nickname: String)

/**
 * 주 생성자를 풀어서 쓰면 다음과 같다.
 */
class User(_nickname: String) { // 파라메터가 1개만 있는 주 생성자
    val nickname: String

    init { // 초기화 블록
        nickname = _nickname
    }
}

/**
 * 초기화 블록이 없는 선언
 */
class NotInitUser(_nickname: String) {
    val nickname = _nickname
}


/**
 * 위 세가지 방법 모두 클래스를 선언하는 방법이지만, 첫번째 방법이 가장 간결하다.
*/

/**
 * 상위 클래스가 존재한다면, 하위 클래스 생성시 해당 상위 클래스 초기화가 필요하다.
 * 상위 클래스를 초기화 하려면 상위 클래스명 뒤에 괄호를 써 생성자 인자를 넘겨야한다.
 */
open class BaseUser(val nickname: String)

class TwitterUser(nickname: String): BaseUser(nickname)