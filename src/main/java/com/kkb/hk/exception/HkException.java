package com.kkb.hk.exception;

import lombok.Data;

/**
 * @Description 查询结果为空异常
 * @Date 2021/10/9 18:13
 * @Created 30500
 */
@Data
public class HkException extends GlobalException {

    public HkException() {
        super();
    }

    public HkException(Object message) {
        super("查询结果为 null, id = " + message);
    }
}
