package ir.bamap.blu.exception

open class ServiceUnavailableException(open val serviceName: String) :
    BluException(
        503,
        "{blu.service.unavailable.title}", "{blu.service.unavailable.message}",
        mapOf("serviceName" to serviceName)
    )