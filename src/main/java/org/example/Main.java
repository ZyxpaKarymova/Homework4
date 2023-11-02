package org.example;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int age = 17;
        if (age > 18) {System.out.println("Если возраст человека равен " + age + "то он совершеннолетний");}
        else
        {System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать."); }

        //Задача 2
        System.out.println("Задача 2");
        int outdoorTemp = 36;
        if (outdoorTemp < 5) {System.out.println("На улице холодно " + outdoorTemp + " градусов, нужно надеть  шапку.");}
        else
        {System.out.println("Сегодня тепло " + outdoorTemp + " градусов,, можно идти без шапки."); }

        // Задача 3
        System.out.println("Задача 3");
        int speed = 90;
        if (speed <= 60) {System.out.println("Если скорость " + speed + " , можно ездить спокойно.");}
        else
        {System.out.println("Если скорость " + speed + ", придется заплатить штраф.");}

        //Задача 4
        System.out.println("Задача 4");
        int personAge = 5;
        if ((personAge>2) && (personAge<=6))  {System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");}
        if ((personAge)>=7 && (personAge<=17)) {System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");}
        if ((personAge)>=18 && (personAge<=24)) {System.out.println("Если возраст человека равен " + personAge + ", то его место в университете.");}
        if (personAge>24) {System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу.");}

        //Задача 5
        System.out.println("Задача 5");
        int childAge = 14;
        if (childAge < 5) {System.out.println("Если возраст ребенка равен " + childAge + ", то ему" + " нельзя кататься на аттракционе.");}
        if ((childAge>=5) && (childAge <14))  {System.out.println("Если возраст ребенка равен " + childAge + ", то ему" + " можно кататься на аттракционе в сопровождении.");}
        if (childAge>=14)  {System.out.println("Если возраст ребенка равен " + childAge + ", то ему" + " можно кататься без сопровождения взрослого.");}


        //Задача 6
        System.out.println("Задача 6");
        int places = 102; // Вместимость одного вагона поезда — 102 человека
        int sittingPlace = 60; //Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        int standingPlace = places - sittingPlace;
        int sittingPlaceOccupied = 6; //0-60
        int standingPlaceOccupied = 32; //0-42
        int sittingPlaceLeft = sittingPlace - sittingPlaceOccupied;
        int standingPlaceLeft = standingPlace - standingPlaceOccupied;
        if ((sittingPlaceLeft == 0) && (standingPlaceLeft == 0 )) {System.out.println("Вагон уже полностью забит.");}
        else {System.out.println("В вагоне свободно: " + sittingPlaceLeft + " сидячих мест и " + standingPlaceLeft + " стоячих мест.");}

        //Задача 7
        System.out.println("Задача 7");
        int one = 177;
        int two = 88;
        int three = 7;
        // NOTE в условиях нет варианта, когда два числа равны друг другу ;)
        System.out.println("Даны 3 числа: " + one + ", "+ two + ", " + three);
        if ((one > two)&&(one > three)) {System.out.println("Наибольшее из них первое " + one); }
        if ((two > one)&&(two > three)) {System.out.println("Наибольшее из них второе " + two); }
        if ((three > two)&&(three > one)) {System.out.println("Наибольшее из них третье " + three); }
    }
}




