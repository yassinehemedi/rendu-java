

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.*;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
        for (Etudiant etudiant : students) {
            con.accept(etudiant);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for (Etudiant etudiant : students) {
            if (pre.test(etudiant)) {
                con.accept(etudiant);
            }
        }
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        String result = "";
        for (Etudiant etudiant : students) {
            result += fun.apply(etudiant);
        }
        return result;
    }
    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }
    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        Collections.sort(students, com);
        return students;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return students.stream();
    }


}




