package ir.bamap.blu.exception

open class NotSupportedException(
    val typeEntry: String,
    placeId: String,
    message: String = "{blu.notSupported}",
    args: Map<String, Any?> = emptyMap(),
) : NotImplementedException(
    placeId, message,
    mapOf("typeEntry" to typeEntry, "placeId" to placeId, *args.entries.map { it.toPair() }.toTypedArray())
) {

    constructor(type: Class<*>, placeId: String) : this(type.simpleName, placeId)
}