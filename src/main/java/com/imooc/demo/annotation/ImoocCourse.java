package com.imooc.demo.annotation;


@CourseInfoAnnonation(courseName = "www",courseTag = "ggg",courseProfile = "333")

public class ImoocCourse {
    @PersonInfoAnnotation(name="wangty",language = {"java","C"})
    private String author;

    @CourseInfoAnnonation(courseName = "fjfjfjf",courseProfile = "dsfasdfasdf",courseIndex = 404,courseTag = "ffffffff")
    public void getCourseInfo()
    {

    }
}
