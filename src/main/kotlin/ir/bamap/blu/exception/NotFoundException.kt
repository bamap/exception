package ir.bamap.blu.exception

import java.io.Serializable

open class NotFoundException(
    val classType: Serializable,
    val identifier: Serializable,
    title: String = "{blu.notFound.title}",
    message: String = "{blu.notFound.message}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(
    404, title, message,
    mapOf("classType" to classType, "identifier" to identifier, *args.entries.map { it.toPair() }.toTypedArray())
)
