package com.kkb.hk.utils;

import java.security.MessageDigest;

/**
 * @className MD5Util
 * @description:  MD5加密类
 * @author Allen
 * @date 2021/12/16 15:45
 */
public class MD5Util {

    public static String encrypt(String dataStr) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(dataStr.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00)
                        .substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

}
