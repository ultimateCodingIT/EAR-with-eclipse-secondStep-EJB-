package it.ultimatecoding;

import java.util.List;

import javax.ejb.Remote;

import it.ultimatecoding.DTO.ArticoliDTO;

@Remote
public interface MyEJBRemote {
	
	public List<ArticoliDTO> getArticoliDTO();

}
