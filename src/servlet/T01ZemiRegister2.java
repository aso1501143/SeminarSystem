package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Semi;

/**
 * Servlet implementation class T01ZemiRegister2
 */
@WebServlet("/T01ZemiRegister2")
public class T01ZemiRegister2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public T01ZemiRegister2() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		HttpSession session = request.getSession(false);
		request.setCharacterEncoding("UTF-8");

		Semi registSemi = (Semi)session.getAttribute("T01ZemiRegister");

		String subjectname = request.getParameter("subjectname");
		String subjectcf = request.getParameter("subjectcf");

		//情報を設定
		registSemi.setSubjectname(subjectname);
		registSemi.setSubjectcf(subjectcf);

		//sessionに情報格納
		session.setAttribute("T01ZemiRegister",registSemi);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/SubRegiConf.jsp");
		rd.forward(request, response);
	}
}
