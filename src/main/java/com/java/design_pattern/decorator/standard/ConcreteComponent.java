package com.java.design_pattern.decorator.standard;

public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.err.println("do Something...");
    }

}
