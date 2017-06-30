package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SemiDao;
import model.Semi;

/**
 * Servlet implementation class T01zemi
 */
@WebServlet("/T01ZemiRegister")
public class T01ZemiRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public T01ZemiRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/T/SubRegi.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);


		HttpSession session = request.getSession(false);

		Semi regidata = (Semi)session.getAttribute("T01ZemiRegister");

		SemiDao semiDao = new SemiDao();
		semiDao.insertData(regidata);

		session.setAttribute("regisemi", regidata);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/T/SubRegiConp.jsp");
		rd.forward(request, response);
	}

}
