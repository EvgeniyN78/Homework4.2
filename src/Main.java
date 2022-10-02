public class Main {
    public static void main(String[] args) {

        // Задание 1.
        System.out.println("Задание 1");

        int clientOS = 0;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке:");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке:");
                break;
            default:
                System.out.println("Приложения для другой OS не предусмотрено.");
        }
        System.out.println(" ");

        // Задание 2.
        System.out.println("Задание 2");

        int clientDeviceYear = 2012;
        clientOS = 0;
        if ((clientOS == 0) && (clientDeviceYear > 2014)){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((clientOS == 0) && (clientDeviceYear < 2015)){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        } else if ((clientOS == 1) && (clientDeviceYear < 2015)){
            System.out.println("Установите облегченную версию приложения для Android по ссылке:");
        } else if ((clientOS == 1) && (clientDeviceYear > 2014)){
            System.out.println("Установите версию приложения для Android по ссылке:");
        }
        System.out.println(" ");

        // Задание 3.
        System.out.println("Задание 3");

        int year = 2012;

        if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println(" ");

        // Задание 4.
        System.out.println("Задание 4");

        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        }
        System.out.println(" ");

        // Задание 5.
        System.out.println("Задание 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        System.out.println(" ");

        // Задание 6.
        System.out.println("Задание 6");

        int age = 19;
        int salary = 58_000;

        if (age > 22 && salary >= 80000) {
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + salary * 150 / 100 * 3 + " рублей».");
        } else if (age > 22 && salary >= 50000) {
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + salary * 120 / 100 * 3 + " рублей».");
        } else if (age > 22 && salary < 50000) {
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 + " рублей».");
        }else if (age < 23 && salary >= 80000) {
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + salary * 150 / 100 * 2 + " рублей».");
        } else if (age < 23 && salary >= 50000) {
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + salary * 120 / 100 * 2 + " рублей».");
        }else if (age < 23 && salary < 50000) {
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 + " рублей».");
        }
        System.out.println(" ");

        // Задание 7.
        System.out.println("Задание 7");

        age = 25;
        salary = 60_000;
        int maxPay = salary / 2;
        int wantedSum = 330_000;
        int baseRate = 10;
        boolean criterion1 = (age < 23 && salary < 80_000);
        boolean criterion2 = (age < 23 && salary > 79_999);
        boolean criterion3 = (age < 30 && salary < 80_000);
        boolean criterion4 = (age < 30 && salary > 79_999);
        boolean criterion5 = (age > 29 && salary < 80_000);
        boolean criterion6 = (age > 29 && salary > 79_999);
        double calculationPayCriterion1 = wantedSum * (baseRate + 1 + 100) / 100 / 12;
        double calculationPayCriterion2 = wantedSum * (baseRate + 0.3 + 100) / 100 / 12;
        double calculationPayCriterion3 = wantedSum * (baseRate + 0.5 + 100) / 100 / 12;
        double calculationPayCriterion4 = wantedSum * (baseRate - 0.2 + 100) / 100 / 12;
        double calculationPayCriterion5 = wantedSum * (baseRate + 100) / 100 / 12;
        double calculationPayCriterion6 = wantedSum * (baseRate - 0.7 + 100) / 100 / 12;

        if (criterion1 && (calculationPayCriterion1 < maxPay)){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion1 + " рублей. Одобрено.");
        } else if (criterion1 && (calculationPayCriterion1 > maxPay)) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion1 + " рублей. Отказано.");
        } else if (criterion2 && (calculationPayCriterion2 < maxPay)){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion2 + " рублей. Одобрено.");
        } else if (criterion2 && (calculationPayCriterion2 > maxPay)) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion2 + " рублей. Отказано.");
        } else if (criterion3 && (calculationPayCriterion3 < maxPay)) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion3 + " рублей. Одобрено.");
        } else if (criterion3 && (calculationPayCriterion3 > maxPay)) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion3 + " рублей. Отказано.");
        } else if (criterion4 && (calculationPayCriterion4 < maxPay)) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion4 + " рублей. Одобрено.");
        } else if ((criterion4 && calculationPayCriterion4 > maxPay)) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion4 + " рублей. Отказано.");
        } else if (criterion5 && (calculationPayCriterion5 < maxPay)){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion5 + " рублей. Одобрено.");
        } else if (criterion5 && (calculationPayCriterion5 > maxPay)) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion5 + " рублей. Отказано.");
        } else if (criterion6 && (calculationPayCriterion6 < maxPay)) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion6 + " рублей. Одобрено.");
        } else if (criterion6 && (calculationPayCriterion6 > maxPay)) {
                System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. " +
                        "Платеж по кредиту " + calculationPayCriterion6 + " рублей. Отказано.");
        }
    }
}