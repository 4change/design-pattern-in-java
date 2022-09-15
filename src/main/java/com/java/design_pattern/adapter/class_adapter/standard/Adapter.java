package com.java.design_pattern.adapter.class_adapter.standard;

public class Adapter extends Adaptee implements Target {
	@Override
	public void request() {
		super.doSomething();
	}
}
