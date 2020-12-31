package com.iktapp.mapi.chap;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/11/14 14:29
 */
public class Page106
{

    class Art
    {
        Art()
        {
            System.out.println("Art");
        }
    }

    class Drawing extends Art
    {
        Drawing()
        {
            System.out.println("Drawing");
        }
    }

    class Cartoon extends Drawing
    {
//        Cartoon()
//        {
////            System.out.println("Cartoon");
//        }
    }

    private static List<?> list = new ArrayList<>();

    public static void main(String[] args)
    {
        Cartoon cartoon = new Page106().new Cartoon();
    }

}
