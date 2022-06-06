package error.propertys

enum class CustomExceptionHandlerErrorCode(
    override val errorMessage: String,
    override val status: Int,
) : ExceptionProperty {
    UNEXPECTED("Unexpected Exception Occurred", 500),
    INVALID_METHOD_ARGUMENT("Invalid Method Argument", 400),
    REQUEST_NOT_FOUND("Cannot Find Valid Controller", 404)
}