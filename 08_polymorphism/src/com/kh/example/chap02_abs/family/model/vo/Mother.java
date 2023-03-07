package com.kh.example.chap02_abs.family.model.vo;

public class Mother extends Family implements Basic, Cloneable { // 조상 클래스 Family, 후손 클래스 Mother (상속관계)
	private String babyBirth;
	
	public Mother() {}
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + babyBirth; 
	}
	
	@Override
	public void eat() {
		super.setHealth(super.getHealth() - 5);
		super.setWeight(super.getWeight() + 10);
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
}
