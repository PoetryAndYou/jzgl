package com.ytmj.jzgl.utils;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author rui
 * @create 2020-04-20 0:12
 */
public class DateUtils {
    public static String simpleDate(){

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        return format;
    }
    public static String dateymd(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
//        Date date=()format;
        return "1";
    }
}
