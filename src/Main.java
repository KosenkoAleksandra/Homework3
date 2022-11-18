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
        age = 15;
        System.out.println("Задача 1");
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

// Задача 2
        System.out.println("Задача 2");
        if (age <= 7 && age < 18){
            System.out.println("Человек ходит в школу.");
        }
        else  if (age >= 18 && age< 24) {
            System.out.println("Человек закончил школу и может отправляться в универрситет.");
        } else {
            System.out.println("Человек окончил университет и пора искать первую работу.");
        }

// Задача 3
        System.out.println("Задача 3");
        if (passenger < seat) {
            System.out.println("В вагоне есть свободные сидячие места.");
        }
        else if (passenger >= seat && passenger < trainCapacity ) {
            System.out.println("В вагоне остались только стоячие места.");
        } else {
            System.out.println("Свободных мест нет.");
        }

//ДЗ 3
        System.out.println("Домашнее задание 3");
// Задача 1
        System.out.println("Задача 1");
        age = 17;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " то он еще никуда не ходит.");
        }
        if (age >= 2)
            if (age <= 6) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
            }
        if (age >= 7)
            if (age <= 18) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в  школу.");
            }
        if (age > 18)
            if (age <= 24) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет.");
            } else  {
                System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");
            }
// Задача 2
        System.out.println("Задача 2"); {
            age = 4;
            if (age < 5)
                System.out.println("Запрещено кататься на аттракционе.");
            else if (age >= 5 && age < 14)
                System.out.println("Посещение аттракциона возможно только в сопровождении взрослого!");
            else
                System.out.println("Доступно посещение аттракциона без сопровождения взрослого!");
        }

// Задача 3
        System.out.println("Задача 3"); {
            int one = 1;
            int two = 2;
            int free = 3;
            if(one >= two && one >= free)
                System.out.println(one + " наибольшее число.");
            else if (two >= one && two >= free)
                System.out.println(two + " наибольшее число.");
            else
                System.out.println(free + " наибольшее число.");
        }










    }
}