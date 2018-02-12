package com.sescosse.jukephone.back.infrastructure.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sescosse.jukephone.back.domain.Bid;

public interface SongRepositoryJpa extends JpaRepository<Bid, Long>{

	
}
