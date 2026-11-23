package ir.bamap.blu.exception

import java.io.Serializable

open class AccessDeniedException(
    val classType: Serializable,
    val identifier: Serializable,
    title: String = "{blu.accessDenied.title}",
    message: String = "{blu.accessDenied.message}",
    args: Map<String, Any?> = emptyMap()
) : BluException(
    403, title, message,
    mapOf("classType" to classType, "identifier" to identifier, *args.entries.map { it.toPair() }.toTypedArray()),
) {
}