package com.iktapp.mapi.chap;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/10/14 14:04
 */
public class Chap7_14
{

    public static void main(String[] args)
    {
        int [] myArrays;
        myArrays = new int[10];
        System.out.println(Arrays.toString(myArrays));
        myArrays = new int[20];
        System.out.println(Arrays.toString(myArrays));
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.sort(Integer::compareTo);
        System.out.println(list.toString());
    }

}
