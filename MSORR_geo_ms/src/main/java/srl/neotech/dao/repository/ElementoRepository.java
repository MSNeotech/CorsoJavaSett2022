package srl.neotech.dao.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import srl.neotech.model.Elemento;

@Repository
public class ElementoRepository {

	
	@Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
	
	@Autowired 
	private PlatformTransactionManager transactionManager;
	
	
	public Integer countElementi() {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		
		//Query
		String query="select count(*) from elemento";
		Integer numElementi=jdbcTemplate.queryForObject(query,params,Integer.class);
		return numElementi;
	}
	
	
	public Elemento getElemento(Integer id) {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("idElemento", id);
		//Query
		String query="select * from elemento where id = :idElemento";
		Elemento elemento=jdbcTemplate.queryForObject(
				query,
                params,
                (rs, rowNum) ->new Elemento(rs.getInt("id"), rs.getString("descrizione"))
        );
		return elemento;
	}
	
	
	public List<Elemento> getListaElementi(){
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		//Query
		String query="select * from elemento";
		
		List<Elemento> elementi=jdbcTemplate.query(
				query,
                params,
                (rs, rowNum) ->new Elemento(rs.getInt("id"), rs.getString("descrizione"))
        );
		return elementi;
	}
	
	
	public void addElemento(Elemento elemento) {
		//configurazione TX
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
	    TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("idElemento", elemento.getId());
		params.addValue("descrElemento", elemento.getDescrizione());
				
		//Query
		String query="insert into Elemento(id, descrizione) VALUES (:idElemento, :descrElemento)";
		try {
			jdbcTemplate.update(query,params);
			transactionManager.commit(transactionStatus);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transactionManager.rollback(transactionStatus);
		}
	}
	
	
	public void updateElemento (Elemento elemento) {
		//configurazione TX
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
	    TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
	    
	  //Parametri da passsare alla query
	  MapSqlParameterSource params=new MapSqlParameterSource();
	  params.addValue("idElemento", elemento.getId());
	  params.addValue("descrElemento", elemento.getDescrizione());
	  
	  //Query
	  String query="update Elemento set descrizione=:descElemento where id=:idElemento";
	  
	  try {
		jdbcTemplate.update(query,params);
		transactionManager.commit(transactionStatus);
	} catch (DataAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		transactionManager.rollback(transactionStatus);
	}
	}
	
	public void deleteElemento(Integer idelemento) {
		//configurazione TX
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
	    TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
	    
	  //Parametri da passsare alla query
	  MapSqlParameterSource params=new MapSqlParameterSource();
	  params.addValue("idElemento", idelemento);
	 
	  //Query
	  String query="delete Elemento where id=:idElemento";
	 
	  try {
		jdbcTemplate.update(query,params);
		transactionManager.commit(transactionStatus);
	} catch (DataAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		transactionManager.rollback(transactionStatus);
	}
	  
	  
	}
}
