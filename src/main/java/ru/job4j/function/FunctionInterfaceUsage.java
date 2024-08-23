package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "New String For Interface Supplier";
        System.out.println(supplier.get());
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> setSupplier = () -> new HashSet<>(list);
        Set<String> strings = setSupplier.get();
        for (String string : strings) {
            System.out.println(string);
        }
        Supplier<String> consumerSupplier = () -> "New String For Interface Consumer";
        Consumer<String> consumer = (string) -> System.out.println(string);
        consumer.accept(consumerSupplier.get());
        Supplier<String> biConsumerSupplier = () -> "New String For Interface BiConsumer";
        BiConsumer<String, String> biConsumer = (first, second) -> System.out.println(first + second);
        biConsumer.accept(biConsumerSupplier.get(), " and Second String");
        Predicate<String> predicate = string -> string.isEmpty();
        System.out.println("Строка пустая: " + predicate.test(""));
        System.out.println("Строка пустая: " + predicate.test("test"));
        BiPredicate<String, Integer> condition = (string, number) -> string.contains(number.toString());
        System.out.println("Строка содержит подстроку: " + condition.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + condition.test("Name", 123));
        Function<String, Character> function = string -> string.charAt(2);
        System.out.println("Третий символ в строке: " + function.apply("first"));
        System.out.println("Третий символ в строке: " + function.apply("second"));
        BiFunction<String, Integer, String> biFunction = (string, number) -> string.concat(" ").concat(number.toString());
        System.out.println("Результат работы бифункции: " + biFunction.apply("Name", 123));
        System.out.println("Результат работы бифункции: " + biFunction.apply("String number", 12345));
        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("tset rof gnirtS")));
        BinaryOperator<StringBuilder> biBuilder = (first, second) -> first.append(" ").append(second);
        System.out.println(
                "Строка после объединения: " + biBuilder.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}
