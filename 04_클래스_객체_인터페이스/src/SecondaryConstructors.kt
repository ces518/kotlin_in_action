import java.util.jar.Attributes
import javax.naming.Context

open class View {
    constructor(ctx: Context) {
        //
    }

    constructor(ctx:Context, attr: Attributes) {
        //
    }
}

/**
 * super 키워드를 통해 상위 클래스의 생성자를 호출하는 부생성자들
 *
 */
class MyButton: View {
    constructor(ctx: Context): super(ctx) {
        // ...
    }

    constructor(ctx: Context, attr: Attributes): super(ctx, attr) {
        // ...
    }
}