package com.java.design_pattern.decorator.example_decorator;

public class Father {

    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport sr;
        // 原装的成绩单
        sr = new FouthGradeSchoolReport();
        // 加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        // 又加了成绩排名的说明
        sr = new SortDecorator(sr);
        // 看成绩单
        sr.report();
        // 然后老爸一看，很开心，就签名了
        sr.sign("老三");
    }

}
