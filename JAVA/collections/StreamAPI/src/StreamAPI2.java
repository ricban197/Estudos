
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamAPI2 {
    public static void main(String[] args) {
        List<String> numeros =
                Arrays.asList("0","1","2","3","4","5","6","7","8","9","10");
       // System.out.println("imprimindo todos");
        //numeros.forEach(System.out::println);
        //System.out.println("pegue os 5 primeiros numeros e coloque dentro de um set");
        //numeros.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("Converta os strings em int");
        List<Integer> collect3 = numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collect3);
        System.out.println("pegue os pares maiores que dois e coloque em uma lista");
        List<Integer> collect2 = numeros.stream()
                .map(Integer::parseInt)
                .filter(i->i%2==0 && i>2)
                .collect(Collectors.toList());
        System.out.println(collect2);

        System.out.println("mostrrue a media dos numeors");
        numeros.stream().mapToInt(Integer::parseInt)
                .average()
                .ifPresent(value->System.out.println(value));
        System.out.println("removendo os impares");
        collect3.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2!=0)return true;
                else return false;
            }
        });
        System.out.println(collect3);

    }

}
