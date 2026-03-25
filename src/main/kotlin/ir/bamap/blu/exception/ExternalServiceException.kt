package ir.bamap.blu.exception

open class ExternalServiceException(open val name: String, statusCode: Int, open val response: Map<String, Any?>) :
    BluException(statusCode, "{blu.externalServiceError}", mapOf("name" to name, "response" to response)) {
}
