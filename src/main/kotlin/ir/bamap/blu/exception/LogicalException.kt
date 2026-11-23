package ir.bamap.blu.exception

open class LogicalException(
    val placeId: String,
    title: String = "{blu.logical.title}",
    message: String = "{blu.logical.message}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(500, title, message, mapOf("placeId" to placeId, *args.entries.map { it.toPair() }.toTypedArray()))
