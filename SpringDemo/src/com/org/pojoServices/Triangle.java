package com.org.pojoServices;

import java.beans.beancontext.BeanContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware , BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	ApplicationContext context;
	
	
	/*
	 * private List<Point> points;
	 * 
	 * 
	 * public List<Point> getPoints() { return points; }
	 * 
	 * public void setPoints(List<Point> points) { this.points = points; }
	 */




	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void display()
	{
			
			System.out.println("Details of A= "+getPointA().getX() + " to "+getPointA().getY());
			System.out.println("Details of B= "+getPointB().getX() + " to "+getPointB().getY());
			System.out.println("Details of C= "+getPointC().getX() + " to "+getPointC().getY());
		
		
	}



	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
			
			this.context = context;
		
	}



	@Override
	public void setBeanName(String beanName) {

		System.out.println("BeanName= "+beanName);
	}
	

}
