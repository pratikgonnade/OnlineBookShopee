
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.xdevapi.Result;

@WebServlet("/purchaseServlet")

public class purchase extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 HttpSession session=request.getSession();
		 String bkid = (String)session.getAttribute("BkID");
		 
		 System.out.println("Book ID in Purchase= " +bkid );
		 
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver Loaded in Purchace ");
			 
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopee","root","admin");
			System.out.println("Connection sucess in purchase");
			
			PreparedStatement pstm =  con.prepareStatement("select * from books where Books_ID=? ");
			pstm.setString(1, bkid);
			
			ResultSet rs1 = pstm.executeQuery();

			session.setAttribute("rs1", rs1);
			
		/*	while(rs.next()) {
				System.out.print(rs.getString("Books_name")+" | ");
				System.out.print(rs.getString("Author")+" | ");
				System.out.println(rs.getInt("Price")+" | ");
				
			}*/
			
			response.sendRedirect("purchase.jsp");
			
		 }
		 catch (ClassNotFoundException e){
			 e.printStackTrace();
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
