import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();

        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");


        //Collections.sort(palavras,comparator);

        palavras.sort((s1, s2) -> {
            if(s1.length() < s2.length()){
                return -1;
            }
            if(s1.length() > s2.length()){
                return 1;
            }

            return 0;
        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(),s2.length()));

        System.out.println(palavras);

        palavras.forEach(s -> System.out.println(s));


    }
}