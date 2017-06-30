package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TeacherDao;
import model.Teacher;

/**
 * Servlet implementation class G01Sure
 */
@WebServlet("/G01Sure")
public class G01Sure extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public G01Sure() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		String teacherid = request.getParameter("teacherid");
		int passwd = Integer.parseInt(request.getParameter("passwd"));

		TeacherDao teacherdao = new TeacherDao();
		Teacher teacher = new Teacher();

		teacher = teacherdao.getUser(teacherid, passwd);

		if (teacher != null){
			System.out.println("ログイン成功");
			//
			session.setAttribute("CommmonLoginUser", teacher);
			//
			path  = "WEB-INF/T/Managertop.jsp";

		}else{
			System.out.println("ログイン失敗");
			request.setAttribute("errorMessage", "会員IDまたはパスワードが違います。");
			path = "WEB-INF/T/Managertop.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}



}
