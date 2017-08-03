package it.ultimatecoding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import it.ultimatecoding.DTO.ArticoliDTO;
import it.ultimatecoding.model.Articoli;

/**
 * Session Bean implementation class MyEJB
 */
@Stateless
@LocalBean
public class MyEJB implements MyEJBRemote {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public MyEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<ArticoliDTO> getArticoliDTO() {
		List<Articoli> articoli= getArticoli();
		List<ArticoliDTO> listaDTO = new ArrayList<>();
		for (int i=0; i<articoli.size(); i++)
		{
			ArticoliDTO articoliDTO = new ArticoliDTO();
			articoliDTO.setId(articoli.get(i).getId());
			articoliDTO.setNomeArticolo(articoli.get(i).getNomeArticolo());
			articoliDTO.setTestArticolo(articoli.get(i).getTestArticolo());
			listaDTO.add(articoliDTO);
		}
	    return listaDTO;
	}
	
	public List<Articoli> getArticoli() {
		Query query = em.createQuery("SELECT e FROM Articoli e");
	    return (List<Articoli>) query.getResultList();
	}

}
