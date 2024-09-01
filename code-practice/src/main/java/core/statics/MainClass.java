package core.statics;

import static core.statics.StaticExample.*;
//Fully Qualified package name.class name;

public class MainClass {

    public static void main(String[] args) {
        System.out.println(a);//1
        hello();//hello
        StaticExample staticExample= new StaticExample();
        System.out.println(a);//1
        staticExample.print();//2,Print

        System.out.println("-----------------------------------------------");

        StaticExample2 staticExample2 = new StaticExample2();
        a = 250;
        staticExample2.b = 500;

        StaticExample2 anotherStaticExample2 = new StaticExample2();
        a = 450;
        anotherStaticExample2.b = 1000;
//Inside Static block
        staticExample2.display(); //100,500.20
        System.out.println("-----------------------------------------------");
        anotherStaticExample2.display();//100,1000,20

    }

}
