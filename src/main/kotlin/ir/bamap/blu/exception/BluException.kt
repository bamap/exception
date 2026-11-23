package ir.bamap.blu.exception

open class BluException(
    val statusCode: Int = 500,
    val title: String = "{blu.error.title}",
    override val message: String = "{blu.error.message}",
    val args: Map<String, Any?> = emptyMap(),
) : RuntimeException()
