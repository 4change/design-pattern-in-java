package com.java.design_pattern.abstract_factory.standard;

public class ConcreteCreator extends Creator {
	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			// 通过反射创建对象
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (T) product;
	}
}
