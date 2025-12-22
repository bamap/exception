package ir.bamap.blu.exception

open class ExternalServiceException(statusCode: Int, open val response: Map<String, Any?>) :
    BluException(statusCode, "{blu.externalServiceError}", mapOf("response" to response)) {
}
