package traccia;

import java.util.Iterator;
import java.util.TreeMap;

public class RegistroEsami extends TreeMap<String,Libretto> implements Iterable<Libretto> {

    public RegistroEsami() {
        super(new ComparatoreMatricolaDecrescente());
    }


    @Override
    public Iterator<Libretto> iterator() {
        return values().iterator(); //iteratore ad una collection di libretti
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Registro Esami\n");

        for(Libretto l : this){
            sb.append(l.toString()).append("\n");
        }

        return sb.toString();
    }
    public boolean aggiungiEsame(String matricola, Esame esame){
        if(!this.containsKey(matricola) || this.get(matricola).contains(esame)){
            return false;
        }
        Libretto daAggiornare = this.get(matricola);
        daAggiornare.add(esame);
        return true;
    }
}
