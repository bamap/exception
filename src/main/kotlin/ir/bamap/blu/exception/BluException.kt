package ir.bamap.blu.exception

open class BluException(
    val statusCode: Int = 500,
    override val message: String = "{blu.error}",
    val args: Map<String, Any?> = emptyMap(),
) : RuntimeException()
