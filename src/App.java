import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Persona Antonio= new Persona("antonio", "Rossi", LocalDate.of(2016, 9, 23));

        System.out.println();
        System.out.println(Antonio.saluta());


    }
}
