package error.exception

import error.CustomException
import error.propertys.CustomExceptionHandlerErrorCode

object RequestNotFoundException : CustomException(CustomExceptionHandlerErrorCode.REQUEST_NOT_FOUND) {

    val EXCEPTION = RequestNotFoundException

}