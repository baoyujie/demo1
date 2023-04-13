package com.example.demo1.generator.util;

import java.io.Serializable;

public class JsonResult<E> implements Serializable {
    /** 状态码*/
    private Integer state;
    /** 描述信息*/
    private String msg;
    /** 数据 泛型*/
    private E data;

    public JsonResult() {
    }

    public JsonResult(Integer state) {
        this.state = state;
    }

    public JsonResult(Throwable e) {
        this.msg = e.getMessage();
    }

    public JsonResult(Integer state, E data) {
        this.state = state;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public String getMsg() {
        return msg;
    }

    public E getData() {
        return data;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(E data) {
        this.data = data;
    }
}
