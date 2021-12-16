package com.kkb.hk.entity.reqresult;

import com.alibaba.fastjson.JSON;
import com.kkb.hk.utils.StringUtils;

import java.io.Serializable;

public class ReqResult<T> implements Serializable {

    private static final long serialVersionUID = -6806673941015384663L;
    private int code = ResultCode.RC_9999;
    private T data = null;
    private String msg = null;

    public ReqResult() {
    }

    public ReqResult(int code) {
        this.code = code;
        this.msg = ResultCode.getResultText(code);
    }

    public ReqResult(int code, String message) {
        this.code = code;
        if (StringUtils.isEmpty(message)) {
            message = "未知消息";
        }
        if (code != ResultCode.RC_1000) {
            this.msg = message;
        }
    }

    public ReqResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static void main(String[] args) {
        System.out.println("1");
        String result = "{\"resultCode\":1000,\"returnObject\":\"wx.yinnima.com/liujia-saas-api/internal/s/77B36z\"}";
        ReqResult reqResult = JSON.parseObject(result, ReqResult.class);
        if (reqResult.getCode() == 1000) {
            String shortHtmlUrl = reqResult.getData().toString();
            System.out.println(shortHtmlUrl);
        }
    }

}
