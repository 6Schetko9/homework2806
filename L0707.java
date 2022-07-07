package L0707;  // Щетко А.А. J2822
import java.util.Scanner;
public class L0707 {
    public static void main(String[] args) {

        //If1. Дано целое число. Если оно является положительным, то прибавить к нему 1;
        // в противном случае не изменять его. Вывести полученное число.
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0) {
            a = a + 1; //a++ либо ++ a    //a-- либо --a
        }
        System.out.println(a);*/
//If2. Дано целое число. Если оно является положительным, то прибавить к
//нему 1; в противном случае вычесть из него 2. Вывести полученное число.

     /*   Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0) {
            a=a+1;
        }
        else {
            a=a-2;}  // a-=2
        System.out.println(a);*/
        //If3. Дано целое число. Если оно является положительным, то прибавить к
        //нему 1; если отрицательным, то вычесть из него 2; если нулевым, то
        //заменить его на 10. Вывести полученное число.

      /*  Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0){
            a=a+1;
        }
        else{
            if(a<0){
                a=a-2;
            }
            else {a=10;
            }
                   }
        System.out.println(a);*/

       // If4◦ Даны три целых числа. Найти количество положительных чисел в исходном наборе.
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a>0 ){
            res =res+1;}
            if (b>0 ){
                res =res+1;}
            if (c>0 ){
                res =res+1;}
            System.out.println(res);*/



       //If5. Даны три целых числа. Найти количество положительных и количество отрицательных чисел в исходном наборе
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res1 = 0;
        if (a>0 ){
            res1 =res1+1;}
        if (b>0 ){
            res1 =res1+1;}
        if (c>0 ){
            res1 =res1+1;}
        int res2 = 0;
        if (a<0 ){
            res2 =res2+1;}
        if (b<0 ){
            res2 =res2+1;}
        if (c<0 ){
            res2 =res2+1;}
        System.out.println(res1);
        System.out.println(res2);*/
        //If6◦. Даны два числа. Вывести большее из них.
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int res=0;
        if (a>b){
            res=a;}
        else {if (a<b){res=b;
        }
        };
        System.out.println(res);*/

       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a>b){System.out.println(a);}
        else {System.out.println(b);}*/

       //If7. Даны два числа. Вывести порядковый номер меньшего из них.
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int res=0;
        if (a>b){
            res=2;}
        else {if (a<b){res=1;
        }
        };
        System.out.println(res);*/

       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a>b){
            System.out.println(2);}
        else {if (a<b){System.out.println(1);
        }
        };*/
//If8◦ Даны два числа. Вывести вначале большее, а затем меньшее из них.

        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a>b){
            System.out.println(a&&b)};
        else {if (a<b)
            System.out.println(b&&a)}};*/
        // If9. Даны две переменные вещественного типа: A, B. Перераспределить значения данных переменных так, чтобы в A оказалось меньшее из значений,
       //  а в B — большее. Вывести новые значения переменных A и B.

       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(b<a) {
            int c = a;
            a = b;
            b = c;
        }
        System.out.println(a + " "+b);*/

       //If11. Даны две переменные целого типа: A и B. Если их значения не равны, то
        //присвоить каждой переменной большее из этих значений, а если равны,
        //то присвоить переменным нулевые значения. Вывести новые значения
        //переменных A и B.

     /*   Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a!=b){
            if (a > b) {
                b=a;
            }
            else{
                a=b;
            }
        }
        else {
            a=0;
            b=0;
        }

        System.out.println(a+ " "+b);*/

       // If12◦ Даны три числа. Найти наименьшее из них.
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a<b && a<c) res=a;
        else
            if (b<a && b<c) res=b;
            else
                if (c<a && c<b) res=c;


        System.out.println("наименьшее из 3-х чисел: " + res);*/

      //  If15. Даны три числа. Найти сумму двух наибольших из них.
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a<b && a<c) res=b+c;
             else if (b<a && b<c) res=a+c;
             else if (c<a && c<b) res=a+b;
        System.out.println(res);*/

       //If18. Даны три целых числа, одно из которых отлично от двух других, равных между собой. Определить порядковый номер числа, отличного от
        //остальных.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a==b) res=3;
        else if (a==c) res=2;
        else if (b==c) res=1;
        System.out.println(res);


    }

    }

