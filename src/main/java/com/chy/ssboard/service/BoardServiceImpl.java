package com.chy.ssboard.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.chy.ssboard.vo.BoardArticleVO;
import com.chy.ssboard.vo.BoardListVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Override
	public List<BoardListVO> getList(int page, int count) throws Exception {
		List<BoardListVO> list = new ArrayList<BoardListVO>();
		for (int i=1; i<5; i++) {
			BoardListVO boardListVO = new BoardListVO();
			boardListVO.setNo(i);
			boardListVO.setCategory("일반");
			boardListVO.setTitle("제목");
			boardListVO.setWriteDate(new Date());
			boardListVO.setReadCount(10+i);
			
			list.add(boardListVO);
		}
		
		return list;
	}

	@Override
	public void write(BoardArticleVO boardArticleVO) throws Exception {
		System.out.println("Write Data : "+boardArticleVO.toString());
		
		return;
	}

	@Override
	public BoardArticleVO getArticle(int no) throws Exception {
		BoardArticleVO boardArticleVO = new BoardArticleVO();
		boardArticleVO.setNo(no);
		boardArticleVO.setUserId("hychun");
		boardArticleVO.setUserName("작성자");
		boardArticleVO.setPassword("1234");
		boardArticleVO.setCategory("일반");
		boardArticleVO.setTitle("제목");
		boardArticleVO.setContent("본문1줄\n본문2줄\n본문3줄");
		boardArticleVO.setWriteDate(new Date());
		boardArticleVO.setReadCount(11);
		
		return boardArticleVO;
	}

}
