package com.example.domain;

public class car {
	
	private String name;
	private Integer speed;
	private String BodyColor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getBodyColor() {
		return BodyColor;
	}
	public void setBodyColor(String bodyColor) {
		BodyColor = bodyColor;
	}
	
	@Override
	public String toString() {
		return "car [name=" + name + ", speed=" + speed + ", BodyColor=" + BodyColor + "]";
	}
	
}
