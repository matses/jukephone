package com.sescosse.jukephone.back.application;

import com.sescosse.jukephone.back.appplication.dto.BidDto;

public interface BidService {

	BidDto addBid(BidDto bid);
	
	BidDto getBid(Long id);
}
