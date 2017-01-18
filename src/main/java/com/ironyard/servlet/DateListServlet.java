package com.ironyard.servlet;

import com.ironyard.data.InfoHolder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by jasonskipper on 1/18/17.
 */
@WebServlet(name = "DateListServlet", urlPatterns = "/add")
public class DateListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // fetch data
        String aSingleDate = request.getParameter("mydate");

        System.out.println(InfoHolder.totalNumberOfInfoObjects);
        // create an InfoHolder
        InfoHolder tmpH = null;
        try {
            tmpH = new InfoHolder(aSingleDate);
            // conditionally create list
            ArrayList<InfoHolder> myList = null;

            myList = (ArrayList<InfoHolder>) request.getSession().getAttribute("date_list");

            if(myList == null){

                // need to create
                myList = new ArrayList<>();
                // only when new list
                request.getSession().setAttribute("date_list", myList);
            }

            // add to list
            myList.add(tmpH);
        } catch (ParseException e) {

            // tell user they messed up
            request.setAttribute("err_msg", "Error:"+e.getMessage());
        }



        // forward to JSP
        String nextJSP = "/date_input.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
