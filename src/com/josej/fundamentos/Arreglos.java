package com.josej.fundamentos;

public class Arreglos
{
    static int a=10;
    static int[] num= new int [a];
    static int [] otrosNum = {0,1,2,3,4,5};

    public static void main (String[]argv)
    {
        num[0]=12;
        num[1]=10;
        System.out.println(num[2]);
        System.out.println(num[0]);

        int size = otrosNum.length;
        System.out.println(size);

    }
}
