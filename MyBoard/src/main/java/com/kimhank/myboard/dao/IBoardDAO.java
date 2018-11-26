package com.kimhank.myboard.dao;

import java.util.List;

import com.kimhank.myboard.service.BoardVO;

public interface IBoardDAO {
	
	List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception;
	
	void insertBoard(BoardVO boardVO) throws Exception;
	
	void updateBoard(BoardVO boardVO) throws Exception;
	
	void deleteBoard(BoardVO boardVO) throws Exception;
	
	BoardVO selectBoard(BoardVO boardVO) throws Exception;
}
