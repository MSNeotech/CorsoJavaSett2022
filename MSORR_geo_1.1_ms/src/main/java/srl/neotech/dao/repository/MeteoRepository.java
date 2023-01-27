package srl.neotech.dao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAuto;
import srl.neotech.model.MeteoGiornaliero;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Repository
public class MeteoRepository {

	@Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
	
	
	public List<Regione> getListaRegioni(){
		
		MapSqlParameterSource params=new MapSqlParameterSource();
		
		String query="select * from regione";
		
		List<Regione> regioni = jdbcTemplate.query(
				query,
                params,
		        (rs, rowNum) ->new Regione(rs.getInt("id_regione"), rs.getString("regione"))
		        );
		return regioni;
		
	}
	
public List<Provincia> getListaProvince(Integer id_regione){
		
	    MapSqlParameterSource params=new MapSqlParameterSource();
	    params.addValue("id_regione", id_regione);
	    //Query
	    String query="select * from provincia where id_regione=:id_regione";
		List<Provincia> province=jdbcTemplate.query(
						query,
		                params,
		                (rs, rowNum) ->new Provincia(rs.getString("sigla"), rs.getString("provincia"))
		        );
      return province;
}
	

	public List<Comune> getListaComuni(String sigla){
		
		MapSqlParameterSource params=new MapSqlParameterSource();
		
	    params.addValue("sigla", sigla);

		String query="select * from citta where provincia=:sigla";
		
		List<Comune> comuni = jdbcTemplate.query(
				query,
		        params,
		        (rs, rowNum) ->new Comune(rs.getString("istat"), rs.getString("comune"), rs.getString("provincia"))
		        );
		
		return comuni;
		
	}
	
	public List<ComuneAuto> getListaComuniAuto(String input) {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("input", input+"%");
		//Query
		String query="select comune, istat from citta where comune LIKE :input";
			
		List<ComuneAuto> listaComuni=jdbcTemplate.query(
				query,
		        params,
		        (rs, rowNum) -> new ComuneAuto(rs.getString("comune"), rs.getString("comune"), rs.getString("istat"))
		        );
		return listaComuni;
	}
	
	public Comune getMeteo(String istat){
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("istat", istat);
		String query="select lat, lng  from geoloc where istat=:istat";
		
		Comune comuni = jdbcTemplate.queryForObject(
			query,
	        params,
	       Comune.class);
			
		
   	 return comuni;
   	 
    }
	
	
	
	
}
