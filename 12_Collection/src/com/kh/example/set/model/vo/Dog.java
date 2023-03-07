package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog>{
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name + "(" + weight + " kg)";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// 객체 자체 비교
		if(this == obj) {	// 주소값 비교
			return true;
		}
		if(obj == null) {	// equals()는 이미 객체 생성되어 있음
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		// 객체 내용 비교
		Dog other = (Dog)obj;
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		} else if(!name.equals(other.name)) {
			return false;
		}
		if(weight != other.weight) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (name == null? 0 : name.hashCode());
		Double d = weight;
		result = prime * result + d.hashCode();
//		result = (int)(prime * result + weight);
		return result;
	}
	
	@Override
	public int compareTo(Dog o) {
		// 이름 오름차순
		return name.compareTo(o.name);
	}
}
