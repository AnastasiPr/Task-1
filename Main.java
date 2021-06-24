package com.company;

import java.util.Scanner; //подключение сканнера

public class Main {

    private static int Convert (int a){  //метод, который конвертирует минуты в секунды
        return a*30*24*60;
    }

    private static int Points (int a, int b){
        return a*2+b*3;
    }

    private static double FootballPoints (int a, int b, int c){ //static значит что метод принадлежит классу, и создаётся в момент загрузки класса и позволяет вызывать в контексте static
        return a*4+b*1.5+c*(-2);
    }

    private static boolean DivisibleByFive (int a){  //void значит, что метод ничего не возвращаеn
        return a%5==0;
    }

    private static boolean And (boolean a, boolean b){
        return a&&b;
    }

    private static int HowManyWalls (int a,int b,int c){
        int k=0;
        if (b*c>a){
            return 0;
        }else{
            while (a>=b*c){
                a-=b*c;
                k+=1;
            }
            return k;
        }
    }

    public static int Squared(int a) {
        return a*a;
    }

    private static boolean ProfitableGamble(double prob,int prize,int pay){
        return prob * prize > pay;
    }

    private static int Frames(int cadr, int min){
        return cadr*min*60;
    }

    private static int Mod(int a,int b){
        return a-(b*(a/b)); //целочисленное деление
    }

        public static void main(String[] args) {  //массив аргументов, с которыми запускается программа
            Scanner scan = new Scanner (System.in); //запрос на ввод пользователем, данные запоминаются в переменную scan

            //1

            int sec=Convert(scan.nextInt());  //перевод считанной переменной в тип Int и вызов метода Convert
            System.out.println(sec); //Вывод результата

            //2

            int dva=scan.nextInt();
            int tri=scan.nextInt();
            int res=Points(dva,tri);
            System.out.println(res);

            //3

            System.out.println(FootballPoints(scan.nextInt(),scan.nextInt(),scan.nextInt()));

            //4

            int e=scan.nextInt();
            System.out.println(DivisibleByFive(e));

            //5

            System.out.println(And(scan.nextBoolean(),scan.nextBoolean()));

            //6

            int walls=HowManyWalls(scan.nextInt(),scan.nextInt(),scan.nextInt());
            System.out.println(walls);

            //7

            int sqr=Squared(scan.nextInt());
            System.out.println(sqr);

            //8

            System.out.println(ProfitableGamble(scan.nextDouble(),scan.nextInt(),scan.nextInt()));

            //9

            int fp=Frames(scan.nextInt(),scan.nextInt());
            System.out.println(fp);

            //10

            System.out.println(Mod(scan.nextInt(),scan.nextInt()));
        }


}
