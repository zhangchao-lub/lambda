package com.dachaoge.why3;

import com.dachaoge.why.Student;
import com.dachaoge.why2.StudentFilter;

import java.util.ArrayList;

/**
 * @author czhang@mindpointeye.com
 * @version 1.0
 * @Date 2021/3/11 10:30
 * @descrption 匿名内部类
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("zhangsan",17,101));
        list.add(new Student("lisi",16,92));
        list.add(new Student("wangwu",20,83));
        list.add(new Student("zhaoliu",12,89));
        list.add(new Student("maqi",13,86));

        getByFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getAge()>14;
            }
        });
        getByFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getScore()>75;
            }
        });
        getByFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getName().length()>4;
            }
        });

    }
    public static void getByFilter(ArrayList<Student> students, StudentFilter filter){
        ArrayList<Student> list=new ArrayList<>();
        for(Student student:students){
            if(filter.compare(student)){
                list.add(student);
            }
        }
        printStudent(list);
        System.out.println("----------------------------");
    }

    public static void printStudent(ArrayList<Student> students){
        students.forEach(System.out::println);
    }
}
