package ir.bamap.blu.exception

open class EmptyException(
    val property: String,
    title: String = "{blu.empty.title}",
    message: String = "{blu.empty.message}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(406, title, message, mapOf("property" to property, *args.entries.map { it.toPair() }.toTypedArray()))
