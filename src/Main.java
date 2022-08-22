public class Main {
    public static void main(String[] args) {
        System.out.println("Hello home work!");
        System.out.println("Задание №1");
        int clientOS = 0;
        if ( clientOS == 1 ) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание №2");
        int clientOS1 = 1;
       int  clientDeviceYear = 2010 ;
        if ( clientOS1 == 1 ) { if (clientDeviceYear > 2015)
            System.out.println("Установите версию приложения для IOS по ссылке");
            else  System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        if (clientOS1 == 0) {  if (clientDeviceYear > 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
        else  System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Задание №3");
int  year = 2021;
if (year %100==0 && year %400==0)
    System.out.println(year +" год является високосным");
else if (year %4==0 && year %100>0)
    System.out.println(year +" год является високосным");
else if (year %100==0)
    System.out.println(year +" год не является високосным");
else
    System.out.println(year +" год не является високосным");

        System.out.println("Задание №4");
    int deliveryDistance = 95;
    if ( deliveryDistance < 20 ){
        System.out.println("Потребуется дней: 1 день");}
    if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2 день");}
    if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется дней: 3 день");}

        System.out.println("Задание №5");
int monthNumber = 11;
        if ( monthNumber <= 12 ){
            if (monthNumber >= 2 && monthNumber <= 4)
            System.out.println("принадлежит к сезону весна" );
            if (monthNumber >= 5 && monthNumber <= 7)
                System.out.println("принадлежит к сезону лето" );
            if (monthNumber >= 8 && monthNumber <= 10)
                System.out.println("принадлежит к сезону осень" );
            if (monthNumber == 1 || monthNumber <= 12)
                System.out.println("принадлежит к сезону зима" );
        }
     else    System.out.println("В году нет месяца " +monthNumber);


        System.out.println("Самая не понятная задача №3 с знаком '%' урок почти не был проведен");








    }
}
