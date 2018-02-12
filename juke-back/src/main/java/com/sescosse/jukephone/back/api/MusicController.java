package com.sescosse.jukephone.back.api;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sescosse.jukephone.back.application.BidService;
import com.sescosse.jukephone.back.appplication.dto.BidDto;

@RestController
@RequestMapping("/api/jukephone/v1")
public class MusicController {

	@Autowired
	private BidService bidService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	//@RolesAllowed("CUSTOMER")
	public ResponseEntity<?> addSongBid(@RequestBody BidDto bid){
		BidDto bidCreated = bidService.addBid(bid);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(bidCreated.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping
	public BidDto getBid(Long id) {
		return getBid(id);
	}
	
}
