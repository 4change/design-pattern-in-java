package com.java.design_pattern.adapter.class_adapter.standard;

public class ConcreteTarget implements Target {
	@Override
	public void request() {
		System.out.println("if you need any help,pls call me!");
	}
}
