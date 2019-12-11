package com.chy.ssboard.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chy.ssboard.service.BoardServiceImpl;
import com.chy.ssboard.vo.BoardArticleVO;
import com.chy.ssboard.vo.BoardListVO;

@Controller("mainController")
public class MainControllerImpl implements MainController {

	@Autowired
	BoardServiceImpl boardService;

	@RequestMapping(value = "/list")
	@Override
	public ModelAndView list(@RequestParam(value="page", defaultValue="1") int page, @RequestParam(value="count", defaultValue="50") int count, HttpServletRequest request, HttpServletResponse respon) throws Exception
	{
		if (count == 0) count = 50;
		
		List<BoardListVO> list = boardService.getList(page, count);
		ModelAndView mav = new ModelAndView("list", "list", list);
		return mav;
	}

	@RequestMapping(value = "/modifyform")
	@Override
	public ModelAndView modifyform(@RequestParam("no") int no, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("writeform", "no", no);
	}
	
	@RequestMapping(value = "/writeform")
	@Override
	public String writeform(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "writeform";
	}

	@RequestMapping(value = "/write")
	@Override
	public String write(@RequestParam Map<String, String> article, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		BoardArticleVO boardArticleVO = new BoardArticleVO();
		boardArticleVO.setCategory(article.get("no"));
		boardArticleVO.setCategory(article.get("userid"));
		boardArticleVO.setCategory(article.get("name"));
		boardArticleVO.setCategory(article.get("password"));
		boardArticleVO.setCategory(article.get("category"));
		boardArticleVO.setTitle(article.get("title"));
		boardArticleVO.setContent(article.get("content"));
		boardArticleVO.setWriteDate(new Date());
		boardArticleVO.setReadCount(0);
		
		boardService.write(boardArticleVO);
		
		return "redirect:list";
	}

	@RequestMapping(value = "/view")
	@Override
	public ModelAndView view(@RequestParam("no") int no, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		BoardArticleVO boardArticleVO = boardService.getArticle(no);
		ModelAndView mav = new ModelAndView("view", "article", boardArticleVO);
		
		return mav;
	}


}
