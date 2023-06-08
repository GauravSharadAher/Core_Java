package com.demo.beans;

public class Rectangle extends Shapes{
	
	private int base;
	private int height;
	
	
	public Rectangle( ) {
		super();

	}
	
	public Rectangle(String color, int b, int h) {
		super(color);
		this.base = b;
		this.height = h;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public  float calculateArea() {
		return this.base*this.height;
	}
	
	public float calculatePerimeter() {
		
		return 2*(base+height);
	}

	@Override
	public String toString() {
		return super.toString()+"Rectangle [base=" + base + ", height=" + height + "]";
	}
	


	

}
