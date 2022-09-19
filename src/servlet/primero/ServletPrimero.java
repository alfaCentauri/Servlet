package servlet.primero;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ricardopresilla@gmail.com
 * @version 1.0
 */
public class ServletPrimero extends HttpServlet{
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession();
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejemplo de servlet</title>");
            out.println("<link rel=\"stylesheet\" href=\"css/estilos.css\" />\n");
            out.println("</head>");
            out.println("<body>");
            out.println("<div>\n");
            out.println("<H1>Hola mundo desde un Servlet.</H1>\n");
            out.println("</div>\n");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
