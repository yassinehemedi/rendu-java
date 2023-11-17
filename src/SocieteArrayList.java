import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> L;

    public SocieteArrayList() {
        L = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        L.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : L) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return L.contains(employe);
    }
    @Override
    public void supprimerEmploye(Employe employe) {
        L.remove(employe);
    }
    @Override
    public void displayEmploye(){
        for (Employe employe : L) {
             employe.toString();}
    }
    @Override
    public void trierEmployeParId() {
        Collections.sort(L);
    }
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> departement= new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNomDepartement().compareTo(o2.getNomDepartement());
            }
        };
        Comparator<Employe> Grade= new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade()-o2.getGrade();
            }
        };
        Collections.sort(L,departement.thenComparing(Grade));

    }









}
