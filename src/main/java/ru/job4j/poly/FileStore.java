package ru.job4j.poly;

public class FileStore {
    private String path;

    public FileStore(String path) {
        this.path = path;
    }

    public void save(String data) {
        //Тут реализация хранения данных в файле
    }

    public String read() {
        // Тут чтение файла
        return null;
    }
}
