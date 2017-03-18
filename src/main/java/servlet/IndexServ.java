package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.KuniUtils;

public class IndexServ extends HttpServlet {

	private static final long serialversionUID = -1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println(KuniUtils.getMsg("abc"));

		String disp = "/index.jsp";
		RequestDispatcher dispatch = req.getRequestDispatcher(disp);

		dispatch.forward(req, res);

	}
}
