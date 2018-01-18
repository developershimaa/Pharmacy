package com.shimaa.pharma.common.dao;

import java.util.List;
import java.util.Map;



public interface PharmaDAOIf<T> {
	    public Integer save(T t)throws PharmaDAOException;

	    public Boolean update(T t);

	    public Boolean delete(Integer code);

	    public List<T> listAll();

	    public List<T> searchBy(String key, Integer searchType);

	    public List<T> searchBy(Map<Integer, String> searchMap);
}
