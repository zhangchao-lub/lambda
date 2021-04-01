package com.dachaoge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author czhang@mindpointeye.com
 * @version 1.0
 * @Date 2021/3/3 15:20
 * @descrption Lambda表达式的特点：1，函数式编程
 *                                 2，参数类型自动判断
 *                                 3，代码量少，简洁
 */
public class LambdaDemo {
    public static void main(String[] args) {
        /** 常用创建线程的方式*/
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running");
            }
        });
        thread.start();
        /** lambda创建线程方式*/
        new Thread(()->{
            System.out.println("lambda running");
        }).start();

        List<String> list= Arrays.asList("java","javascript","scala","python");
        /** 内部类排序方法*/
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for(String s:list){
            System.out.println(s);
        }
        /** lambda排序方式*/
        Collections.sort(list,(a,b)->b.length()-a.length());
        list.forEach(System.out::println);
    }
}
