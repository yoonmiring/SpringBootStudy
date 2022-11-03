package com.example.helloworld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.helloworld.model.TestVo;

@Controller
public class HelloController {
    @RequestMapping(value = "/home")
    public String home() {
        return "index.html";
    }

    @ResponseBody
    @RequestMapping("/valueTest")
    public String valueTest() {
        String value = "테스트 String";
        return value;
    }

    @RequestMapping("/thymeleafTest")
    public String thymeleafTest(Model model) {
        TestVo testModel = new TestVo("123", "가나다");
        model.addAttribute("testModel", testModel);
        return "thymeleaf/thymeleafTest";
    }
}
