import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.*;
import java.util.Locale;

/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio
 */
public class Main {
    public static void main(String[] args) {
        try {
            OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
            String fullData = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.ITALY));
            System.out.println(fullData);
        } catch (DateTimeParseException dtpe){
            System.err.println(dtpe.getMessage());
        }




    }
}