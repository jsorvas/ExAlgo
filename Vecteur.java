import java.util.*;

public class Vecteur {
    public static void main (String[] args) {
        //Initialisation
        Scanner sc = new Scanner(System.in);

        int n = 5;
        //declaring ArrayList with initial size n
        ArrayList<Integer> vector = new ArrayList<Integer>(n);
        // Appending the new element at the end of the list
        for (int i = 1; i <= n; i++) vector.add(i);
        // vector.remove(3);
        // Printing elements
        System.out.println(vector);
        System.out.println("Valeur de pim : " + vector.get(1));
    }
}
