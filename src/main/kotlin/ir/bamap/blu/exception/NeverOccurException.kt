package ir.bamap.blu.exception

open class NeverOccurException(
    placeId: String,
    message: String = "{blu.neverOccur}",
    args: Map<String, Any?> = emptyMap(),
) : LogicalException(placeId, message, args)