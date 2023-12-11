import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        List<Etudiant> students = Arrays.asList(
                new Etudiant(1, "Alice", 22),
                new Etudiant(2, "Bob", 20),
                new Etudiant(3, "Charlie", 21)
        );

        System.out.println("Displaying all students:");
        Consumer<Etudiant> a =System.out::println ;
        studentManagement.displayStudents(students, a);

        Predicate<Etudiant> ageFilter = etudiant -> etudiant.getAge() > 20;
        System.out.println("\nDisplaying students by age filter (age > 20):");
        studentManagement.displayStudentsByFilter(students, ageFilter, System.out::println);

        Function<Etudiant, String> nameFunction = Etudiant::getNom;
        String concatenatedNames = studentManagement.returnStudentsNames(students, nameFunction);
        System.out.println("\nConcatenated names of students: " + concatenatedNames);

        Supplier<Etudiant> studentSupplier = () -> new Etudiant(4, "David", 23);
        Etudiant newStudent = studentManagement.createStudent(studentSupplier);
        System.out.println("\nNewly created student: " + newStudent);

        Comparator<Etudiant> idComparator = Comparator.comparing(Etudiant::getId);
        List<Etudiant> sortedStudentsById = studentManagement.sortStudentsById(students, idComparator);
        System.out.println("\nSorting students by ID:");
        studentManagement.displayStudents(sortedStudentsById, System.out::println);

        Stream<Etudiant> studentStream = studentManagement.convertToStream(students);
        System.out.println("\nConverting list of students to a stream and displaying:");
        studentStream.forEach(System.out::println);
    }
}
