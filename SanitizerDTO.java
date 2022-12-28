package com.xworks.collection;

public class SanitizerDTO {
	private Integer id;
	private String brand;
	private double price;
	private String color;
	public SanitizerDTO(Integer id, String brand, double price, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", getId()="
				+ getId() + ", getBrand()=" + getBrand() + ", getPrice()=" + getPrice() + ", getColor()=" + getColor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
