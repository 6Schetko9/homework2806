package com.company;

public class Main {

    public static void main(String[] args) {
	/*//Begin1.Дана  сторона а
        // ввод или присвоение исходных данный
        int a = 5;
        // вычисление результата
        int P = 4 * a;
        //вывод результата
        System.out.println(P);
    }
}
*/


// begin 2.  дана а найти площадь
/*        int a = 5;
// вычислить S
        int S = a * a;
        system.out.println("У квадрата со стророной " + a + " площадь " + S);

    }
}

        */

// Begin4. дан диаметр d.Найти ее длинну L= pi*d/
//пи  =3.14
      /*  int d = 10;
        final double pi = 3.14;
        double L = pi * d;
        System.out.println(" У круга с диаметром " + d + " длина окружности " + L);
        */

// Begim5. Дана длина ребра куба a. Найти объем куба V = a^3 и S=6*a^2
/*int a = 10;
// Вычислить V
int V = a*a*a;
// Вычислить S
int S = 6*a*a;
// вывести S
System.out.println("У куба с ребром " +V);
System.out.println ("Площ:"+S);
*/
/*int a=2;
int b=3;
int c= 4;
int V= a*b*c;
int S= 2*(a*b+b*c+c*a);
        System.out.println("Площадь" +S);
        System.out.println("Объем" + V);
        */


        //Begin8
        /*int a=3;
    int b=4;
        int d=2;
    double c = (a+b)/d;
           System.out.println("вывод" +c);
           */
// Begin9 Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения:
//√a·b.
       /* double a= 3.45;
        double b = 7.2;
        double g_avg = Math.sqrt (a*b);
        System.out.println(g_avg);



*/
        //Begin 10 Даны два ненулевых числа. Найти сумму, разность, произведение и
        //частное их квадратов.
       /* int a=25;
        int b=45;
        int s=(a*a)+(b*b);
        int r= (a*a)-(b*b);
        int p= (a*a)*(b*b);
        double o= (a*a)/(double)(b*b);
        System.out.println("сумма"+s);
        System.out.println("разность"+r);
        System.out.println("произведение"+p);
        System.out.println("частное"+o);
               */
        /*int a=-5;
        int b=24;
        int s=(a+b);
        int r= a-b;
        int p= a*b;
        double o= a/(double)b;
        System.out.println(Math.abs(s));
        System.out.println(Math.abs(r));
        System.out.println(Math.abs(p));
        System.out.println(Math.abs(o));
        */
        /*int a=-5;
        int b=24;
        a =Math.abs(a);
        b =Math.abs(b);
        double s=(a+b);
        System.out.println(Math.abs(s));
        s= a-b;
        System.out.println(Math.abs(s));
       s= a*b;
        System.out.println("умн" + Math.abs(s));
        s= a/(double)b;
        System.out.println("деление" + Math.abs(s));
        */
        //Begin22. Поменять местами содержимое переменных A и B и вывести новые
       // значения A и B.
       /* int a=3;
        int b=10;
        int c = a;
         a = b;
        b = c;
        System.out.println("a="+ a +"b="+b);
*/
        // Begin12. Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:
       // c =√ a^2 + b^2, P = a + b + c
       /* double a = 4;
        double b = 7;
        double g_avg = Math.sqrt (a*a)+(b+b);
        double c= g_avg;
        double P = a+ b + c;
        System.out.println(c);
        System.out.println(P);

        */

       //Begin13◦
        //. Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
        //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний
        //радиус которого равен R1, а внутренний радиус равен R2:
        //S1 = π·(R1)
        //2
        //, S2 = π·(R2)
        //2
        //, S3 = S1 − S2.
        double R1=10;
        double R2=5;
        final double pi = 3.14;
        double s1=pi *R1;
        double s2=pi *R2;
        System.out.println(s1);
        System.out.println(s2);
        double s3=s1-s2;
        System.out.println(s3);
        }
    }