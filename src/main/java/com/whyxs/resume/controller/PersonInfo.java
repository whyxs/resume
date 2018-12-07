/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: PersonInfo
 * Author:   whyxs
 * Date:     2018/12/6 16:16
 * Description: 个人简介
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.whyxs.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈个人简介〉
 *
 * @author whyxs
 * @create 2018/12/6
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "/person")
public class PersonInfo {

    @RequestMapping(value = "/info")
    public String personInfo(Model model){
        return "person-info";
    }
}
