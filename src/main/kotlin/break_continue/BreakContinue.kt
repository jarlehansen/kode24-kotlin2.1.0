package break_continue

fun Int.nullableMethod() = when {
    this % 2 == 0 -> null
    else -> this
}

fun processList(elements: List<Int>): Boolean {
    for (element in elements) {
        val variable = element.nullableMethod() ?: run {
            println("Element is null or invalid, continuing...")
            continue
        }
        if (variable == 0) return true // If variable is zero, return true
    }
    return false
}

fun main() {
    processList(listOf(1, 2, 3, 4, 5))
}