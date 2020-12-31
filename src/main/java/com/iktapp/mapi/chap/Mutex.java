package com.iktapp.mapi.chap;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.currentThread;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/11/4 17:13
 */
public class Mutex
{

    private final static Object MUTEX = new Object();

    public void accessResource()
    {
        synchronized (MUTEX)
        {
            try
            {
                TimeUnit.SECONDS.sleep(20);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
//        final Mutex mutex = new Mutex();
//        for (int i = 0; i < 5; i++)
//        {
//            new Thread(mutex::accessResource).start();
//        }
        currentThread();
        String s  = "//192.46.33.103:81/oss/oss/2020-11-05/3777906261754028.png";
        String regex = "//\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}:\\d{1,5}";
        s = s.replaceAll(regex, "");
        System.out.println(s);
    }


}
