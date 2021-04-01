package com.dachaoge.why;

import java.util.ArrayList;

/**
 * @author czhang@mindpointeye.com
 * @version 1.0
 * @Date 2021/3/3 15:45
 * @descrption 一般的程序
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("zhangsan",17,99));
        list.add(new Student("lisi",16,92));
        list.add(new Student("wangwu",20,80));
        list.add(new Student("zhaoliu",12,90));
        list.add(new Student("maqi",13,85));
        /** 查找年龄大于14的学生*/
        findByAge(list);
        System.out.println("----------------------");
        /** 查找分数大于90的学生*/
        findByScore(list);
    }
    public static void findByAge(ArrayList<Student> students){
        ArrayList<Student> list=new ArrayList<>();
        for(Student student:students){
            if(student.getAge()>14){
                list.add(student);
            }
        }
        for(Student student:list){
            System.out.println(student);
        }
    }
    public static void findByScore(ArrayList<Student> students){
        ArrayList<Student> list=new ArrayList<>();
        for(Student student:students){
            if(student.getScore()>90){
                list.add(student);
            }
        }
        for(Student student:list){
            System.out.println(student);
        }
    }

}
