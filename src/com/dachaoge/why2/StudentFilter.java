package com.dachaoge.why2;

import com.dachaoge.why.Student;

/**
 * @author czhang@mindpointeye.com
 * @version 1.0
 * @Date 2021/3/3 16:43
 * @descrption
 */
public interface StudentFilter {
    boolean compare(Student student);
}
