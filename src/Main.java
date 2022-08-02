import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 2021;
        printVisocosniy(year);

        //Задача 2
        System.out.println("Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2022;
        printMessage(clientDeviceYear, clientOs);

        // Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + needDat(deliveryDistance));
    }

    public static void printVisocosniy(int a) {
        boolean Visokosniy = ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0));
        if (Visokosniy) {
            System.out.println(a + " год является високосным");
        } else
            System.out.println(a + " год не является високосным");
    }

    public static void printMessage(int clientDeviceYear, int os) {
        int currentYear = LocalDate.now().getYear();
        boolean yearTelefon = clientDeviceYear >= currentYear;
        if (os == 0) {
            if (yearTelefon) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (yearTelefon) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static int needDat(int deliveryDistance) {
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
