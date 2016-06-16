package studyHard;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register/studyHard/transactioncontroller")
public class TransactionController extends HttpServlet implements Serializable{
	private static final long serialVersionUID = 1L;
	private String result="";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionController() {
        super();
    }

	public String getResult() {	
		System.out.println("GetResult "+result);
		return result;
	}

	public void setResult(String result) {
		System.out.println("SetResult "+result);
		this.result = result;
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String word1 = request.getParameter("word1");
		String word2 = request.getParameter("word2");
		
		System.out.println(name);
		System.out.println(word1);
		

		try {
			PersonAssociatedWordTransactionRepository.getInstance().setAssocicateWords(name, word1, word2);
			request.setAttribute("result", "정상 처리되었습니다.");
		} catch(SQLException e) {
			request.setAttribute("result", "정상 처리되지 않았습니다.");
		}
		

		String nextJSP = "/register/transaction-result.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);		
	}

}
