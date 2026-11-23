package ir.bamap.blu.exception

open class NotSupportedTypeException(
    val type: String,
    placeId: String,
    title: String = "{blu.notSupported.title}",
    message: String = "{blu.notSupported.message}",
    args: Map<String, Any?> = emptyMap(),
) : NotImplementedException(
    placeId, title, message,
    mapOf("typeEntry" to type, "placeId" to placeId, *args.entries.map { it.toPair() }.toTypedArray())
) {

    constructor(type: Class<*>, placeId: String) : this(type.simpleName, placeId)
}