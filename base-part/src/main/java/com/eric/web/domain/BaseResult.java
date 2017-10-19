package com.eric.web.domain;

import java.io.Serializable;

/**
 * Created by eric on 2017/10/19.
 */
public class BaseResult<T> implements Serializable {
    private T data;
    private boolean isSuccess;
    private String message;

    public BaseResult() {
    }

    private BaseResult(T data, boolean isSuccess) {
        this.data = data;
        this.isSuccess = isSuccess;
    }

    private BaseResult(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static BaseResult newSuccess(Object data) {
        return new BaseResult(data, true);
    }

    public static BaseResult newError(String errMsg) {
        return new BaseResult(errMsg, false);
    }
}
