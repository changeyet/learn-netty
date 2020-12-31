package com.iktapp.mapi.chap;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/11/11 16:19
 */
public class Elvis
{

    private static final Elvis INSTANCE = new Elvis();

    private Elvis(){}

    public static Elvis getInstance()
    {
        return INSTANCE;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 20; i++)
        {
            Thread thread = new Thread(()->
            {
                Elvis elvis = getInstance();
                System.out.println(elvis);
            },"hello"+i);
            thread.start();
        }
    }

}
