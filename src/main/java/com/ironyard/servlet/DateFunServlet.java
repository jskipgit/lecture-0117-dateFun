package com.ironyard.servlet;

import com.ironyard.data.InfoHolder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * This servlet is used to show examples of playing with dates...
 */
@WebServlet(name = "DateFunServlet", urlPatterns = "/daysUntilBirthday")
public class DateFunServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * If called, it will look for a param for a name and say hello to that person
     * and tell them how many days until Jasons birthday
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String personName = request.getParameter("name");
        // TODO: calculate days until jasons birthday, for now just hard-code
        int days = 300;

        InfoHolder tmp = new InfoHolder();
        tmp.setName(personName);
        tmp.setDays(days);

        if(tmp.getDays()>150){
            tmp.setStatus("you have a long wait!");
        }else{
            tmp.setStatus("almost there!!");
        }

        // puts into the request, data will be gone on next click
        request.setAttribute("infoHolderTmp", tmp);

        // put into request session attribute, data will remain for entire session
        request.getSession().setAttribute("infoHolderTmp", tmp);

        // forward to JSP
        String nextJSP = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }
}
