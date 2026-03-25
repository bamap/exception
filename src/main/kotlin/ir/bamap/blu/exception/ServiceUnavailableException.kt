package ir.bamap.blu.exception

class ServiceUnavailableException(open val name: String)
    : BluException(503, "{blu.service.unavailable}", mapOf("name" to name)) {
}