package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    static String name1;
    static String name2;
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        name1 = sc.nextLine();
        name2 = sc.nextLine();
        
        if(name1.length() == name2.length()){
            if (name1.equals(name2)){
                System.out.print("Имена идентичны");
            }else{
                System.out.print("Длины имен равны");
            }
        }

    }
}
