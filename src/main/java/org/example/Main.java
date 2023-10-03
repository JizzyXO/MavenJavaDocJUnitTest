package org.example;

/**
 * Главный класс, который читает и делает запись в файл CSV
 */
public class Main {

    /**
     * Вход в программу
     */
    public static void main(String[] args) {
        // Сохранение данных в CSV-файл
        MyWriter.saveInCsvFile(new String[]{"Value 1", "Value 2", "Value 3"}, new int[][]{{100, 200, 123}, {300, 400, 500}});

        // Чтение данных из CSV-файла и вывод на экран
        AppData dataOne = MyReader.readCsvFile("file.csv");
        System.out.println(dataOne);

        // Создание нового объекта AppData и сохранение его в CSV-файл
        AppData dataTwo = new AppData(new String[]{"qwe", "qwe"}, new int[][]{{1, 2}, {3, 4}});
        MyWriter.saveInCsvFile(dataTwo);

        // Чтение данных из CSV-файла после сохранения и вывод на экран
        System.out.println("\n" + MyReader.readCsvFile("file.csv"));
    }
}
