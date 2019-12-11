package com.chy.ssboard.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.chy.ssboard.vo.BoardArticleVO;

public interface MainController {
	public ModelAndView list(int page, int count, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView modifyform(int no, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public String writeform(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public String write(Map<String, String> article, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView view(int no, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
