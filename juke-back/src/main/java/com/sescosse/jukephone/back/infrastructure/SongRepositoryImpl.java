package com.sescosse.jukephone.back.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sescosse.jukephone.back.domain.Bid;
import com.sescosse.jukephone.back.domain.SongRepository;
import com.sescosse.jukephone.back.infrastructure.db.SongRepositoryJpa;

@Repository
public class SongRepositoryImpl implements SongRepository<Bid>{

	@Autowired
	private SongRepositoryJpa bidRepository;
	
	@Override
	public void save(Bid post) {
		bidRepository.save(post);
		
	}

	@Override
	public void delete(Bid post) {
		bidRepository.delete(post);
		
	}

	@Override
	public List<Bid> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bid findById(long id) {
		return bidRepository.findOne(id);
	}

	@Override
	public List<Bid> findByOwner(long idOwner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bid> findByCustomer(long idCustomer) {
		// TODO Auto-generated method stub
		return null;
	}

}
