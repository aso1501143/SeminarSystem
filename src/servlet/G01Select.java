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
import model.Register;
import model.Semi;
import model.Student;


/**
 * Servlet implementation class G01Select
 */
@WebServlet("/G01Select")
public class G01Select extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public G01Select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());		String subjectcf = request.getParameter("subjectcf");
		
		SemiDao semidao = new SemiDao();

		request.setAttribute("cf", semidao.getData());

		RequestDispatcher  rd =
				request.getRequestDispatcher("WEB-INF/S/Select.jsp");
		rd.forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession session = request.getSession(false);
		
		Student student = (Student)session.getAttribute("CLU");
		
		


		Register reg = new Register();
		
		//フォームの確認
		int studentid = student.getStudentid();
		int subjectid = Integer.parseInt(request.getParameter("subjectid"));

		// 情報を設定
		reg.setStudentid(studentid);
		reg.setSubjectid(subjectid);

		// sessionに情報格納
		session.setAttribute("G01Confirm", reg);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/S/Studentconfirm.jsp");
		rd.forward(request, response);


	}

}
