package ir.bamap.blu.exception

open class DataDuplicateException(
    message: String = "{blu.duplicate}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(409, message, args)
