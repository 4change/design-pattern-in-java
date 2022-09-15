package com.java.design_pattern.decorator.example_decorator;

public abstract class SchoolReport {

    // 成绩单主要展示的就是你的成绩情况
    public abstract void report();

    // 成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);

}
