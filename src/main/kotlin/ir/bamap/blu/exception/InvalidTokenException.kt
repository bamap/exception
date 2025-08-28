package ir.bamap.blu.exception

open class InvalidTokenException(
    message: String = "{blu.invalidToken}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(401, message, args)
