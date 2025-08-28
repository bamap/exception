package ir.bamap.blu.exception

import java.io.Serializable

open class NotFoundException(
    val classType: Serializable,
    val identifier: Serializable,
    message: String = "{blu.notFound}",
    args: Map<String, Any?> = emptyMap(),
) : BluException(
    404, message,
    mapOf("classType" to classType, "identifier" to identifier, *args.entries.map { it.toPair() }.toTypedArray())
)
