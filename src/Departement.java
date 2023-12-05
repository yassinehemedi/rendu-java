public class Departement implements Comparable<Departement>{
    private String name;

    // Constructor
    public Departement(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Departement{name='" + name + "'}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement d)) return false;
        return name == d.getName();
    }
    @Override
    public int compareTo(Departement o) {
        return name.compareTo(o.getName());
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        return result;
    }




}
