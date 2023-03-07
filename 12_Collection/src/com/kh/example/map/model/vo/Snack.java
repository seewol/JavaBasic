package com.kh.example.map.model.vo;

public class Snack {
	private String flavor;
	private int price;
	
	public Snack() {}
	public Snack(String flavor, int price) {
		this.flavor = flavor;
		this.price = price;
	}
	
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return flavor + "[" + price + "원]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Snack other = (Snack)obj; // Snack 안에 있는 내용 비교를 위해
		if(flavor == null) {	  // 다운 캐스팅 형변환을 진행한다
			if(other.flavor != null) {
				return false;
			}
		} else if(!flavor.equals(other.flavor)) {
			return false;
		}
		if(price != other.price) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (flavor == null? 0 : flavor.hashCode());
		result = prime * result + price;
		return result;
	}
}
