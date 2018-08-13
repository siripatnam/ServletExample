import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Welcome2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();

        String username = req.getParameter("fname"); // query strings
        String password = req.getParameter("password");

        getServletContext().setAttribute("fname",username);
        getServletContext().setAttribute("password",password);

        if (username.equals("siri")) {

            if ("/welcome2".equals(req.getRequestURI())) {

                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Welcome.jsp");

                requestDispatcher.forward(req, resp);

//            printWriter.print("<html><body>Welcome to Servlet 2 </body></html>");
//
//            ServletConfig config = getServletConfig();
//
//            String greeting = config.getInitParameter("greeting");
//
//            System.out.println(greeting);
//
//            ServletContext context = getServletContext();
//            System.out.println(context.getInitParameter("name"));
            }
        }else {
               // printWriter.print("<html><body>Welcome to Servlet 2 </body></html>");
                resp.getWriter().print("Invalid Username and password");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Welcome.jsp");
                requestDispatcher.include(req,resp);
            }
        }
    }

