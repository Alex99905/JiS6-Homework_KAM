//Генерация случайных чисел
//        1. Description
//        Описание:
//
//        Разработать программу, которая демонстрирует генерацию случайных чисел, а также различные действия над этими числами.
//
//        Функциональные требования:
//
//        1. Сгенерировать 3 случайных числа и вывести их на экран.
//        2. Посчитать сумму этих чисел и вывести результат на экран.
//
//        Нефункциональные требования:
//
//        1. Класс с демонстрацией должен называться "RandomGeneratorDemo".
//        2. Генерировать числа можно используя классы "Random" или "Math".
//
//        Результат:
//
//        Загрузить файл RandomGeneratorDemo.java

package io.github.Alex99905.RandomGen;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        int randomInt;

        for (int i = 0; i < 3; i++) {
            randomInt = r.nextInt(100);

            sum = sum + randomInt;
            System.out.println(randomInt);

        }
        System.out.println(sum);
    }


}
