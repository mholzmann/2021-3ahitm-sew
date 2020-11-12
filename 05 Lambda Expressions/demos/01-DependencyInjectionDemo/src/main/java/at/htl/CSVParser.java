package at.htl;

@FunctionalInterface
public interface CSVParser<E> {

    E parseEntity(String csvLine);

}
