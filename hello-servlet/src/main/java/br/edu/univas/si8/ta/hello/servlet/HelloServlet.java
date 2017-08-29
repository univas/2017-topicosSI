package br.edu.univas.si8.ta.hello.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sayhello")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = -480948979164863528L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String message = String.format("<h1>Hello %s!!!</h1>", name);
		resp.getWriter().println(message);
	}

}
