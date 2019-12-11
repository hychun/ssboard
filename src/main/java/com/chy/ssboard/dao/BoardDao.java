package com.chy.ssboard.dao;

import java.util.List;

import com.chy.ssboard.vo.BoardArticleVO;
import com.chy.ssboard.vo.BoardListVO;

public interface BoardDao {
	public BoardArticleVO read(int no) throws Exception;
	public List<BoardListVO> getList(int no, int count) throws Exception;
	public void modify(BoardArticleVO article) throws Exception;
	public void insert(BoardArticleVO article) throws Exception;
	public void delete(int no) throws Exception;	
}
