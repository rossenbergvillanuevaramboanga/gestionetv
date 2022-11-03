package it.gestionetv.service.televisore;

import java.util.List;

import it.gestionetv.dao.televisore.TelevisoreDAO;
import it.gestionetv.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {
	
	private TelevisoreDAO televisoreDAO;

	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		// TODO Auto-generated method stub
		this.televisoreDAO = televisoreDAO;
		
	}

	@Override
	public Televisore caricaSingolo(Long idTelevisore) throws Exception {
		// TODO Auto-generated method stub
		return televisoreDAO.get(idTelevisore);
	}

	@Override
	public List<Televisore> caricaTutti() throws Exception {
		// TODO Auto-generated method stub
		return televisoreDAO.list();
	}

	@Override
	public void inserisciSingolo(Televisore televisore) throws Exception {
		// TODO Auto-generated method stub
		televisoreDAO.insert(televisore);
	}

	@Override
	public void eliminaSingolo(Televisore televisore) throws Exception {
		// TODO Auto-generated method stub
		televisoreDAO.delete(televisore);
	}

	@Override
	public void aggiornaSingolo(Televisore televisore) throws Exception {
		// TODO Auto-generated method stub
		televisoreDAO.update(televisore);
	}

}
