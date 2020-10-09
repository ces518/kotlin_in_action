class MyService {
    fun performAction(): String = "foo"
}

/**
 * lateinit 변경자를 사용해 늦은 초기화를 할 수 있다.
 */
class MyTest {
    private lateinit var myService: MyService

//    @Before
    fun setUp() {
        myService = MyService()
    }

//    @Test
    fun testAction() {
        myService.performAction()
    }
}