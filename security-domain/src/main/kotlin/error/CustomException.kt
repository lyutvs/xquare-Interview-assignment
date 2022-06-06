package error

import error.propertys.ExceptionProperty

open class CustomException(private val property: ExceptionProperty): RuntimeException() {
    val status: Int
        get() = property.status

    val errorMessage
        get() = property.errorMessage
}