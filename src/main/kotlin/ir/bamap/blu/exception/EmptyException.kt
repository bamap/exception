package ir.bamap.blu.exception

open class EmptyException(
    val property: String,
    message: String = "{blu.empty}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(406, message, mapOf("property" to property, *args.entries.map { it.toPair() }.toTypedArray()))
