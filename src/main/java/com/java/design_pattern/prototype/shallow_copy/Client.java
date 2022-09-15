package com.java.design_pattern.prototype.shallow_copy;

public class Client {

    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }

}
