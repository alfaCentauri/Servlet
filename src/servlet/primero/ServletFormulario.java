package servlet.primero;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletFormulario extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession();
        String nombre = request.getParameter("nombre");
        String clave = request.getParameter("clave");
        String sexo = request.getParameter("sexo");
        String[] lenguajes = request.getParameterValues("lenguajes");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejemplo de servlet</title>");
            out.println("<link rel=\"stylesheet\" href=\"css/estilos.css\" />\n");
            out.println("</head>");
            out.println("<body>");
            out.println("<div>\n");
            out.println("<H1>El formulario desde un Servlet es:</H1>\n");
            out.println("<p>Nombre: "+ nombre +", clave: " + clave + "</p>\n");
            out.println("</div>\n");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
