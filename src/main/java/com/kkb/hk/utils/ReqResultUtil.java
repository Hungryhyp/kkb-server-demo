package com.kkb.hk.utils;

import com.alibaba.fastjson.JSON;
import com.kkb.hk.entity.reqresult.ReqResult;
import com.kkb.hk.entity.reqresult.ResultCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @className ReqResultUtil
 * @description:  接口返回json的公共处理类
 * @author Allen
 * @date 2021/12/16 15:46
 */
public class ReqResultUtil {

    public static <T> ResponseEntity<String> genSuccessResultResponse() {
        ReqResult<T> rst = new ReqResult<T>();
        rst.setCode(ResultCode.RC_1000);
        return genSuccessResultResponse("成功");
    }

    public static <T> ResponseEntity<String> genSuccessResultResponse(T resultObject) {
        ReqResult<T> rst = new ReqResult<T>();
        rst.setCode(ResultCode.RC_1000);
        rst.setData(resultObject);
        return genResultResponse(rst);
    }

    public static <T> ResponseEntity<String> genFailResultResponse() {
        ReqResult<T> rst = new ReqResult<T>();
        rst.setCode(ResultCode.RC_9999);
        rst.setMsg("系统异常");
        return genFailResultResponse(rst);
    }

    public static <T> ResponseEntity<String> genFailResultResponse(T resultObject) {
        ReqResult<T> rst = new ReqResult<T>();
        rst.setCode(ResultCode.RC_9999);
        rst.setData(resultObject);
        return genFailResultResponse(rst);
    }

    public static <T> ResponseEntity<String> genFailResultResponse(ReqResult<T> rst) {
        return new ResponseEntity<String>(JSON.toJSONString(rst), HttpStatus.OK);
    }

    public static <T> ResponseEntity<String> genResultResponse(ReqResult<T> rst) {
        return new ResponseEntity<String>(JSON.toJSONString(rst), HttpStatus.OK);
    }

}
