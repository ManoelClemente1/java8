import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JULY,5);

        int anos = olimpiadasRio.getYear() - hoje.getYear();

        System.out.println(anos);

        Period periodo = Period.between(hoje,olimpiadasRio);
        System.out.println(periodo);

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);

        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);

        LocalDateTime agora =  LocalDateTime.now();

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(agora.format(formatadorComHoras));

        YearMonth year = YearMonth.from(agora);

        System.out.println(year);


    }
}
