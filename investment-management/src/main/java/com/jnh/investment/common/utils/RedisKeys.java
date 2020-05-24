

package com.jnh.investment.common.utils;

/**
 * Redis所有Keys
 *
 * @author wangsixian
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
