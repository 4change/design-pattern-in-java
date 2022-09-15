package com.java.design_pattern.abstract_factory.nv;

public abstract class AbstractHumanFactory {

	public abstract <T extends Human> T createHuman(Class<T> c);

}
