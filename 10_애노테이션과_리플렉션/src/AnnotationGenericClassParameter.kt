import kotlin.reflect.KClass


interface Animal<T>

annotation class AnnotationGenericClassParameter(
        val targetClass: KClass<out Animal<*>>
)