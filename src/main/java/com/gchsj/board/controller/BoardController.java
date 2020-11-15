package com.gchsj.board.controller;

import com.gchsj.board.service.BoardService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

    public static final Logger LOGGER = LogManager.getFormatterLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/board", method = RequestMethod.GET)
    public String board() {
        LOGGER.info("board controller~");
        boardService.check();
        boardService.selectList();
        return "board";
    }
}
