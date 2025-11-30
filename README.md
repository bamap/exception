# Blu Exceptions Library

## Overview

This Kotlin/Java library provides a standardized set of custom exceptions for Spring Boot applications. These exceptions include structured data (e.g., `classType`, `identifier`, `property`, `placeId`) for better error handling, structured logging, and i18n. Default messages use keys like `{blu.notFound}` resolved via Spring's `MessageSource`.

Key features:
- Serializable where needed (e.g., `AccessDeniedException`, `NotFoundException`).
- Consistent constructors with optional `args: Map<String, Any?>` for templating.
- Extend `RuntimeException` (unchecked exceptions).
- Designed for `spring-common-log` (MDC-structured logging) and `spring-exception-handling` (@ControllerAdvice).

## Installation

Add to `pom.xml`:

```xml
<dependency>
    <groupId>ir.bamap.blu</groupId>
    <artifactId>exception</artifactId>
    <version>1.0.3</version>
</dependency>
```

Published to Maven Central via GitHub Actions (`.github/workflows/maven-publish.yml`).

## Available Exceptions

| Exception | Key Fields | Default Message Key | Kotlin Example |
|-----------|------------|---------------------|---------------|
| `AccessDeniedException` | `classType: Serializable`, `identifier: Serializable` | `{blu.accessDenied}` | `throw AccessDeniedException(User::class.java, userId)` |
| `BluException` | `statusCode: Int = 500` | `{blu.error}` | `throw BluException(400, args = mapOf("detail" to "Bad request"))` |
| `BluIllegalArgumentException` | - | `{blu.illegalArgument}` | `throw BluIllegalArgumentException(args = mapOf("field" to "email"))` |
| `BluIllegalStateException` | - | `{blu.illegalState}` | `throw BluIllegalStateException()` |
| `DataDuplicateException` | - | `{blu.duplicate}` | `throw DataDuplicateException(args = mapOf("entity" to "User"))` |
| `EmptyException` | `property: String` | `{blu.empty}` | `throw EmptyException("email")` |
| `InvalidTokenException` | - | `{blu.invalidToken}` | `throw InvalidTokenException()` |
| `LogicalException` | `placeId: String` | `{blu.logical}` | `throw LogicalException("userService.validate")` |
| `NeverOccurException` | `placeId: String` | `{blu.neverOccur}` | `throw NeverOccurException("paymentFlow.step1")` |
| `NotFoundException` | `classType: Serializable`, `identifier: Serializable` | `{blu.notFound}` | `throw NotFoundException(Order::class.java, orderId)` |
| `NotImplementedException` | `placeId: String` | `{blu.notImplemented}` | `throw NotImplementedException("featureX")` |
| `NotSupportedTypeException` | `type: String`, `placeId: String` | `{blu.notSupported}` | `throw NotSupportedTypeException("PDF", "documentParser")` |
| `NullException` | `property: String` | `{blu.null}` | `throw NullException("user.profile")` |
| `ServiceUnavailableException` | `name: String` | Custom | `throw ServiceUnavailableException("payment-gateway")` |

## Usage Example (Kotlin + Spring Boot)

```kotlin
@Service
class UserService(private val userRepo: UserRepository) {
    fun findUser(id: Long): User {
        val user = userRepo.findById(id)
            ?: throw NotFoundException(User::class.java, id)

        if (user.email.isBlank()) {
            throw EmptyException("email", args = mapOf("userId" to id))
        }
        if (!user.active) {
            throw AccessDeniedException(User::class.java, id)
        }
        return user
    }
}
```

## Integration

Compatible with `spring-common-log` and `spring-exception-handling`.

### i18n Messages
`messages.properties`:

```
blu.notFound={classType.simpleName} with identifier {identifier} not found.
blu.empty={property} cannot be empty.
blu.accessDenied=Access denied to {classType.simpleName} {identifier}.
```

## Contributing
- New exceptions: `open class NewEx(...) : BluException(...)`, add KDoc/table entry.
- Test serialization/JSON, update pom.xml version, PR → auto-publish.

## License
[MIT](LICENSE)
