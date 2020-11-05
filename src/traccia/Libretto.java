package traccia;

import java.util.HashSet;

public class Libretto extends HashSet<Esame>{
    private final Studente studente;

    public Libretto(Studente studente) {
        this.studente = new Studente(studente.getNome(),studente.getCognome(),studente.getMatricola());
    }

    public Studente getStudente() {
        return studente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.studente.toString()).append('\n');

        for (Esame esame : this) {
            sb.append(esame.toString()).append('\n');
        }
        return sb.toString();
    }

}
