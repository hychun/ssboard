package com.chy.ssboard.service;

import java.util.List;

import com.chy.ssboard.vo.BoardArticleVO;
import com.chy.ssboard.vo.BoardListVO;

public interface BoardService {
	public List<BoardListVO> getList(int page, int count) throws Exception;
	public void write(BoardArticleVO boardArticleVO) throws Exception;
	public BoardArticleVO getArticle(int no) throws Exception;
	
}
