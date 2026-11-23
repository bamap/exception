package ir.bamap.blu.exception

open class NeverOccurException(
    placeId: String,
    title: String = "{blu.neverOccur.title}",
    message: String = "{blu.neverOccur.message}",
    args: Map<String, Any?> = emptyMap(),
) : LogicalException(placeId, title, message, args)