

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcomebook")
public class Welcomebook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Welcomebook() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Welcome Pages");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
