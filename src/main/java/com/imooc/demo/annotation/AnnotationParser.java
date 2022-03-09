package com.imooc.demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationParser {
    //解析类的注解

    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class clazz = Class.forName("com.imooc.demo.annotation.ImoocCourse");

        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            CourseInfoAnnonation courseInfoAnnonation = (CourseInfoAnnonation)annotation;

            System.out.println("课程名"+courseInfoAnnonation.courseName());
        }
    }

    public  static  void paserFiledAnnotation() throws ClassNotFoundException {
        Class clazz = Class.forName("com.imooc.demo.annotation.ImoocCourse");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(PersonInfoAnnotation.class))
            {
                PersonInfoAnnotation personInfoAnnotation = (PersonInfoAnnotation)field.getAnnotation(PersonInfoAnnotation.class);

                System.out.println("姓名"+personInfoAnnotation.name());
//                System.out.println("语言"+personInfoAnnotation.language());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        parseTypeAnnotation();
        paserFiledAnnotation();
    }
}
