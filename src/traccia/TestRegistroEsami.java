/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traccia;




public class TestRegistroEsami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DataNonValidaException, CodiceNonValidoException, VotoNonValidoException {


        RegistroEsami r = new RegistroEsami();
        Studente s = new Studente("Marco", "Venere", "9101");
        Studente s1 = new Studente("Cristian", "Mandara", "3011");
        Studente s2 = new Studente("Mario", "Pellegrino", "2090");
        Studente s3 = new Studente("Mirco", "Rispoli", "8329");

        Esame esame1 = Esame.crea("OOP", 20, 1, 2021, 18, "11111");
        Esame esame2 = Esame.crea("Tisc", 21, 2, 2021, 18, "11112");
        Esame esame3 = Esame.crea("TTT", 10, 1, 2021, 18, "11113");
        Esame esame4 = Esame.crea("Reti", 9, 2, 2021, 18, "11114");
        Libretto l = new Libretto(s);
        Libretto l1 = new Libretto(s1);
        Libretto l2 = new Libretto(s2);
        Libretto l3 = new Libretto(s3);

        r.put(s.getMatricola(), l);
        r.put(s1.getMatricola(), l1);
        r.put(s2.getMatricola(), l2);
        r.put(s3.getMatricola(), l3);

        r.aggiungiEsame(s.getMatricola(), esame1);
        r.aggiungiEsame(s.getMatricola(), esame3);
        r.aggiungiEsame(s1.getMatricola(), esame2);
        r.aggiungiEsame(s1.getMatricola(), esame4);
        r.aggiungiEsame(s2.getMatricola(), esame3);
        r.aggiungiEsame(s2.getMatricola(), esame2);
        r.aggiungiEsame(s3.getMatricola(), esame4);
        r.aggiungiEsame(s3.getMatricola(), esame1);

        System.out.println(r);



        // Avvio thread di salvataggio automatico
        /*new Thread(new SalvataggioAutomatico("Backup.dat", r)).start();

        synchronized (r) {
            r.put("0612703123", new Libretto(new Studente("Marco", "Rossi", "0612703123")));
            System.out.println("Aggiunto Studente con matricola 0612703123");
            System.out.println(r);
            r.notifyAll();
        }
        Thread.sleep(3000);
        synchronized (r) {
            r.put("0612701234", new Libretto(new Studente("Lucia", "Bianchi", "0612701234")));
            r.aggiungiEsame("0612701234", Esame.crea("Programmazione ad Oggetti", 9, 1, 2017, 28, "0612700009"));
            System.out.println("Aggiunto Studente con matricola 0612701234");
            System.out.println(r);
            r.notifyAll();
        }
        Thread.sleep(3000);
        synchronized (r) {
            r.put("0612707654", new Libretto(new Studente("Elena", "Verdi", "0612707654")));
            r.aggiungiEsame("0612707654", Esame.crea("Programmazione ad Oggetti", 10, 1, 2017, 31, "0612700009"));
            r.aggiungiEsame("0612707654", Esame.crea("Matematica I", 10, 10, 2016, 21, "0612700005"));
            r.aggiungiEsame("0612707654", Esame.crea("Matematica II", 10, 12, 2016, 25, "0612700007"));
            System.out.println("Aggiunto Studente con matricola 0612707654");
            System.out.println(r);
            r.notifyAll();
        }
        Thread.sleep(3000);
        synchronized (r) {
            r.put("0612710134", new Libretto(new Studente("Lucia", "Bianchi", "0612710134")));
            r.aggiungiEsame("0612710134", Esame.crea("Programmazione ad Oggetti", 5, 1, 2017, 25, "0612700009"));
            System.out.println("Aggiunto Studente con matricola 0612710134");
            System.out.println(r);
            r.notifyAll();
        }
        Thread.sleep(3000);

    */

    }

}
