package com.handson.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.handson.domain.Playlist;
import com.handson.repository.PlaylistRepository;

/**
 * Playlist service
 * @author hblonski
 */
public class PlaylistService {

	@Autowired
	private PlaylistRepository playlistRepository;
	
	public PlaylistService(PlaylistRepository playlistRepository) {
		this.playlistRepository = playlistRepository;
	}
	
	/**
	 * Recupera uma {@link Playlist} pelo seu Id.
	 * @param playlistId o Id da playlist.
	 * @return a playlist, caso encontrada, ou null caso contrário.
	 */
	public Playlist retrievePlaylist(String playlistId) {
		return this.playlistRepository.findOne(playlistId);
	}
	
	 /**
	  * Salva uma {@link Playlist}
	 * @param playlist a playlist.
	 */
	public void savePlaylist(Playlist playlist) {
		 this.playlistRepository.save(playlist);
	 }
}
