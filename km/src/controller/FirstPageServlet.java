package controller;
import java.util.*;
import java.io.*;
import java.util.List;
import javax.servlet.http.*;

import com.google.gson.Gson;

//import com.google.gson.Gson;

import javax.servlet.ServletRequest;
import bean.ListBean;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import modal.DataList;

import java.io.IOException;
import javax.servlet.ServletException;


@WebServlet(
  name = "FirstPageServlet", 
  urlPatterns = "/FirstPage")
public class FirstPageServlet extends HttpServlet {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public FirstPageServlet() {
        super();
    }

    protected void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
      List<ListBean> data;
	try {
		data = DataList.querydata();
	       request.setAttribute("data", data);
	       
	       
	       RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/index.jsp");
	       dispatcher.forward(request, response);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
    }


  

}