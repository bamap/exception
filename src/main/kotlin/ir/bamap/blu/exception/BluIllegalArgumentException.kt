package ir.bamap.blu.exception

class BluIllegalArgumentException(
    message: String = "{blu.illegalArgument}",
    args: Map<String, Any?> = emptyMap(),
): BluException(400, message, args) {
}