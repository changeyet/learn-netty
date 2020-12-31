package com.iktapp.mapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@MapperScan("com.iktapp.mapi.dao")
public class MapiApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MapiApplication.class, args);

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
        for (;;)
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
