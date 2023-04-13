package com.example.demo1.generator.service.ex;


/**密码校验失败*/
public class PasswordNotMatchException extends ServiceException{
    public PasswordNotMatchException() {
        super();
    }

    public PasswordNotMatchException(String message) {
        super(message);
    }

    public PasswordNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotMatchException(Throwable cause) {
        super(cause);
    }

    protected PasswordNotMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
