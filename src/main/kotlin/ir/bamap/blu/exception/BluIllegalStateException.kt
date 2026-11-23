package ir.bamap.blu.exception

class BluIllegalStateException(
    title: String = "{blu.illegalState.title}",
    message: String = "{blu.illegalState.message}",
    args: Map<String, Any?> = emptyMap(),
): BluException(400, title, message, args) {
}