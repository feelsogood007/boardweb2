package com.springbook.biz;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import javax.servlet.ServletException;


@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {

	public HelloServlet(){
		System.out.println("HelloServlet 객체생성");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("doGet() 메소드 호출");	
	}
	
}

