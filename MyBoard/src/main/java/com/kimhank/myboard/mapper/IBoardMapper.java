package com.kimhank.myboard.mapper;

import java.util.List;

import com.kimhank.myboard.service.BoardVO;

public interface IBoardMapper {
	
	public List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception;
	
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	public void updateBoard(BoardVO boardVO) throws Exception;
	
	public void deleteBoard(BoardVO boardVO) throws Exception;
	
	public BoardVO selectBoard(BoardVO boardVO) throws Exception;

}
