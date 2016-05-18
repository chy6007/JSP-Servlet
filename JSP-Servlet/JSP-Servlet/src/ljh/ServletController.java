package ljh;

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
@WebServlet("/ljh/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);	 // forwarding to doPost
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String JAMES_GOSLING = "James Gosling";
		final String GRADY_BOOCH = "Grady Booch";
		
		/* 20160519 과제 : JavaBean 적용해보기*/
		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		int age = 0;
		
		if(name.equalsIgnoreCase(JAMES_GOSLING)){
			System.out.println(JAMES_GOSLING);
			age = 49;
		} else if(name.equalsIgnoreCase(GRADY_BOOCH)){
			System.out.println(GRADY_BOOCH);
			age = 50;
		} else {
			
		}
		
		PersonBean person = new PersonBean();
		person.setName(name);
		person.setNickname(nickname);
		person.setAge(age);
				
		request.setAttribute("person", person); //request.setAttribute("객체명", 객체); 
		
		String nextJSP = "/ResponseL.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
		
		
		/* 20160518 */
		
		/*
		String nextJSP = "/Response.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
		 */		
		
		/*
		 * PrintWriter out = response.getWriter();
		 * out.println("<!DOCTYPE html>");
		 * out.println("<html>");
		 * out.println("hello servlet");
		 * out.println("</html>");
		 */

		
	}

}
