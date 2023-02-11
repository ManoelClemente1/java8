import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrdenaString {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();

        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");


        //Collections.sort(palavras,comparator);

//        palavras.sort((s1, s2) -> {
//            if(s1.length() < s2.length()){
//                return -1;
//            }
//            if(s1.length() > s2.length()){
//                return 1;
//            }
//
//            return 0;
//        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(),s2.length()));

        palavras.sort(Comparator.comparing(s-> s.length()));
        palavras.sort(Comparator.comparing(String::length));


        Function<String, Integer> funcao = s -> s.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);

        System.out.println(palavras);

        palavras.forEach(s -> System.out.println(s));

//        System.out.println(palavras.stream().count());
        System.out.println("##############");
        System.out.println("####### filter curso caelum #######");
        palavras.stream()
                .filter(s -> s.equals("caelum"))
                .forEach(System.out::println);

        System.out.println("##############");
        System.out.println("####### devolvendo resultado após filtrar #######");

        List<String> teste = palavras.stream()
                .filter(s -> s.equals("caelum"))
                .collect(Collectors.toList());

        teste.forEach(System.out::println);

//        palavras.forEach(System.out::println);


    }
}