import java.time.LocalDate;

public class Persona {

    // Attrubuti
    String nome;
    String cognome;
    LocalDate dataNascita;

    // Costruttore
    public Persona(String nome, String cognome, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    // getters, setters opportuni
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // Controllo se il nome esiste
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Il nome non può essere nullo o vuoto");
        } else {
            this.nome = nome;
        }
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        // Controllo se il cognome esiste
        if (cognome == null || cognome.trim().isEmpty()) {
            throw new IllegalArgumentException("Il cognome non può essere nullo o vuoto");
        } else {
            this.cognome = cognome;
        }
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        // Controllo che la data non sia antecedente al 1900 
        // l'uomo più anziano del mondo ha 112 anni e la donna 116)
        // Controllo se la data è oltre a quella odierna
        if (dataNascita.isBefore(LocalDate.of(1900, 1, 1))) {
            throw new IllegalArgumentException("Stai sbagliando l'eta o hai fatto un guinness world record");
        } else if (dataNascita.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Sul serio vieni dal futuro?");
        } else {
            this.dataNascita = dataNascita;
        }
    }

    // Metodi
    // Metodo saluta
    public String saluta(){
        return ("ciao sono " + nome + " " + cognome + " e sono nato il " + dataNascita);
    }

}
