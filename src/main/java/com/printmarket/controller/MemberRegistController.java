package com.printmarket.controller;

import com.printmarket.model.UserInfoDO;
import com.printmarket.service.MemberCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wuqiongke on 15/11/7.
 */
@Controller
public class MemberRegistController {

    @Autowired
    private MemberCenterService memberCenterService;
    @RequestMapping("/regist")
    public ModelAndView registerHome(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("member/register");
        return mv;

    }

    @RequestMapping("/registSubmit")
    public ModelAndView registerSubmit(UserInfoDO userInfoDO, HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("member/register");
        memberCenterService.registerMember(userInfoDO);
        return mv;

    }

}
