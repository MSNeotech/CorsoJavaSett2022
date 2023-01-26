package srl.neotech.dao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAuto;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Repository
public class MeteoRepository {

	@Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
	
	public List<Provincia> getListaProvince(Integer idRegione){
		//Parametri da passsare alla query
	    MapSqlParameterSource params=new MapSqlParameterSource();
		List<Provincia> provincie=new ArrayList<Provincia>();
	    params.addValue("idRegione", idRegione);
		//Query
		String query="select sigla,provincia from provincia where id_regione=:idRegione order by provincia";
		provincie=jdbcTemplate.query(
						query,
		                params,
		                (rs, rowNum) ->new Provincia(rs.getString("sigla"), rs.getString("provincia"))
		        );
      return provincie;
}
	
	
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
	

	public List<Comune> getListaComuni(String sigla){
		
		MapSqlParameterSource params=new MapSqlParameterSource();
		
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
	
	
}
