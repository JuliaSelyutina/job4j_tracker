package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        String value;
        HashMap<String, String> map = new HashMap<>();
        map.put("julias@yandex.ru", "Julia S S");
        map.put("julias@yandex.ru", "Julia S Sergeevna");
        map.put("js12345@yandex.ru", "Julia S S");
        map.put("js3456@yandex.ru", "Julia S S");
        map.put("js3456@yandex.ru", "J S S");
        for (String key : map.keySet()) {
            value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
