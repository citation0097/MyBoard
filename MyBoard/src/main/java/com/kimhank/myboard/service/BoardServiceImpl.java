package com.kimhank.myboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimhank.myboard.dao.IBoardDAO;

@Service("boardServiceImpl")
public class BoardServiceImpl implements IBoardService {

	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private IBoardDAO boardDAOService;
	

	@Override
	public List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		List<BoardVO> list = boardDAOService.selectBoardList(boardVO);
		return list;
	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDAOService.insertBoard(boardVO);

	}

	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDAOService.updateBoard(boardVO);
	}

	@Override
	public void deleteBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDAOService.deleteBoard(boardVO);
	}

	@Override
	public BoardVO selectBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		BoardVO  board = boardDAOService.selectBoard(boardVO);
		return board;
	}

}
