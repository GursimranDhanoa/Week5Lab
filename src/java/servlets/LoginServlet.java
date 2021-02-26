package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.account;
/**
 *
 * @author 821214
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession();
        String logout = request.getParameter("logout");
        String username = (String) session.getAttribute("username");
        
        
        if (logout != null) {
            session.invalidate();
            request.setAttribute("message", "User successfully logged out");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        
        if (username != null) {
            session.setAttribute("username", username);
            response.sendRedirect("home");
        }
        
         
        else {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        AccountService accountService = new AccountService();
        account user = null; 
        if (!username.isEmpty() && !password.isEmpty()) {
            user = accountService.login(username, password);
        }
        
        if (user != null){
            session.setAttribute("username", username);
            response.sendRedirect("home");
        }
        else {
            request.setAttribute("message", "Incorrect username or password, please try again.");
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        
        
        
        
        
        
         
    }


}
