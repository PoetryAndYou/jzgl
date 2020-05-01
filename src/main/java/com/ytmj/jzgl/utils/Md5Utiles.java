package com.ytmj.jzgl.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @author rui
 * @create 2020-04-25 0:18
 */
public class Md5Utiles {
    public static String testMD5(String password){
        String hashName="md5";
        SimpleHash simpleHash = new SimpleHash(hashName, password, null, 2);
        return simpleHash.toString();
    }
}
