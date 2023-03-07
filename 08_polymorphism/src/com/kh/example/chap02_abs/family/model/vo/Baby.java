package com.kh.example.chap02_abs.family.model.vo;

public class Baby extends Family implements Basic{ // 오버라이딩 강제화
	
	public Baby() {}
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return "(Baby) : " + super.toString();
	}
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
	}
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 3);
	}

}
