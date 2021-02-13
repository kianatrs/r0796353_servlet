package ui.view;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><title>dynamisch!</title></head>");
        out.println("<body><h1>dit is een dynamische pagina</h1><p><a href=\"index.html\">index pagina</a></p>");
        out.println("<p id=\"dynamisch\"> Het is vandaag: ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        out.println(dtf.format(now));
        out.println("</p></body>");
        out.println("</html>");
    }
}
