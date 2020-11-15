package com.gchsj.board.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    public static final Logger LOGGER = LogManager.getFormatterLogger(BoardService.class);

    public void check() {
        LOGGER.info("board service~");
    }
}
