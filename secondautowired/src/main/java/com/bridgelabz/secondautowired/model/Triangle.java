package com.bridgelabz.secondautowired.model;

import java.util.Iterator;
import java.util.List;

public class Triangle
{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA()
	{
		return pointA;
	}
	public void setPointA(Point pointA)
	{
		this.pointA = pointA;
	}
	public Point getPointB() 
	{
		return pointB;
	}
	public void setPointB(Point pointB) 
	{
		this.pointB = pointB;
	}
	public Point getPointC() 
	{
		return pointC;
	}
	public void setPointC(Point pointC) 
	{
		this.pointC = pointC;
	}
	
	
	public void dispaly()
	{
		System.out.println();
		System.out.println("triangle 1 coordinates are "+getPointA().getX()+" "+getPointA().getY());
		System.out.println("triangle 2 coordinates are "+getPointB().getX()+" "+getPointB().getY());
		System.out.println("triangle 3 coordinates are "+getPointC().getX()+" "+getPointC().getY());
	}
	

	
}

	

