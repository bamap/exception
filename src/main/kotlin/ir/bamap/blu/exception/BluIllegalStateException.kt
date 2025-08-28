package ir.bamap.blu.exception

class BluIllegalStateException(
    message: String = "{blu.illegalState}",
    args: Map<String, Any?> = emptyMap(),
): BluException(400, message, args) {
}