package com.kimhank.myboard;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kimhank.myboard.service.BoardServiceImpl;
import com.kimhank.myboard.service.BoardVO;
import com.kimhank.myboard.service.IBoardService;

@Controller
public class BoardController {

	@Autowired
	private IBoardService boardServiceImpl;
	
	public BoardController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping( "/board/boardList.do" )
	public String boardList (@ModelAttribute("boardVO") BoardVO boardVO, Model model  ) throws Exception{
			List<BoardVO> list = boardServiceImpl.selectBoardList(boardVO);
			model.addAttribute( "list", list);
			
			return "board/boardList";
	}
	
	 @RequestMapping("/board/writeForm.do")
	  public String writeBoardForm() throws Exception{
	        
	        return "board/writeForm";
	  }
	 
	 @RequestMapping("/board/write.do")
	    public String write(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception{
	        
	        boardServiceImpl.insertBoard(boardVO);
	        
	        return "redirect:/board/boardList.do";
	    }
	  
	 @RequestMapping(value="/board/viewContent.do")
	    public String viewForm(@ModelAttribute("boardVO") BoardVO boardVO, Model model, HttpServletRequest request) throws Exception{
	        
	        int code = Integer.parseInt(request.getParameter("bid"));
	        boardVO.setBid(code);
	        
	        BoardVO resultVO = boardServiceImpl.selectBoard(boardVO);
	        
	        model.addAttribute("result", resultVO);
	        
	        return "board/viewForm";
	    }
	 
	 @RequestMapping(value="/board/updateboard.do")
	    public String updateBoard(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception{
	        try{
	            boardServiceImpl.updateBoard(boardVO);
	            
	        } catch (Exception e){
	            e.printStackTrace();
	        }        
	        
	        return "redirect:/board/boardList.do";
	    }
	 
		@RequestMapping("/board/delete.do")
		public String delete(@ModelAttribute("boardVO") BoardVO boardVO, Model model, HttpServletRequest request) {
			
			System.out.println("delete()");
			try {
				boardServiceImpl.deleteBoard(boardVO);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return "redirect:board/boardList";
		}
}
