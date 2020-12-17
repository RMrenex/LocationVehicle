package fr.gestlocation.gestionloc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/disconnectServlet")
public class DisconnectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String key;
        for (Enumeration names = session.getAttributeNames(); names.hasMoreElements();) {
            key = (String) names.nextElement();
            session.removeAttribute(key);
        }
        session.invalidate();
        session = null;


        this.getServletContext().getRequestDispatcher("/index.jsp").forward( req, resp);
    }
}
