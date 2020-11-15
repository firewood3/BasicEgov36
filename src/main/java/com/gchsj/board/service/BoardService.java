package com.gchsj.board.service;

import com.gchsj.board.domain.Board;
import com.gchsj.board.mapper.BoardMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    public static final Logger LOGGER = LogManager.getFormatterLogger(BoardService.class);

    @Autowired
    private BoardMapper boardMapper;

    public void check() {
        LOGGER.info("board service~");
    }

    public void selectList() {
        List<Board> boardList = boardMapper.selectList();
        boardList.forEach(board -> LOGGER.info(board.toString()));
    }
}
