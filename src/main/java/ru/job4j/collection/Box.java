package ru.job4j.collection;

public class Box {
    public static void num(Integer x) {
        System.out.println("Примитивный тип передан в параметр метода (где у параметра тип, соответствущий "
                + "классу-обёртке). Integer x = " + x);
    }

    public static void num(int x) {
        System.out.println("Выбран перегруженный метод с параметром того же типа. int. x = " + x);
    }

    public static void unpackNum(int x) {
        System.out.println("Класс-обертка передан в параметр метода (где у параметра тип примитывный и соответствует "
                + "классу-обёртке). int x = " + x);
    }

    public static void main(String[] args) {
        int a = 1;
        Integer b;
        b = a;
        System.out.println("Примитивный тип автоупакован в соответствующий примитивному типу класс-обертку."
                + " Integer b = " + b);
        int x = 2;
        num(x);
        Integer m = 3;
        int n = m;
        System.out.println("Распаковка объекта с типом класса-обёртки присваивается переменной соответствующего "
                + "примитивного типа. int n = " + n);
        Integer k = 5;
        Integer l = 6;
        System.out.println("Распаковка объекта/объектов с типом класса-обёртки присваивается переменной "
                + "соответствующего примитивного типа. int n = " + k * l);
        Integer g = 250;
        Integer h = 250;
        unpackNum(h);
        System.out.println("При сравнении распаковка объектов с типом класса-обёртки не выполняется к "
                + "примитивному типу. Сравниваются ссылки, поэтому не всегда будет true");
        System.out.println(g == h);
        Integer v = 127;
        Integer w = 127;
        System.out.println("Сравнение перемннх с одинаковыми значениями из пула Integer от -128 до 127 включительно, "
                + "будет возвращать true. В этом диапазоне разные ссылки всегда будут вести на элемент из кэша:");
        System.out.println(v == w);
    }
}
