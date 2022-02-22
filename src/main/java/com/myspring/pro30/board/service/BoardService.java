package com.myspring.pro30.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myspring.pro30.board.vo.ArticleVO;

public interface BoardService {

	List<ArticleVO> listArticles() throws DataAccessException;

	Map viewArticle(int articleNO) throws Exception;

	void modArticle(Map articleMap) throws Exception;

	void removeArticle(int articleNO) throws Exception;

	int addNewArticle(Map articleMap) throws Exception;

	
}
