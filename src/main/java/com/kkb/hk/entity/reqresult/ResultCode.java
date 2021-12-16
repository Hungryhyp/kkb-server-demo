package com.kkb.hk.entity.reqresult;

public class ResultCode {

    /**
     * 操作成功
     */
    @Result(text = "操作成功")
    public static final int RC_1000 = 1000;

    /**
     * 操作失败（如没有明确的错误原因，则返回此错误码，需要手动写错误说明）
     */
    @Result(text = "操作失败")
    public static final int RC_9999 = 9999;

    /**
     * 请求返回数据为空
     */
    @Result(text = "请求返回数据为空")
    public static final int RC_9998 = 9998;

    /* ————————————————————————————全局模块(10)—————————————————————————————————————— */

    /**
     * 必填参数存在空值
     */
    @Result(text = "必填参数存在空值")
    public static final int RC_1001 = 1001;

    /**
     * 参数长度、格式不合法
     */
    @Result(text = "参数格式不合法")
    public static final int RC_1002 = 1002;

    /**
     * 安全校验不合法(AES)
     */
    @Result(text = "安全校验不合法(AES) ")
    public static final int RC_1003 = 1003;

    /**
     * 数据校验不合法(MD5)
     */
    @Result(text = "数据校验不合法(MD5)")
    public static final int RC_1004 = 1004;

    /**
     * 时间戳过期
     */
    @Result(text = "时间戳过期")
    public static final int RC_1005 = 1005;

    /**
     * appId不存在
     */
    @Result(text = "appId不存在")
    public static final int RC_1006 = 1006;

    /**
     * 重复的数据
     */
    @Result(text = "重复的数据")
    public static final int RC_1007 = 1007;

    /**
     * 版本号不一致
     */
    @Result(text = "版本号不一致")
    public static final int RC_1008 = 1008;

    /**
     * 禁止删除
     */
    @Result(text = "禁止删除")
    public static final int RC_1009 = 1009;
    /* ————————————————————————————用户模块(20)—————————————————————————————————————— */
    /**
     * 帐号被锁定
     */
    @Result(text = "帐号被锁定")
    public static final int RC_2001 = 2001;

    /**
     * 用户暂停服务
     */
    @Result(text = "用户暂停服务")
    public static final int RC_2002 = 2002;

    /**
     * 用户不存在
     */
    @Result(text = "用户不存在")
    public static final int RC_2003 = 2003;

    /**
     * 登录已经过期
     */
    @Result(text = "登录已经过期 ")
    public static final int RC_2004 = 2004;

    /**
     * 账号已存在
     */
    @Result(text = "账号已存在 ")
    public static final int RC_2005 = 2005;

    /**
     * 密码错误
     */
    @Result(text = "密码错误 ")
    public static final int RC_2006 = 2006;

    /**
     * 用户未绑定账号
     */
    @Result(text = "用户未绑定账号 ")
    public static final int RC_2007 = 2007;

    /**
     * 手机号码已存在
     */
    @Result(text = "手机号码已存在 ")
    public static final int RC_2008 = 2008;

    /**
     * 账号不存在
     */
    @Result(text = "账号不存在 ")
    public static final int RC_2009 = 2009;

    /**
     * 身份证号和手机号码不匹配，请检查填写是否正确
     */
    @Result(text = "身份证号和手机号码不匹配，请检查填写是否正确 ")
    public static final int RC_2010 = 2010;

    /**
     * 身份证号码已存在
     */
    @Result(text = "身份证号码已存在 ")
    public static final int RC_2011 = 2011;

    /**
     * 手机号码和用户不匹配
     */
    @Result(text = "手机号码和用户不匹配")
    public static final int RC_2012 = 2012;

    /**
     * 身份证号码和用户不匹配
     */
    @Result(text = "身份证号码和用户不匹配")
    public static final int RC_2013 = 2013;

    /**
     * 该账号已绑定其他微信
     */
    @Result(text = "该账号已绑定其他微信")
    public static final int RC_2014 = 2014;

    /**
     * 该用户已是村民
     */
    @Result(text = "该用户已是村民")
    public static final int RC_2015 = 2015;

    /**
     * 验证码错误
     */
    @Result(text = "验证码错误")
    public static final int RC_2016 = 2016;
    /**
     * 初始密码
     */
    @Result(text = "初始密码")
    public static final int RC_2017 = 2017;

    /**
     * 村民验证
     */
    @Result(text = "您的村民验证未通过")
    public static final int RC_2018 = 2018;
    /**
     * 村民验证
     */
    @Result(text = "您的身份验证信息有误，请重新提交")
    public static final int RC_2019 = 2019;
    /**
     * 村民验证
     */
    @Result(text = "您的验证信息已匹配其他账号")
    public static final int RC_2020 = 2020;

    @Result(text = "该管理账号对应的商户 name 正在审核中，请耐心等待")
    public static final int RC_2021 = 2021;

    @Result(text = "该管理账号对应的商户 name 已被管理平台拒绝入驻")
    public static final int RC_2022 = 2022;

    /* ————————————————————————————文件模块(30)—————————————————————————————————————— */
    /**
     * 非法的文件类型
     */
    @Result(text = "不合法的文件类型")
    public static final int RC_3001 = 3001;

    /**
     * 文件大小不正确
     */
    @Result(text = "不合法的文件大小")
    public static final int RC_3002 = 3002;

    /**
     * ip地址受限
     */
    @Result(text = "ip地址受限")
    public static final int RC_3003 = 3003;

    /**
     * 文件数量不正确
     */
    @Result(text = "文件数量不正确")
    public static final int RC_3004 = 3004;

    /**
     * 文件不存在
     */
    @Result(text = "文件不存在")
    public static final int RC_3005 = 3005;


    @Result(text = "无效的文件")
    public static final int RC_3006 = 3006;


    /**
     * 根据返回码取返回文本
     *
     * @param resultCode
     * @return
     */
    public static String getResultText(int resultCode) {
        Result rst = null;
        try {
            rst = ResultCode.class.getField("RC_" + resultCode).getAnnotation(Result.class);
        } catch (Exception e) {
            return null;
        }
        return rst == null ? null : rst.text();
    }

}
