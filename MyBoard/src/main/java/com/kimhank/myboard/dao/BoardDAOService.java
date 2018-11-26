package com.kimhank.myboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimhank.myboard.mapper.IBoardMapper;
import com.kimhank.myboard.service.BoardVO;

@Service("boardDAOService")
public class BoardDAOService implements IBoardDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public BoardDAOService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		IBoardMapper mapper = sqlSession.getMapper(IBoardMapper.class);
		return mapper.selectBoardList(boardVO);
	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		IBoardMapper mapper = sqlSession.getMapper(IBoardMapper.class);
		mapper.insertBoard(boardVO);
	}

	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		IBoardMapper mapper = sqlSession.getMapper(IBoardMapper.class);
		mapper.updateBoard(boardVO);
	}

	@Override
	public void deleteBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		IBoardMapper mapper = sqlSession.getMapper(IBoardMapper.class);
		mapper.deleteBoard(boardVO);
	}

	@Override
	public BoardVO selectBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		IBoardMapper mapper = sqlSession.getMapper(IBoardMapper.class);
		return mapper.selectBoard(boardVO);
	}

}
