package org.galapagos.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.galapagos.vo.User;

public class DetailCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Datail Command");
		String userid = request.getParameter("userid");
		
		// userid로 DB 검색
		User user = new User(userid, "1234", userid + "@naver.com");
		
		// user라는 이름으로 request scope 저장
		request.setAttribute("user", user);
		
		return "detail";
	}

}
