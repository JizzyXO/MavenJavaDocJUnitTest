package org.example;

/**
 * Класс, представляющий данные, состоящие из массива строк и двумерного массива целых чисел
 */
public class AppData {
    private String[] header;
    private int[][] data;

    /**
     * Конструктор по умолчанию, компилятор сам создает такое, если удалить
     */
    public AppData() {
    }

    /**
     * Конструктор, инициализирующий объект AppData с заданными данными
     *
     * @param header Массив строк
     * @param data Двумерный массив целых чисел
     */
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    /**
     * Преобразует объект AppData в строку для вывода
     *
     * @return Строковое представление объекта AppData, включая заголовок и данные
     */
    @Override
    public String toString() {
        String stringData = "";
        for (String word : header)
            stringData += word + "\t";
        stringData += "\n";
        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[0].length; column++) {
                stringData += data[row][column] + "\t";
            }
            stringData += "\n";
        }
        return stringData;
    }

    /**
     * Получает данные
     *
     * @return Массив строк, представляющих данных
     */
    public String[] getHeader() {
        return header;
    }

    /**
     * Получает данные
     *
     * @return Двумерный массив целых чисел, представляющий данные
     */
    public int[][] getData() {
        return data;
    }
}

