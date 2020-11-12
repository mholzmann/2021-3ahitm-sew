package at.htl;

public class MemberParser implements CSVParser<Person>{

    @Override
    public Person parseEntity(String csvLine) {
        String[] values = csvLine.split(",");
        return new Person(Integer.parseInt(values[0]), values[1], values[2]);
    }
}
