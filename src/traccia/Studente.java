package traccia;

import java.util.Objects;

public class Studente implements Comparable<Studente>{
    private final String nome;
    private final String cognome;
    private final String matricola;

    public Studente(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studente studente = (Studente) o;

        return Objects.equals(getMatricola().toLowerCase(), studente.getMatricola().toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricola().toLowerCase());
    }


    @Override
    public int compareTo(Studente o) {
        return this.getMatricola().toLowerCase().compareTo(o.getMatricola().toLowerCase());
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome=" + nome +
                ", cognome=" + cognome +
                ", matricola=" + matricola +
                '}';
    }
}
