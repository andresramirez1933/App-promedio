//Implementado por Andrés Felipe Ramirez Pardo

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = {"/Resultado"})
public class Resultado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Resultado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1> Resultado de promedio </h1>");
            out.println("<br><br>");
            out.println("Nombre: " + request.getParameter("nom"));
            out.println("<br><br>");
            out.println("Apellido: " + request.getParameter("ape"));
            out.println("<br><br>");
            out.println("Corte 1: " + request.getParameter("n1"));
            out.println("<br><br>");
            out.println("Corte 2: " + request.getParameter("n2"));
            out.println("<br><br>");
            out.println("Corte 3: " + request.getParameter("n3"));
            out.println("<br><br>");
            if(request.getParameter("pro") != null );
            
            {
            
                int nota1 = Integer.parseInt(request.getParameter("n1"));
                int nota2 = Integer.parseInt(request.getParameter("n2"));
                int nota3 = Integer.parseInt(request.getParameter("n3"));
            
                double notafinal = (nota1 * 0.35) + (nota2 * 0.35) + (nota3 * 0.3);
                
                out.println("El promedio es: " + notafinal);
            }
            
            out.println("</center>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
