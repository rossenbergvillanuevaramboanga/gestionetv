package it.gestionetv.service.televisore;

import java.util.List;

import it.gestionetv.dao.televisore.TelevisoreDAO;
import it.gestionetv.model.Televisore;

public interface TelevisoreService {
	
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);
	
	//Metodi Crud
	
	public Televisore caricaSingolo(Long idTelevisore) throws Exception; 
	
	public List<Televisore> caricaTutti() throws Exception;
	
	public void inserisciSingolo(Televisore televisore) throws Exception;
	
	public void eliminaSingolo(Televisore televisore) throws Exception;
	
	public void aggiornaSingolo(Televisore televisore) throws Exception;

}
