package org.mycompany;

import org.springframework.stereotype.Component;

@Component
public class Address {
	int doorno=23;
	String city="HiTech";
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
