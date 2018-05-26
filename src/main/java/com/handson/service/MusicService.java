package com.handson.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.handson.domain.Music;
import com.handson.repository.MusicRepository;

import lombok.NonNull;

@Service
public class MusicService {
	
	@NonNull
	private MusicRepository repository;

	public List<Music> findByFilter(String filter) {
		
		return this.repository.findByFilter(filter);
	}

}
