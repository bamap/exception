package ir.bamap.blu.exception

class ServiceUnavailableException(name: String)
    : BluException(503, "{blu.service.unavailable}", mapOf("name" to name)) {
}