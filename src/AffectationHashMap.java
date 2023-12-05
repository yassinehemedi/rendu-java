import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> a;

    public AffectationHashMap() {
        this.a = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        a.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        System.out.println(a);
    }

    public void supprimerEmploye(Employe e) {
        a.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        for (Map.Entry<Employe, Departement> b : a.entrySet()) {
            if (d.equals(b.getValue()))
                a.remove(e);
        }

    }

    void afficherEmployes() {
        for (Map.Entry<Employe, Departement> b : a.entrySet())
            System.out.println(b.getKey());
    }

    void afficherDepartements() {
        for (Map.Entry<Employe, Departement> b : a.entrySet())
            System.out.println(b.getValue());
    }


    boolean rechercherEmploye (Employe e)
    { return a.containsKey(e);}

    boolean rechercherDepartement (Departement d)
    { return a.containsValue(d);}

    TreeMap <Employe, Departement> trierMap()
    {  TreeMap<Employe, Departement>t=new TreeMap<>(new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return o1.getId()- o2.getId();
        }
    }  );
            t.putAll(a);
        return(t);

    }


}
