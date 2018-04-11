package com.fuck.controller;

import com.fuck.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * DESCRIPTION:
 *
 * @author
 * @create 2018-04-11 上午10:47
 * created by fuck~
 **/
@Controller
public class TestController {

    private static Logger logger = LogManager.getLogger(TestController.class);

    @Resource
    private TestService testService;

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String login(@RequestParam MultiValueMap<String, String> parameters, HttpServletRequest request, Model model) {
        return "redirect:/dashboard";
    }

    @RequestMapping(value="/dashboard", method= RequestMethod.GET)
    public String dashboard(@RequestParam MultiValueMap<String, String> parameters, HttpServletRequest request, Model model) {
        List<Map<String, Object>> resu = testService.queryData();
        logger.info("resu==>{}", resu);
        return "/view/DashboardList.jsp";
    }
}
