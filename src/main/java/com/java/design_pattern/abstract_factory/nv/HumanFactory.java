package com.java.design_pattern.abstract_factory.nv;

public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		//定义一个生产的人种
		Human human = null;
		try {
			//产生一个人种
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("人种生成错误！ ");
		}
		return (T) human;
	}

}
