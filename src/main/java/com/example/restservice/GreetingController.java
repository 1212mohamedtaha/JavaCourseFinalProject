package com.example.restservice;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class GreetingController {




	/**protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) throws ServletException, IOException {
		String url = "/index.jsp";
		String userName = request.getParameter("name");
		request.setAttribute("usersNmae", userName);
		request.getServletContext().getRequestDispatcher(url).forward(request,response);
	}**/
	/**Changes*/

	@RequestMapping("/clean") /**This is the url that will show*/
	public String redirect()
	{
		return "cleanData";
	}

	@RequestMapping("/jop-per-company") /**This is the url that will show*/
	public String redirect2()
	{
		return "countJobs";
	}

	@RequestMapping("/popular-jobs") /**This is the url that will show*/
	public String redirect3()
	{
		return "popularJobs";
	}

	@RequestMapping("/popular-areas") /**This is the url that will show*/
	public String redirect4()
	{
		return "popularAreas";
	}

	@RequestMapping("/summary") /**This is the url that will show*/
	public String test()
	{
		return "summary";
	}

	@RequestMapping("/important-skills") /**This is the url that will show*/
	public String redirect5()
	{
		return "importantSkills";
	}

	@RequestMapping("/factorization") /**This is the url that will show*/
	public String redirect6()
	{
		return "factorize";
	}



	/**Pictures*/



}
