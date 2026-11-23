package ir.bamap.blu.exception

open class ExternalServiceException(
    open val serviceName: String,
    statusCode: Int,
    open val response: Map<String, Any?>
) : BluException(
    statusCode,
    "{blu.externalServiceError.title}", "{blu.externalServiceError.message}",
    mapOf("serviceName" to serviceName, "response" to response)
)
