package com.ytmj.jzgl.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @author rui
 * @create 2020-03-14 15:27
 */
@WebFilter(filterName="druidWebStatFilter",
        urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*"), // 忽略资源
        })
public class DruidStatFilter extends WebStatFilter {

}