package traccia;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Objects;

public class Esame {
    private final String nome;
    private final LocalDate data;
    private final int voto;
    private final String codice;

    private Esame(String nome, LocalDate data, int voto, String codice) {
        this.nome = nome;
        this.data = data;
        this.voto = voto;
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return LocalDate.of(data.getYear(),data.getMonthValue(),data.getDayOfMonth());
    }

    public int getVoto() {
        return voto;
    }

    public String getCodice() {
        return codice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Esame esame = (Esame) o;
        return this.getCodice().toLowerCase().equals(esame.getCodice().toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodice().toLowerCase());
    }

    @Override
    public String toString() {
        return "Esame{" +
                "nome=" + nome +
                ", data=" + data +
                ", voto=" + voto +
                ", codice=" + codice +
                '}';
    }

    public static Esame crea(String nome,int giorno,int mese,int anno,int voto,String codice) throws VotoNonValidoException, CodiceNonValidoException, DataNonValidaException {
        LocalDate nuovaData;

        if(voto < 18 || voto > 31){
            throw new VotoNonValidoException();
        }
        if(codice == null){
            throw new CodiceNonValidoException();
        }
        try{
            nuovaData = LocalDate.of(anno,mese,giorno);
        }catch (DateTimeException dt){
            throw new DataNonValidaException();
        }

        return new Esame(nome, nuovaData,voto,codice);
    }
}
