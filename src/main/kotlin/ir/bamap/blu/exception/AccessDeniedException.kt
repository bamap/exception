package ir.bamap.blu.exception

import java.io.Serializable

open class AccessDeniedException(
    val classType: Serializable,
    val identifier: Serializable,
    message: String = "{blu.accessDenied}",
    args: Map<String, Any?> = emptyMap()
) : BluException(
    403, message,
    mapOf("classType" to classType, "identifier" to identifier, *args.entries.map { it.toPair() }.toTypedArray()),
) {
}