package error.exception

import error.CustomException
import error.propertys.CustomExceptionHandlerErrorCode

object NoHandlerFoundException : CustomException(CustomExceptionHandlerErrorCode.REQUEST_NOT_FOUND){
    val EXCEPTION = NoHandlerFoundException
}