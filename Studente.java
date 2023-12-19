public class Studente {
    
    private String nome;
    private String cognome;
    private int id;

    Studente(String nome, String cognome, int id){

        this.setNome(nome);
        this.setCognome(cognome);
        this.setId(id);

    }
    //funzioni get per accedere alle variabili
    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public int getId(){
        return id;
    }
    //fine

    //funzioni set per la costruttrice o cambiare valori nel main tramite funzioni
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public void setId(int id){
        this.id = id;
    }

}
