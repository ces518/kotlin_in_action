/**
 * 직접 구현해야하는 위임코드를 일급시민으로 언어 차원에서 제공하는 by 를 통해 매우 간단하게 구현이 가능하다.
 */
class DelegationgCollection<T>(
    innerList: Collection<T> = ArrayList<T>()
): Collection<T> by innerList {}