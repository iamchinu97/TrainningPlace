package cocm.sapient.week2.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.week2.bean.StudentBean;
import com.sapient.week2.bundle.ReBundle;
import com.sapient.week2.dao.StudentDAO;
import com.sapient.week2.exceptions.RecordNotFoundException;

/**
 * Servlet implementation class StudentMarksController
 */
public class StudentMarksController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentMarksController() {
        super();
        // TODO Auto-generated constructor stub
    }
    ServletContext context;
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	context= config.getServletContext();
    	try {
			context.setAttribute("studentList", new StudentDAO().getStudentDetails());
		} 
    	catch(Exception e)
    	{
    		
    	}
    	super.init(config);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String rollno=request.getParameter("rollno");
			System.out.println(rollno);
			if(rollno==null)
			{
				throw new RecordNotFoundException(ReBundle.getValue("RECORD_NOT_FOUND_ERROR"));
			}
			StudentBean sb=((Map<String, StudentBean>)context.getAttribute("studentList")).get(rollno);
			System.out.println(sb.toString());
			if(sb==null)
			{
				throw new RecordNotFoundException(ReBundle.getValue("RECORD_NOT_FOUND_ERROR"));
			}
			RequestDispatcher rs = request.getRequestDispatcher("StudentMarks.jsp");
			request.setAttribute("studentDetails", sb);
			rs.forward(request, response);
		}
		catch(RecordNotFoundException r)
		{
			RequestDispatcher rs = request.getRequestDispatcher("StudentMarks.jsp");
			request.setAttribute("msg", r.getMessage());
			rs.forward(request, response);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		
	}

}
