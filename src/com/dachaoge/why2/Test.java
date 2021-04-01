package com.dachaoge.why2;

import com.dachaoge.why.Student;

import java.util.ArrayList;

/**
 * @author czhang@mindpointeye.com
 * @version 1.0
 * @Date 2021/3/3 15:45
 * @descrption lambda + 策略模式
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("zhangsan",17,100));
        list.add(new Student("lisi",16,93));
        list.add(new Student("wangwu",20,82));
        list.add(new Student("zhaoliu",12,90));
        list.add(new Student("maqi",13,85));

        getByFilter(list,new AgeFilter());
        System.out.println("-------------------------");
        getByFilter(list,new ScoreFilter());

    }

    public static void getByFilter(ArrayList<Student> students,StudentFilter filter){
        ArrayList<Student> list=new ArrayList<>();
        for(Student student:students){
            if(filter.compare(student)){
                list.add(student);
            }
        }
        printStudent(list);
    }

    public static void printStudent(ArrayList<Student> students){
        students.forEach(System.out::println);
    }
}
