package com.gchsj.board.mapper;

import com.gchsj.board.domain.Board;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> selectList();
    void update(Board board);
    void insert(Board bOard);
}
