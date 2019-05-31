package com.caos.webservice.bean;

public class BeanExample {
	private String value;

	public BeanExample(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BeanExample [value=" + value + "]";
	}
	
	
}
