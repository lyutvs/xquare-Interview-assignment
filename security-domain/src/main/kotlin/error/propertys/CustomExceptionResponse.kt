package error.propertys

import error.CustomException

class CustomExceptionResponse<T> (
    val status: Int,
    val message: String,
    val content: T?
) {

    companion object {
        fun of(exception: CustomException): CustomExceptionResponse<Unit> {
            return CustomExceptionResponse(
                status = exception.status,
                message = exception.errorMessage,
                content = null
            )
        }
    }

}