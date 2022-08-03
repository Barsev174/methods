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

        // Задача 6
        System.out.println("Задача 6");
        int[] accountantsBook = generateRandomArray();
        System.out.print("Траты по дням: ");
        printArray(accountantsBook);
        System.out.println("Сумма трат за месяц составила " + theSumOfAllExpensesForTheMonth(accountantsBook) + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила " + calculationOfAverageSpendingPerDay(theSumOfAllExpensesForTheMonth(accountantsBook), accountantsBook.length) + " рублей.");
    }

    public static void definesALeapYear(int a) {
        boolean visokosniy = ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0));
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


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void printArray(int[] accountantsBook) {
        for (int i = 0; i < accountantsBook.length; i++) {
            if (i == accountantsBook.length - 1) {
                System.out.println(accountantsBook[i]);
            } else {
                System.out.print(accountantsBook[i] + ", ");
            }
        }
    }

    public static int theSumOfAllExpensesForTheMonth(int[] accountantsBook) {
        int sum = accountantsBook[0];
        for (int i = 0; i < accountantsBook.length; i++) {
            sum = sum + accountantsBook[i];
        }
        return sum;
    }
    public static double calculationOfAverageSpendingPerDay(int sum, int quantity) {
        return (double) sum / quantity;
    }
}
