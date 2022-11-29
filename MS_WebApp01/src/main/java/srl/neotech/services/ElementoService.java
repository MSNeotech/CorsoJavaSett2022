package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import srl.neotech.dao.ElementoDAO;
import srl.neotech.model.Elemento;

@Service
public class ElementoService {

	@Autowired
	ElementoDAO elementoDAO;
	
	public Integer countElementi() {
		return elementoDAO.countElementi();
	}
	
	public Elemento getElemento(Integer id) {
		return elementoDAO.getelemento(id);
	}
	
	public ArrayList<Elemento> getListaelementi(){
		List<Elemento> listaElementi_= elementoDAO.getListaElementi();
		ArrayList<Elemento> listaElementi=new ArrayList<Elemento>();
		listaElementi.addAll(listaElementi_);
		return listaElementi;
	}
	
	@Transactional
	public void addElemento(Elemento elemento) {
		elementoDAO.addElemento(elemento);
	}
	
	@Transactional
	public void deleteElemento(Integer idelemento) {
		elementoDAO.deletElemento(idelemento);
	}
}
