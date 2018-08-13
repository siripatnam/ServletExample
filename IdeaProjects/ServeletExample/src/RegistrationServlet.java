import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();

        String username = req.getParameter("uname"); // query strings
        String password = req.getParameter("password");

        getServletContext().setAttribute("uname",username);
        getServletContext().setAttribute("password",password);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/Login.jsp");
        requestDispatcher.forward(req,resp);

//        if (username.equals("siri") && (password.equals("admin"))) {
//
//            if ("/Login".equals(req.getRequestURI())) {
//
//                printWriter.print("<html><body> Welcome </body></html>");
//
//            }
//        }else {
//                resp.getWriter().print("Invalid Username and password");
//
//            }

        }
    }

