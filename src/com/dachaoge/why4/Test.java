package com.dachaoge.why4;

import com.dachaoge.why.Student;
import com.dachaoge.why2.StudentFilter;

import java.util.ArrayList;

/**
 * @author czhang@mindpointeye.com
 * @version 1.0
 * @Date 2021/3/11 10:30
 * @descrption lamdba
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan", 17, 102));
        list.add(new Student("lisi", 16, 93));
        list.add(new Student("wangwu", 20, 83));
        list.add(new Student("zhaoliu", 12, 89));
        list.add(new Student("maqi", 13, 86));

        getByFilter(list, (student) -> student.getAge() > 15);
        getByFilter(list, (e) -> e.getScore() > 90);
        getByFilter(list, (e) -> e.getName().length() > 5);

    }

    public static void getByFilter(ArrayList<Student> students, StudentFilter filter) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (filter.compare(student)) {
                list.add(student);
            }
        }
        printStudent(list);
        System.out.println("----------------------------");
    }

    public static void printStudent(ArrayList<Student> students) {
        students.forEach(System.out::println);
    }
}
