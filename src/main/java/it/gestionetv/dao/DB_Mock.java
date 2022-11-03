package it.gestionetv.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.gestionetv.model.Televisore;

public class DB_Mock {
	
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();
	
	static {
		LISTA_TELEVISORI.add(new Televisore(1l, "sony", "bravia 4k", 1000, 40, "asdfg0482"));
		LISTA_TELEVISORI.add(new Televisore(2l, "sony", "bravia 5k", 2000, 42, "fkgj0593"));
		LISTA_TELEVISORI.add(new Televisore(3l, "sony", "bravia 6k", 3000, 44, "fhsk4592"));
		LISTA_TELEVISORI.add(new Televisore(4l, "samsung", "oled 4k", 4000, 46, "gksh3472"));
		LISTA_TELEVISORI.add(new Televisore(5l, "samsung", "oled 8k", 5000, 48, "fjgu4764"));
		LISTA_TELEVISORI.add(new Televisore(6l, "lg", "nanocell 4k", 6000, 50, "hyoe4059"));
		LISTA_TELEVISORI.add(new Televisore(7l, "lg", "UHD 6k", 7000, 52, "pgjs0683"));
	}
	
	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getId)).get().getId();
		return ++resultId;
	}

}
