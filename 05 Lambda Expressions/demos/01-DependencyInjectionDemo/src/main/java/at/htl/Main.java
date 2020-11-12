package at.htl;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        injectNamedParser();
        injectAnonymousParser();
        injectLambdaExpression();
    }

    /**
     * Injects an instance of a named class as CSVParser into a CSVFile.
     *
     * @throws IOException
     */
    private static void injectNamedParser() throws IOException {
        CSVFile<Person> membersCSV = new CSVFile<>("members.csv", new MemberParser());
        printPersons(membersCSV.readEntities());
    }

    /**
     * Injects an instance of an anonymous class as CSVParser into a CSVFile.
     *
     * @throws IOException
     */
    private static void injectAnonymousParser() throws IOException {
        CSVFile<Person> studentsCSV = new CSVFile<>("students.csv", new CSVParser<Person>() {
            @Override
            public Person parseEntity(String csvLine) {
                String[] values = csvLine.split(",");
                return new Person(Integer.parseInt(values[0]), values[2], values[3]);
            }
        });
        printPersons(studentsCSV.readEntities());
    }

    /**
     * Injects a lambda expression as CSVParser into a CSVFile.
     *
     * This is possible because CSVParser is an interface with a single abstract method.
     * Such "functional interfaces" can be implemented by a lambda expression.
     *
     * @throws IOException
     */
    private static void injectLambdaExpression() throws IOException {
        CSVFile<Person> teachersCSV = new CSVFile<>("teachers.csv", csvLine -> {
            String[] values = csvLine.split(",");
            return new Person(Integer.parseInt(values[2]), values[0], values[1]);
        });
        printPersons(teachersCSV.readEntities());
    }

    /**
     * Prints all persons in the specified list.
     *
     * @param persons list of persons to be printed
     */
    private static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();
    }
}
