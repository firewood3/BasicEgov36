package com.gchsj.index.service;

import com.gchsj.index.controller.IndexController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

    public static Logger logger  = LogManager.getFormatterLogger(IndexService.class);

    public void check() {
        logger.info("index service~");
    }
}
