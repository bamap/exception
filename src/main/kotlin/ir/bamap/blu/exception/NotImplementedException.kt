package ir.bamap.blu.exception

open class NotImplementedException(
    val placeId: String,
    title: String = "{blu.notImplemented.title}",
    message: String = "{blu.notImplemented.message}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(500, title, message, mapOf("placeId" to placeId, *args.entries.map { it.toPair() }.toTypedArray()))
