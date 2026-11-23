package ir.bamap.blu.exception

open class DataDuplicateException(
    title: String = "{blu.duplicate.title}",
    message: String = "{blu.duplicate.message}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(409, title, message, args)
