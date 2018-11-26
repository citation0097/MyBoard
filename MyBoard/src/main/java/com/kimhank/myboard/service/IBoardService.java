package com.kimhank.myboard.service;

import java.util.List;

public interface IBoardService {
	public List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception;
	
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	public void updateBoard(BoardVO boardVO) throws Exception;
	
	public void deleteBoard(BoardVO boardVO) throws Exception;
	
	public BoardVO selectBoard(BoardVO boardVO) throws Exception;
}
