package traccia;

import java.util.Comparator;

public class ComparatoreMatricolaDecrescente implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.toLowerCase().compareTo(s1.toLowerCase());
    }
}
