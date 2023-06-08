package com.demo.beans;

public abstract class Shapes {
 
	private static int count;
	
	static {
		count=1;
	}
	private String color;
    private int id;
    
    
	public Shapes(int id) {
		super();
		this.id =count;
		count++;
	}


	public Shapes(String color) {
		super();
		this.color = color;
		this.id = count++;
	}


	public Shapes() {
		super();
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public abstract float calculateArea();
	public abstract float calculatePerimeter();


	@Override
	public String toString() {
		return "Shapes [color=" + color + ", id=" + id + "]";
	}
	
	
	
}
