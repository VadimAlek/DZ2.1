public class Main {

    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
public static void main(String[] args){

    //task1
    //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
    //
    //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    //
    //в формате: «Сумма трат за месяц составила … рублей».
    int [] mass1 = generateRandomArray();
    int sum = 0;
    for (int item: mass1){
        sum += item;
        System.out.println("Сумма трат за месяц составила " +sum +" рублей.");
    }
    //task2
    //Следующая задача — найти минимальную и максимальную трату за день.
    // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
    int max = mass1[0];
    int min = mass1[0];
    for (int item: mass1
         ) {
        if (item>max)
        max = item;
        if (item<min)
        min = item;
        System.out.println("Минимальная сумма трат за день составила " +min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила "+max +" рублей.");
    }

    //task3
    //Нужно написать программу, которая посчитает среднее значение трат за месяц
    // (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
    // «Средняя сумма трат за месяц составила … рублей».
    int sum_average = 0;
    for (int item: mass1){
        sum_average+=item;}
    System.out.println("Средняя сумма трат за месяц составила " +sum_average/mass1.length);

    //task4
    //Данные с именами сотрудников хранятся в виде массива символов (char[]).
    //
    //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
    //
    //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //
    //В результате в консоль должно быть выведено "Ivanov Ivan".
    char[] name = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    for (int i = name.length - 1; i>=0; i--)
    System.out.print(name[i]);
    }
}
