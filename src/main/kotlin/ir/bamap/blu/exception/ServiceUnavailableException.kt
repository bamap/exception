package ir.bamap.blu.exception

class ServiceUnavailableException(open val serviceName: String) :
    BluException(503, "{blu.service.unavailable}", mapOf("serviceName" to serviceName))