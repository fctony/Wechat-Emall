package org.web.emall;

import java.util.List;

public class ResponseModel implements java.io.Serializable{

    public ResponseModel(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public ResponseModel(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResponseModel NotFound() {
        return new ResponseModel(404,"资源不存在");
    }


    private Integer code;

    private Object data;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
