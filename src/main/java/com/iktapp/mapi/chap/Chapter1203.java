package com.iktapp.mapi.chap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/11/30 17:08
 */
public class Chapter1203
{

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.add(6);
        System.out.println(list);
        List<Integer> listFromArray = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = new ArrayList<>();
        Integer[] ints = {1,3,5,7,9};
        Collections.addAll(list2,1,2,3,4,5,6,7);
        System.out.println(list2);
        list2.addAll(Arrays.asList(ints));
        list2.add(100);
        System.out.println(list2);
        System.out.println(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);
        list2.remove(Integer.valueOf(2));
        System.out.println(list2);

    }

}
