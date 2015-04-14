package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> stringList = new ArrayList<String>();

        //Видимо, тест не предусматривает входных данных

        /*Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i < 6; i++){
        stringList.add(sc.nextLine());
        }/*/

        stringList.add("Lastik");
        stringList.add("Rio");
        stringList.add("May");
        stringList.add("Persik");
        stringList.add("Jessie");

        System.out.println(stringList.size());
        
        for(int i = 0; i < stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

    }
}
