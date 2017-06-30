package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RegisterDao;
import dao.SemiDao;
import model.Register;
import model.Semi;
import model.Student;

/**
 * Servlet implementation class T01SubSelect
 */
@WebServlet("/T01SubSelect")
public class T01SubSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public T01SubSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		SemiDao semidao = new SemiDao();

		request.setAttribute("semi", semidao.getData());

		RequestDispatcher  rd =
				request.getRequestDispatcher("WEB-INF/T/SubSelect.jsp");
		rd.forward(request, response);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		HttpSession session = request.getSession();
		
		int subjectid = Integer.parseInt(request.getParameter("subjectid"));
		
		//DAOの実行
		SemiDao semidao = new SemiDao();
		request.setAttribute("array", semidao.getData1(subjectid));
		
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/T/StudentsList.jsp");
		rd.forward(request, response);



	

	}

}
