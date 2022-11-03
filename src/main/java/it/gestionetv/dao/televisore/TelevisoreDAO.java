package it.gestionetv.dao.televisore;

import java.sql.Connection;

import it.gestionetv.dao.IBaseDAO;
import it.gestionetv.model.Televisore;

public interface TelevisoreDAO extends IBaseDAO<Televisore>  {
	
	public void setConnection(Connection connection);

}
