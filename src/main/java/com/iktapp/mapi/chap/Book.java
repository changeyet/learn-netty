package com.iktapp.mapi.chap;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/11/24 21:32
 */
public class Book
{
    void draw()
    {
        System.out.println("book draw()");
    }

    Book()
    {
        System.out.println("before");
        draw();
        System.out.println("after");
    }

}
