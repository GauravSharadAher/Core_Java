package com.demo.beans;

public class Circle extends Shapes{
	
	private int radius;
	
	

	public Circle(String color,int radius) {
		super(color);
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public  float calculateArea() {
		return (float) (Math.PI*this.radius*this.radius);
	}
	
	public float calculatePerimeter() {
		
		return (float) (2*(Math.PI*this.radius));
	}
	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}
	
	
	
	

}
