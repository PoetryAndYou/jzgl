package com.ytmj.jzgl;


import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

import java.util.UUID;


//import org.junit.jupiter.api.Test;

/**
 * @author rui
 * @create 2020-04-07 14:01
 */
public class MD5Test {

    @Test
    public void testMD5(){
//        String hashName="md5";
//        String pwd="123";
//        SimpleHash simpleHash = new SimpleHash(hashName, pwd, null, 2);
//        System.out.println(simpleHash);
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }

}
