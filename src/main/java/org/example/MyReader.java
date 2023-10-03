package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Абстрактный класс, который читает данные из CSV файла и преобразует их в объект класса AppData
 */
abstract public class MyReader {

    /**
     * Читает данные из CSV файла и возвращает их в виде объекта класса AppData
     *
     * @param pathFile Путь к CSV файлу, который нужно прочитать
     * @return Объект класса AppData, содержащий прочитанные данные
     */
    public static AppData readCsvFile(String pathFile) {
        ArrayList<String[]> stringData = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringData.add(line.split(";"));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return new AppData(stringData.get(0), getDataInt(stringData));
    }

    private static int[][] getDataInt(ArrayList<String[]> stringData) {
        stringData.remove(0);
        int[][] data = new int[stringData.size()][stringData.get(0).length];

        for (int row = 0; row < stringData.size(); row++) {
            for (int column = 0; column < stringData.get(0).length; column++) {
                data[row][column] = Integer.parseInt(stringData.get(row)[column]);
            }
        }
        return data;
    }
}

