package com.gchsj.board.controller;

import com.gchsj.board.service.BoardService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BoardController {

    private static final Logger LOGGER = LogManager.getFormatterLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/board", method = RequestMethod.GET)
    public String board() {
        LOGGER.info("board controller~");
        boardService.check();
        boardService.selectList();
        return "board";
    }

    @RequestMapping(value = "/board/json", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> boardJson() {
        Map<String, Object> map = new HashMap<>();

        map.put("code", HttpStatus.OK);
        map.put("message", "Json 데이터를 수신하였습니다.");
        map.put("data", boardService.selectList());

        return map;
    }
}
