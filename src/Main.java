import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args){
        List<Dipendente> dipendenti = new ArrayList<>();
        Dipendente dip_1 = new Dipendente("mario", 32, 1500,Dipartimento.IT);
        dipendenti.add(dip_1);

        Dipendente dip_2 = new Dipendente("Giulia", 28, 1800, Dipartimento.HR);
        dipendenti.add(dip_2);

        Dipendente dip_3 = new Dipendente("Luca", 45, 2200, Dipartimento.FINANCE);
        dipendenti.add(dip_3);

        Dipendente dip_4 = new Dipendente("Elena", 35, 1950, Dipartimento.SALES);
        dipendenti.add(dip_4);

        Dipendente dip_5 = new Dipendente("Marco", 29, 1700, Dipartimento.IT);
        dipendenti.add(dip_5);

        Dipendente dip_6 = new Dipendente("Sara", 40, 2100, Dipartimento.FINANCE);
        dipendenti.add(dip_6);

        //FILTRIAMO senza STRAM


        List<Dipendente> filtratiEta = new ArrayList<>();
        FiltroDipendente filtroEta = x -> x.getEta() > 30;
        for(Dipendente d : dipendenti){
           if (filtroEta.test(d)){
               filtratiEta.add(d);
           }
        }
        //Sampa i filtrati per eta
//        for (Dipendente d : filtratiEta){
//            System.out.println(d.getNome()+" "+d.getEta());
//        }

        List<Dipendente> filtratiStip = new ArrayList<>();
        FiltroDipendente filtroStip = x -> x.getStipendio()>1800;
        for (Dipendente d : dipendenti){
            if(filtroStip.test(d)){
                filtratiStip.add(d);
            }
        }
        //Stampiamo i filtrati per sitpendio
//        for (Dipendente d : filtratiStip){
//            System.out.println(d.getNome()+" "+d.getStipendio());
//        }

        //      ORDINAMENTO PER NOME con REFERENCE
        dipendenti.sort(Comparator.comparing(Dipendente::getNome, String.CASE_INSENSITIVE_ORDER));
        for (Dipendente d : dipendenti){
            System.out.println(d.getNome());
        }

        //      CONSTRUCTOR REFERENE:CREAZIONE LISTA DIPENDENTI A PARTIRE DA LISTA NOMI
        List<Dipendente> dipendenti_2 = new ArrayList<>();
        List<String> listaNomi = List.of("Mirko", "Giacomo", "Giovanna", "Marta");
        Function<String, Dipendente> creaDipendente = Dipendente::new;
        for (String nome : listaNomi){
            Dipendente dipendenteTemp;
            dipendenteTemp = creaDipendente.apply(nome);
            dipendenti_2.add(dipendenteTemp);
        }
        //Stampa della nuova lista
        for(Dipendente d : dipendenti_2){
            System.out.println(d.getNome());
        }

    }
}
