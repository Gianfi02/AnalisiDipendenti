public class Dipendente {
    private String nome;
    private int eta;
    private double stipendio;
    Dipartimento dipartimento;

    //costruttore con dati
    public Dipendente(String nome, int eta, double stipendio, Dipartimento dipartimento){
        this.nome = nome;
        this.eta = eta;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    //costruttore overload per usare constructor reference con solo il nome
    public Dipendente(String nome){
        this.nome = nome;
        this.eta = 0;
        this.stipendio = 0.0;
    }

    //METODI GETTER
    public String getNome(){
        return nome;
    }
    public int getEta(){
        return eta;
    }
    public double getStipendio(){
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
}
