package myWorks.test;

/**
 * Created by IntelliJ IDEA.
 * User: Mario
 * Date: 14.04.15
 * Time: 21:01
 * To change this template use File | Settings | File Templates.
 */
/* Минимум четырех чисел
        Написать функцию, которая вычисляет минимум из четырёх чисел.
        Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
        Подсказка:
        Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
        */
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
        int q=min(a,b);
        int w;
        if (c<d)
            w=c;
        else
            w=d;
        if (w>q)
            w=q;
//Напишите тут ваш код
       return q;
    }

    public static int min(int a, int b)
    {

        int q;
        if (a<b)
            q=a;
        else
            q=b;

        return q;
//Напишите тут ваш код

    }

    public static void main(String[] args) throws Exception
    {
        if (min(5, 8, 6, 6) != 5)
        {
            System.out.println("1) Неправильно для a"); //вывод=5
        }
        if (min(-1, -3, -2, -5) != -5)
        {
            System.out.println("2) Неправильно для отрицательных чисел"); //вывод=-5
        }
        if (min(10, 5, 20, 42) != 5)
        {
            System.out.println("3) Неправильно для b"); //вывод=5
        }
        if (min(5, 5, 5, 5) != 5)
        {
            System.out.println("4) Неправильно для всех равных чисел"); //вывод=5
        }
        if (min(8, 7, 5, 6) != 5)
        {
            System.out.println("5) Неправильно для c"); //вывод=5
        }
        if (min(8, 7, 5, 5) != 5)
        {
            System.out.println("6) Неправильно для равных c и d"); //вывод=5
        }
        if (min(5, 5, 6, 6) != 5)
        {
            System.out.println("7) Неправильно для равных двух пар"); //вывод=5
        }
    }
}
