package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 821214
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.equals("") || password == null || password.equals("")) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
           
            
            getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp")
                    .forward(request, response);
            return;
        }
        
        
          getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }


}
