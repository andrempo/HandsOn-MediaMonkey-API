package com.handson.repository;

import org.springframework.data.repository.CrudRepository;

import com.handson.domain.Playlist;


public interface PlaylistRepository extends CrudRepository<Playlist, String> {
	//Empty
}
