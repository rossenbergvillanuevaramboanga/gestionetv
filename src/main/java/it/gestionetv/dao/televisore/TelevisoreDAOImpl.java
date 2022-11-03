package it.gestionetv.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.gestionetv.dao.DB_Mock;
import it.gestionetv.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {
	
	private Connection connection;
	
	@Override
	public List<Televisore> list() throws Exception {
		// TODO Auto-generated method stub
		List<Televisore> result = new ArrayList<>();
		for(Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			result.add(televisoreItem);
		}
		return result;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		// TODO Auto-generated method stub
		Televisore result = null; 
		for(Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getId().equals(id)) result = televisoreItem;
		}
		return result;
	}

	@Override
	public int update(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		int result = 0; 
		for (Televisore televisore : DB_Mock.LISTA_TELEVISORI) {
			if (televisore.getId().equals(input.getId())) {
				televisore.setMarca(input.getMarca());
				televisore.setModello(input.getModello());
				televisore.setPrezzo(input.getPrezzo());
				televisore.setNumeroPollici(input.getNumeroPollici());
				televisore.setCodice(input.getCodice());
				result = 1; 
			}
		}
		return result;
		
	}

	@Override
	public int insert(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		input.setId(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(input)?1:0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return DB_Mock.LISTA_TELEVISORI.remove(input)?1:0;
	}

	@Override
	public void setConnection(Connection connection) {
		// TODO Auto-generated method stub
		this.connection = connection;
	}

}
