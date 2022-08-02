import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 2021;
        definesALeapYear(year);

        //Задача 2
        System.out.println("Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2022;
        defineTheOsAndPrintTheMessage(clientDeviceYear, clientOs);

        // Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + calculateTheDeliveryDate(deliveryDistance));
    }

    public static void definesALeapYear(int a) {
        boolean visokosniy = ((a % 4 == 0) && (a % 100 !=  0) || (a % 400 == 0));
        if (visokosniy) {
            System.out.println(a + " год является високосным");
        } else
            System.out.println(a + " год не является високосным");
    }

    public static void defineTheOsAndPrintTheMessage(int clientDeviceYear, int os) {
        int currentYear = LocalDate.now().getYear();
        boolean yearTelephone = clientDeviceYear >= currentYear;
        if (os == 0) {
            if (yearTelephone) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (yearTelephone) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static int calculateTheDeliveryDate(int deliveryDistance) {
        int dayOfDelivery = 1;
        if (deliveryDistance > 20) {
            dayOfDelivery++;
        }
        if (deliveryDistance > 60) {
            dayOfDelivery++;
        }
        return dayOfDelivery;
    }
}
