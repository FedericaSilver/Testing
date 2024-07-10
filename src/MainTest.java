import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MainTest {
    private Main testing = new Main();
    private static OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void fullFormat() {
        DateTimeFormatter fullTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.ITALY);
        String formattedDate = fullTime.format(data);
        assertEquals("1 marzo 2023", formattedDate);
    }

    @Test
    void parsingData() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String data = dateTime.toString();
        assertEquals("2023-03-01T13:00Z", data);
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(DateTimeParseException.class, () -> {
            OffsetDateTime.parse("2023-03-0113:00:00Z");
        });

    }
}