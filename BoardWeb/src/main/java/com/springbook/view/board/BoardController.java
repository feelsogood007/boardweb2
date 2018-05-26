package com.springbook.view.board;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.BoardListVO;


@Controller
@SessionAttributes("board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping(value="/dataTransform.do")
	@ResponseBody
	public BoardListVO dataTransform(BoardVO vo){
		System.out.println("�� ��� ��ȯ ó��");		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardService.getBoardList(vo); // Model ����
		BoardListVO boardListVO = new BoardListVO();
		boardListVO.setBoardList(boardList);
		return boardListVO;
	}
	
	
	// �˻� ���� ��� ����	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("����", "TITLE");
		conditionMap.put("����", "CONTENT");
		return conditionMap;
	}
		
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException {
		// 1. ����� ����
//		request.setCharacterEncoding("EUC-KR");
		System.out.println("�� ��� ó��");
		
		MultipartFile uploadFile = vo.getUploadFile();
		if(!uploadFile.isEmpty()){
			String filename = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("E:/" + filename));
		}
		
		boardService.insertBoard(vo);
		return "getBoardList.do";		
	}	
	
	@RequestMapping(value="/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {			
		System.out.println("�� ���� ó��");
		System.out.println("�ۼ���  : " + vo.getSeq());
		System.out.println("�ۼ���  : " + vo.getTitle());
		System.out.println("�ۼ���  : " + vo.getWriter());
		System.out.println("�ۼ���  : " + vo.getContent());
		System.out.println("�ۼ���  : " + vo.getRegDate());
		System.out.println("�ۼ���  : " + vo.getCnt());
		boardService.updateBoard(vo);
		return "getBoardList.do";				
	}	
	
	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		System.out.println("�� ���� ó��");	
		boardService.deleteBoard(vo);
		return "getBoardList.do";				
	}
	
	@RequestMapping(value="/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		System.out.println("�� �� ��ȸ ó��");		
		model.addAttribute("board",boardService.getBoard(vo)); // Model ����		
		return "getBoard.jsp";		
	}	
	
	@RequestMapping(value="/getBoardList.do")
	public String getBoardList(@RequestParam(value="searchCondition", defaultValue="TITLE", required=false) String condition,
								@RequestParam(value="searchKeyword", defaultValue="", required=false) String keyword, 
								BoardVO vo, Model model) {
		System.out.println("�� ��� �˻� ó��");		
		System.out.println("�˻� ���� : " + condition);
		System.out.println("�˻� �ܾ� : " + keyword);
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		model.addAttribute("boardList", boardService.getBoardList(vo)); // Model ����
		return "getBoardList.jsp";					
	}
		
}
