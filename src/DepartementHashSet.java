import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{

    Set<Departement> S=new HashSet<Departement>();
    public void ajouterDepartement(Departement t)
    {S.add(t);}
    public boolean rechercherDepartement(String nom)
    {for(Departement D:S)
    {if(D.getNomDepartement().equals(nom))
    return true;}
        return false;
    }
    public boolean rechercherDepartement(Departement t)
    {return S.contains(t);}
    public void supprimerDepartement(Departement t)
    {S.remove(t);}
    public void displayDepartement()
    {for(Departement D:S)
    System.out.println(D.toString());
    }
    public TreeSet<Departement> trierDepartementById()
    { TreeSet<Departement> t = new TreeSet<>(new Comparator<Departement>() {
        @Override
        public int compare(Departement d1, Departement d2) {
            {return ((d1.getId())-(d2.getId()));}
        }
    });
        t.addAll(S);
        return t;


    }

}
