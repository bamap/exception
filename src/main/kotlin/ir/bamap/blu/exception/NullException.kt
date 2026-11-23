package ir.bamap.blu.exception

open class NullException(
    property: String,
    title: String = "{blu.null.title}",
    message: String = "{blu.null.message}",
    args: Map<String, Any?> = emptyMap()
) : EmptyException(property, title, message, args)