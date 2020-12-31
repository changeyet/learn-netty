package com.iktapp.mapi.chap;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/10/14 14:04
 */
public class Chap7_13
{

    public static void main(String[] args)
    {
        Thread thread = new Thread(Chap7_13::playBall);
        thread.start();
        try
        {
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        thread.start();
    }

    private static void enjoyMusic()
    {
        for (; ; )
        {
            System.out.println("奏乐");
            sleep(3);
        }
    }

    private static void playBall()
    {
        for (int i = 0; i < 1; i++)
        {
            System.out.println("打球");
            sleep(3);
        }
    }


    private static void sleep(int seconds)
    {
        try
        {
            TimeUnit.SECONDS.sleep(seconds);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
