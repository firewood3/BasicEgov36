package com.gchsj.index.controller;

import com.gchsj.index.service.IndexService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    public static Logger logger  = LogManager.getFormatterLogger(IndexController.class);

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        logger.info("root forward");
        return "forward:/index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        logger.info("index controller~");
        indexService.check();
        model.addAttribute("data", "This is model from index controller.");
        return "index";
    }
}
