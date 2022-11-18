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







    }
}