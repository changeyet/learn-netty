package com.iktapp.mapi.chap;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/11/24 21:34
 */
public class NoteBook extends Book
{
    private int rate = 1;

    NoteBook(int r)
    {
        rate = r;
        System.out.println("notebooke"+rate);
    }

    @Override
    void draw()
    {
        System.out.println("notebook draw" + rate);
    }

    public static void main(String[] args)
    {
        new NoteBook(5);
    }
}
