/**
 * 함수의 파라미터 명을 지정할 수 있으며, 클라이언트에서 원하는 파라미터 명으로 변경해서 사용이 가능하다.
 */
fun performRequest(
        url: String,
        callback: (code: Int, content: String) -> Unit
) {
    /* .. */
}

fun main() {
    val url = "http://www.naver.com"
    performRequest(url) { code, content -> /*..*/ } // api 에서 정의한 파라미터 명을 사용
    performRequest(url) { code, page -> /*..*/ } // 원하는 이름으로 변경해서 사용 가능
}