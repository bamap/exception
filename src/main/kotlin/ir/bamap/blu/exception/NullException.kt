package ir.bamap.blu.exception

open class NullException(
    property: String,
    message: String = "{blu.null}",
    args: Map<String, Any?> = emptyMap()
) : EmptyException(property, message, args)