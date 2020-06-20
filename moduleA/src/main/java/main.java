import funcs.Calc;
import funcs.MyAssert;
import funcs.Printer;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Printer printer = m -> System.out.println(m);
        printer.print("asdasd");
        int a = 5;
        int b = 2;
        Calc s = (x, y) ->  x * y;
        int result = s.calculate(a, b);
        System.out.println(result);

        Function<String, String> quote = string -> "'" + string + "'";

        System.out.println(quote.apply("hi"));

        BiFunction<Integer, Integer, Integer> summat = Integer::max;
        System.out.println(summat.apply(110, 2).toString());


        Function<Integer, String> function = integer -> "result is: " + integer * integer;
        String res = function.apply(4);
        System.out.println(res);

        Function<String, String> toLowerCaseMy = String::toLowerCase;
        System.out.println(toLowerCaseMy.apply("ASDASDASDsdadasdaAAAAsadasdasd"));

        MyAssert myAssert = m -> m.equals("Sebek");
        System.out.println(myAssert.myAssert("Sebek"));

        MyAssert ma = String::isEmpty;
        ma.myAssert("asdad");

        HashMap<String, Printer> map = new HashMap<>();
        map.put("one", System.out::println);
        map.get("one").print("lol");

        List<String> dogs = Arrays.asList("Bobik", "Franky");
        List<String> filtered = dogs.stream()
                .filter(d -> d.startsWith("F"))
                .collect(Collectors.toList());
        System.out.println(filtered);


        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 24);
        ages.put("Samuel", 30);

        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));


    }
}
