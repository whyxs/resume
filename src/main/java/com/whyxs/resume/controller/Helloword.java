/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Helloword
 * Author:   whyxs
 * Date:     2018/12/6 15:44
 * Description: 项目的启动测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.whyxs.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈项目的启动测试〉
 *
 * @author whyxs
 * @create 2018/12/6
 * @since 1.0.0
 */
@Controller
public class Helloword {

    @RequestMapping(value = "/")
    public String helloword(){
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/rest")
    public String hellowordRest(){
        return "hellowor-rest1";
    }
}
