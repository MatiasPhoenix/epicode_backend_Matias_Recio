package it.epicode.week1.day4;

public class ContrattoMobile extends ContrattoTelefonico{
    private final double COSTO_ALLA_RISPOSTA;

    public ContrattoMobile(int numeroTel, String utente, double COSTO_ALLA_SECONDO, double COSTO_ALLA_RISPOSTA){
        super (numeroTel, utente, COSTO_ALLA_SECONDO);
        this.COSTO_ALLA_RISPOSTA = COSTO_ALLA_RISPOSTA;
    }


    @Override
    public void aggiornaBolletta(int secondi){
        super.aggiornaBolletta(secondi);
        aggiungiCosti(COSTO_ALLA_RISPOSTA);
    }

}
