package com.sescosse.jukephone.back.domain;

import java.util.List;

public interface SongRepository<T extends Bid> {

	void save(T post);

	void delete(T post);

	List<T> findAll();
	
	T findById(long id);
	
	//List<T> findByName(String name);
	
	List<T> findByOwner(long idOwner);
	
	List<T> findByCustomer(long idCustomer);
}
