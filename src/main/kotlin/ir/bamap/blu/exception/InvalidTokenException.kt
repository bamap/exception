package ir.bamap.blu.exception

open class InvalidTokenException(
    title: String = "{blu.invalidToken.title}",
    message: String = "{blu.invalidToken}.message",
    args: Map<String, Any?> = emptyMap(),
) : BluException(401, title, message, args)
