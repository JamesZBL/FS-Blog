package me.zbl.fullstack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 前台页面控制器
 */
@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class FrontController {

//    private TestService testService;

//    @Autowired
//    public void setTestService(TestService testService) {
//        this.testService = testService;
//    }

    /**
     * 前台首页
     */
    @RequestMapping(value = "/index")
    public String pFrontIndex() {
        /**************************************************/
//        testService.test();
        /**************************************************/
        return "index";
    }
}
