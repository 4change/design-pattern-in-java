package com.java.design_pattern.prototype.unexecuted_constructor;

public class Client {

    public static void main(String[] args) {
        Thing thing = new Thing();
        @SuppressWarnings("unused")
		Thing cloneThing = thing.clone();
    }

}
