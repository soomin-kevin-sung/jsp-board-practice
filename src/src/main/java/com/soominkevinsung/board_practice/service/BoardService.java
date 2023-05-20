package com.soominkevinsung.board_practice.service;

import com.soominkevinsung.board_practice.domain.Board;
import com.soominkevinsung.board_practice.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;

    public int boardCount() {
        return boardMapper.boardCount();
    }

    public List<Board> boardList() {
        return boardMapper.getList();
    }

    public Board getBoard(Long boardId) { return boardMapper.getBoard(boardId); }

    public void uploadBoard(Board board) { boardMapper.uploadBoard(board); }
}
