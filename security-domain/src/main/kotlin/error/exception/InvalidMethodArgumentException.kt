package error.exception

import error.CustomException
import error.propertys.CustomExceptionHandlerErrorCode

object InvalidMethodArgumentException : CustomException(CustomExceptionHandlerErrorCode.INVALID_METHOD_ARGUMENT){
    val EXCEPTION = InvalidMethodArgumentException
}