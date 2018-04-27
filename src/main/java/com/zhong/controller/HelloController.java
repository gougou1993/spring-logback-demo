package com.zhong.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  

@Controller// 声明是一个控制器  
public class HelloController {  
	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    // 通过@RequestMapping配置URL和方法之间的映射  
    @RequestMapping("index")  
    public String hello() {
    	logger.debug("this is test ");
        // 通过InternalResourceViewResolver的Bean配置，说明我们的放置路径是/WEB-INF/classes/views/index.jsp  
        return "index";  
    }  
}  