package com.sescosse.jukephone.back.appplication.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sescosse.jukephone.back.application.BidService;
import com.sescosse.jukephone.back.appplication.dto.BidDto;
import com.sescosse.jukephone.back.domain.Bid;
import com.sescosse.jukephone.back.domain.SongRepository;

@Service
public class BidServiceImpl implements BidService {

	@Autowired
	private SongRepository<Bid> bidRepository;
	
	@Override
	public BidDto addBid(BidDto bid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BidDto getBid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
