import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("login.html");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        
        // Perform JDBC operations to validate user credentials and log in
        // Example:
        if (isValidUser(username, password, email)) {
            out.println("<h1>Login successful</h1>");
        } else {
            out.println("<h1>Login failed. Invalid username, password, or email</h1>");
        }
    }
    
    private boolean isValidUser(String username, String password, String email) {
        // Perform database query to check if username, password, and email match
        // Example:
        // SELECT * FROM users WHERE username = ? AND password = ? AND email = ?
        // If a row is returned, user credentials are valid; otherwise, they are invalid
        return true; // Placeholder return value
    }
}