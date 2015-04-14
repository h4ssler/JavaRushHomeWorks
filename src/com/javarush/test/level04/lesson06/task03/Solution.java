package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.print(descend(a, b, c));
    }
    
    public static String descend(int a, int b, int c){
        String result = "";
        
        if (a <= b && b <= c)
            result = c + " " + b + " " + a;

        if(a <= b && b >= c && a <= c)
            result = b + " " + c + " " + a;

        if(a >= b && b >= c)
            result = a + " " + b + " " + c;

        if(a >= b && b <= c && a <= c)
            result = c + " " + a + " " + b;

        if(a <= b && b >= c && a >= c)
            result = b + " " + a + " " + c;

        if(a >= b && b <= c && a >= c)
            result = a + " " + c + " " + b;


        return result;
    }

}
