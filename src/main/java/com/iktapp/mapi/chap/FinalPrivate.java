package com.iktapp.mapi.chap;

/**
 * @Description
 * @Author Qwx
 * @Date 2020/11/22 16:05
 */
public class FinalPrivate
{

    class A
    {
        A()
        {
            System.out.println("testAAAA");
        }
        private int k = printInit("kkkkkkkkkkkkkkk");
         int printInit(String s)
        {
            System.out.println(s);
            return 10;
        }
        private void f()
        {
            System.out.println("AAAA");
        }
    }

    class B extends A
    {
        private void f()
        {
            System.out.println("BBBBBB");
        }
    }

    class C extends B
    {
        public final void f()
        {
            System.out.println("CCCCCCC");
        }
    }

    public static void main(String[] args)
    {
        FinalPrivate finalPrivate = new FinalPrivate();
        C c = finalPrivate.new C();
        c.f();
        B b = c;
        b.f();
        A a = c;
        a.f();

    }

}
