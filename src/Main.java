//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = riempiHashSet();

    }
    public static HashSet<String> riempiHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        String elementi = "Elem2";
        verificaPresenza(hashSet, elementi);
        hashSet.add("Elem1");
        hashSet.add("Elem2");
        hashSet.add("Elem3");
        hashSet.add("Elem4");
        return hashSet;
    }

    public static void verificaPresenza(HashSet<String> hashSet, String elemento) {
        boolean presente = hashSet.contains(elemento);
        if (presente) {
            System.out.println(elemento + " è presente nell'HashSet.");
        } else {
            System.out.println(elemento + " non è presente nell'HashSet.");
        }

    }


}