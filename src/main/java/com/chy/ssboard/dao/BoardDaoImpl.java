package com.chy.ssboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chy.ssboard.vo.BoardArticleVO;
import com.chy.ssboard.vo.BoardListVO;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSession session;

	@Override
	public BoardArticleVO read(int no) throws Exception {
		BoardArticleVO boardArticle = session.selectOne("selectBoardArticle", no);
		return boardArticle;
	}

	@Override
	public List<BoardListVO> getList(int no, int count) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(BoardArticleVO article) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(BoardArticleVO article) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int no) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
