package com.iktapp.mapi.chap;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/11/3 16:26
 */
public class TicketWindow extends Thread
{

    private final String name;

    private final int MAX_NUM = 500;

    private static int index = 1;

    private TicketWindow(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        while (index <= MAX_NUM)
        {
            System.out.println("柜台"+ name + "当前号码是" + index++);
        }
    }

    public static void main(String[] args)
    {
        TicketWindow ticketWindow1 = new TicketWindow("一号出号机");
        TicketWindow ticketWindow2 = new TicketWindow("二号出号机");
        TicketWindow ticketWindow3 = new TicketWindow("三号出号机");
        TicketWindow ticketWindow4 = new TicketWindow("四号出号机");
        ticketWindow1.start();
        ticketWindow2.start();
        ticketWindow3.start();
        ticketWindow4.start();
    }




}
