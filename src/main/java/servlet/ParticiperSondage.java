package servlet;

import dao.DaoSondage;
import jpa.Sondage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="Participersondage",
        urlPatterns={"/ParticiperSondage"})
public class ParticiperSondage extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>\n<body>\n" +
                "<h1>Participer au sondage </h1>\n" +
                request.getParameter("id") +
                "</body></html>");
    }
}
