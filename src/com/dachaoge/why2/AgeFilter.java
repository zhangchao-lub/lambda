package com.dachaoge.why2;

import com.dachaoge.why.Student;

/**
 * @author czhang@mindpointeye.com
 * @version 1.0
 * @Date 2021/3/3 16:44
 * @descrption
 */
public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge()>14;
    }
}
