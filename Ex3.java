package Ex1;
import java.util.Scanner;

class Etudiant {
    private String cne;
    private float note;

    public Etudiant(String cne, float note) {
        this.cne = cne;
        this.note = note;
    }

    public String toString() {
        return "CNE : " + cne + ", Note : " + note;
    }

    public boolean estAdmis() {
        return note >= 12;
    }

    public String getCne() {
        return cne;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez CNE :");
        String cne = sc.nextLine();     

        System.out.println("Entrez la Note:");
        float note = sc.nextFloat();                             


        Etudiant E = new Etudiant(cne, note);
        
        System.out.println(E.toString());

        
        if (E.estAdmis()) {
            System.out.println(E.getCne() + " → Admis");
        } else {
            System.out.println(E.getCne() + " → Non Admis");
        }
        sc.close();
    }
}