public class Employe {
    private int id;


    // Constructor
    public Employe(int id) {
        this.id = id;

    }

    // Getter methods
    public int getId() {
        return id;
    }




    // Display information method
    @Override
    public String toString() {
        return "Employee ID: " + id;

    }


}

