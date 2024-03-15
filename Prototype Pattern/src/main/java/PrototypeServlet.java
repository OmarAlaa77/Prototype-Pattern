// PrototypeServlet.java
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrototypeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Create prototype object
        Prototype original = new ConcretePrototype("Original Object");

        // Clone the original object
        Prototype cloned = original.clone();

        // Set attributes for JSP
        request.setAttribute("original", original);
        request.setAttribute("cloned", cloned);

        // Forward the request to JSP
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
