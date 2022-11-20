public class Main {
    public static void main(String[] args) {

        //Условный оператор
        //ДЗ 1
        System.out.println("Домашнее задание 1");
        // Задача 1
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

        // Задача 2
        System.out.println("Задача 2");
        if (age >= 7 && age < 18) {
            System.out.println("Человек ходит в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может отправляться в универрситет.");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и пора искать первую работу.");
        }

        // Задача 3
        System.out.println("Задача 3");
        int trainCapacity = 102;
        int seat = 60;
        int standingPlace = trainCapacity - seat;
        int passenger = 105;
        if (passenger < seat) {
            System.out.println("В вагоне есть свободные сидячие места.");
        }
        if (passenger >= seat && passenger < trainCapacity) {
            System.out.println("В вагоне остались только стоячие места.");
        }
        if (passenger > trainCapacity) {
            System.out.println("Свободных мест нет.");
        }
        //ДЗ 2
        System.out.println("Домашнее задание 2");
// Задача 1
        System.out.println("Задача 1");
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

// Задача 2
        System.out.println("Задача 2");
        if (age >= 7 && age < 18) {
            System.out.println("Человек ходит в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может отправляться в универрситет.");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и пора искать первую работу.");
        }

// Задача 3
        System.out.println("Задача 3");
        if (passenger < seat) {
            System.out.println("В вагоне есть свободные сидячие места.");
        } else if (passenger >= seat && passenger < trainCapacity) {
            System.out.println("В вагоне остались только стоячие места.");
        } else {
            System.out.println("Свободных мест нет.");
        }

//ДЗ 3
        System.out.println("Домашнее задание 3");
// Задача 1
        System.out.println("Задача 1");
        age = 32;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " то он еще никуда не ходит.");
        }
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в  школу.");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");
        }
// Задача 2
        System.out.println("Задача 2");
        {
            age = 13;
            if (age < 5)
                System.out.println("Запрещено кататься на аттракционе.");
            else if (age < 14)
                System.out.println("Посещение аттракциона возможно только в сопровождении взрослого!");
            else
                System.out.println("Доступно посещение аттракциона без сопровождения взрослого!");
        }

// Задача 3
        System.out.println("Задача 3");
        {
            int one = 111;
            int two = 7;
            int three = 5;
            if (one >= two && one >= three)
                System.out.println(one + " наибольшее число.");
            else if (two >= one && two >= three)
                System.out.println(two + " наибольшее число.");
            else
                System.out.println(three + " наибольшее число.");
        }

// Условный оператор 2
        System.out.println("Условный оператор 2");
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
// Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        clientOS = 1;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
    }
        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        deliveryDays += (deliveryDistance + 20)/40;
        if (deliveryDistance > 20){
            System.out.println("Потребуется дней: " + deliveryDays);
       } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }


        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
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
    }
}