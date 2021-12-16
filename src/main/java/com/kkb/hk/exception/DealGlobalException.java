package com.kkb.hk.exception;

import com.kkb.hk.entity.reqresult.ReqResult;
import com.kkb.hk.entity.reqresult.ResultCode;
import com.kkb.hk.utils.ReqResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description 公益故事全局异常处理器
 * @Date 2021/10/9 18:16
 * @Created 30500
 */
@ControllerAdvice
public class DealGlobalException {
    /**
     * 日志的记录打印
     */
    private static final Logger logger = LoggerFactory.getLogger(DealGlobalException.class);

    /**
     * @return org.springframework.http.ResponseEntity<java.lang.String>
     * @description 查询结果为空
     * @author 30500
     * @date 2021/10/9 19:31
     * @type [java.lang.Exception]
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> queryException(Exception exception) {
        logger.info("发生异常" + exception.getMessage());
        ReqResult result = new ReqResult();
        result.setCode(ResultCode.RC_9999);
        result.setMsg("发生错误");
        return ReqResultUtil.genFailResultResponse(result);
    }
}
