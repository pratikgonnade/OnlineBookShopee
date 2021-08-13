

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WelcomeServlet")
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
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshopee","root","admin");
			System.out.println("Connection Created ");
			
			Statement stm = con.createStatement();
			
			ResultSet rs = 	stm.executeQuery("Select * from books");
			
			while(rs.next()) {
				
				
					System.out.print(rs.getString("Books_ID")+" | ");
					System.out.print(rs.getString("Books_name")+" | ");
					System.out.print(rs.getString("Author")+" | ");
					System.out.print(rs.getInt("Price")+" | ");
					System.out.println();
					
			}
			
			
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
