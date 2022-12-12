package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.ElementoRepository;
import srl.neotech.model.Elemento;

@Component
public class ElementoDAO {

	@Autowired
	ElementoRepository elementoRepository;
	
	public Integer countElementi() {
		return elementoRepository.countElementi();
	}
	
	public Elemento getelemento(Integer id) {
		return elementoRepository.getElemento(id);
	}
	
	public List<Elemento> getListaElementi(){
		return elementoRepository.getListaElementi();
	}
	
	public void addElemento(Elemento elemento) {
		elementoRepository.addElemento(elemento);
	}
	
	public void updatElemento(Elemento elemento) {
		elementoRepository.updateElemento(elemento);
	}
	
	public void deletElemento(Integer idelemento) {
		elementoRepository.deleteElemento(idelemento);
	}
	
	
	
	
}
