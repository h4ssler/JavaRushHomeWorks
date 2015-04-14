package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int left, top, width, height;
    
    public Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    
    public Rectangle(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = this.width;
        
    }
    
    public  Rectangle(Rectangle aRectangle){
        this.left = aRectangle.left;
        this.top = aRectangle.top;
        this.width = aRectangle.width;
        this.height = aRectangle.height;
    }
    
    public Rectangle(int height){
        this.left = 0;
        this.top = 0;
        this.height = height;
        this.width = this.height;
    }

}
