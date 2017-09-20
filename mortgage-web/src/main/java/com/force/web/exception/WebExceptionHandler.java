package com.force.web.exception;

import com.google.common.base.Throwables;
import com.force.commons.exception.ErrorResponse;
import com.force.commons.utils.IpUtil;
import com.force.commons.exception.JyException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * Created by ouyangjingzhou@jianyi.tech on 2017/6/20 0020.
 */
@ControllerAdvice
public class WebExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(WebExceptionHandler.class);


    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleRuntimeException(RuntimeException e, HttpServletRequest request) {
        try {
            String ip = IpUtil.getIp(request);
            logger.error(e.getMessage() + Throwables.getStackTraceAsString(e));
            String url = request.getRequestURL() != null ? request.getRequestURL().toString() : "";
            if (StringUtils.isNotBlank(request.getQueryString())) {
                url += "?" + request.getQueryString();
            }
            logger.error(e.getClass().getSimpleName() + e.getMessage() + Throwables.getStackTraceAsString(e) + url + ip);
        } catch (Throwable throwable) {
            logger.error(e.getMessage() + Throwables.getStackTraceAsString(throwable));
        }
        return e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(JyException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleJyException(JyException e) throws UnsupportedEncodingException {
        ErrorResponse errorResponse = new ErrorResponse();
        try {
            errorResponse.setCode(e.getErrorType().getCode());
            errorResponse.setMessage(e.getErrorMessage());
            errorResponse.setData(e.getErrorObject());
            logger.info("处理JyException:" + e.getErrorMessage());
        } catch (Throwable throwable) {
            logger.error(e.getMessage() + Throwables.getStackTraceAsString(throwable));
        }
        return errorResponse;
    }

    @ResponseBody
    @ExceptionHandler(AuthenticationServiceException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public boolean handlerAuthenticationException() {
        return false;
    }


}
