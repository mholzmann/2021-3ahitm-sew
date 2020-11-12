package at.htl;

import org.junit.jupiter.api.*;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class CSVFileTest {

    private int counter = 0;

    @Test
    void readEntities_FiveTeachers_ParserCalledFiveTimes() throws IOException {
        // Following line wouldn't work because a local variable can't be modified in lambda expression.
        // int counter = 0;

        // "this.counter" couldn't be accessed in an anonymous class because "this"
        // wouldn't reference to the instance of the surrounding CSVFileTest class.
        // Instead "this" would reference to an instance of the anonymous class itself.
        CSVFile<Person> teachersCSV = new CSVFile<>("teachers.csv", csvLine -> {
            System.out.println(++this.counter);
            String[] values = csvLine.split(",");
            return new Person(Integer.parseInt(values[2]), values[0], values[1]);
        });

        teachersCSV.readEntities();
        assertThat(this.counter).isEqualTo(5);
    }
}