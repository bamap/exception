package ir.bamap.blu.exception

class BluIllegalArgumentException(
    title: String ="{blu.illegalArgument.title}",
    message: String = "{blu.illegalArgument.message}",
    args: Map<String, Any?> = emptyMap(),
): BluException(400, title, message, args) {
}