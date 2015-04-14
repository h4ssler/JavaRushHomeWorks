package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    public static int readInt() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

    public static double readDouble() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();

    }

    public static void readLn() throws Exception
    {
        Scanner sc = new Scanner(System.in);

        while(sc.nextLine().equals("")){

        }

    }
}
