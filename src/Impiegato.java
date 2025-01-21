import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Impiegato extends Persona {
    // Valori iniziali
    private String nrTesserino;
    private LocalDate dataAssunzione;
    private Integer stipendio;

    // Costruttore
    public Impiegato(String nome, String cognome, LocalDate dataNascita, String nrTesserino, LocalDate dataAssunzione,
            Integer stipendio) {
        super(nome, cognome, dataNascita);
        this.nrTesserino = nrTesserino;
        this.dataAssunzione = dataAssunzione;
        this.stipendio = stipendio;
    }

    public String getNrTesserino() {
        return nrTesserino;
    }

    public void setNrTesserino(String nrTesserino) {
        // Controllo se il numero tesserino è valido
        if (nrTesserino == null || nrTesserino.trim().isEmpty()) {
            throw new IllegalArgumentException("Il numero tesserino non può essere nullo o vuoto");
        } else if (nrTesserino == "0") {
            throw new IllegalArgumentException("Il numero tesserino non può essere 0");
        } else {
            this.nrTesserino = nrTesserino;
        }
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        // Controllo che la data di nascita sia inferiore alla data di assunzione
        if (dataAssunzione.isAfter(getDataNascita())) {
            throw new IllegalArgumentException(
                    "La data di assunzione non può essere maggiore della tua data di nascita");
        } else {
            this.dataAssunzione = dataAssunzione;
        }
    }

    public Integer getStipendio() {
        return stipendio;
    }

    public void setStipendio(Integer stipendio) {
        // Controllo che lo stipendio non sia 0 o minore
        if (stipendio <= 0) {
            throw new IllegalArgumentException("Lo stipendio non può essere negativo o uguale a 0");
        } else {
            this.stipendio = stipendio;
        }
    }

    // Metodi
    // Aumento dello stipendio
    public int riceviAumento(int aumento) {
        int stipendio = +aumento;

        return stipendio;
    }

    // Mostra tutti i dati
    public String tuttiDati() {
        return "nome: " + getNome() + "\nCognome: " + getCognome() + "\nData nascita: " + getDataNascita()
                + "\nnrTesserino: " + nrTesserino + "\ndataAssunzione=" + dataAssunzione + "\nstipendio= " + stipendio;
    }
}
