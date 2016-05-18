package studyHard;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controller
 */
@WebServlet("/studyHard/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);	 // doPost forwarding
		//response.setContentType("text/html");
		//response.setContentType("euc-kr");
			
		//request.setCharacterEncoding("euc-kr");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.setCharacterEncoding("euc-kr");
//		response.setContentType("text/html");
//		response.setContentType("euc-kr");

		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		int age = 0;
		
		PersonBean personbean = new PersonBean();
		
		if(name.equalsIgnoreCase("James Gosling")) age = 49; 
		else if(name.equalsIgnoreCase("Grady Booch")) age = 50;		
		
		personbean.setName(name);
		personbean.setNickname(nickname);
		personbean.setAge(age);
		request.setAttribute("PersonBean", personbean);
		
		String nextJSP = "/Response.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
		
	

	}
}
