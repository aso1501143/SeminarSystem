package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentDao;
import model.Student;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class G01Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public G01Login() {
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

		String path;

		HttpSession session = request.getSession();

		request.setCharacterEncoding("UTF-8");
		int studentid = Integer.parseInt(request.getParameter("studentid"));
		String passwd = request.getParameter("passwd");

		StudentDao studentdao = new StudentDao();
		Student student = new Student();

		student = studentdao.getUser(studentid, passwd);

		if (student != null){
			System.out.println("ログイン成功");
			//
			session.setAttribute("CommmonLoginUser", student);
			//
			path  = "WEB-INF/jsp/select.jsp";

		}else{
			System.out.println("ログイン失敗");
			request.setAttribute("errorMessage", "会員IDまたはパスワードが違います。");
			path = "login.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
}
