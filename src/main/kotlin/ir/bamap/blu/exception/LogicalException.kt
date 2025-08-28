package ir.bamap.blu.exception

open class LogicalException(
    val placeId: String,
    message: String = "{blu.logical}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(500, message, mapOf("placeId" to placeId, *args.entries.map { it.toPair() }.toTypedArray()))
