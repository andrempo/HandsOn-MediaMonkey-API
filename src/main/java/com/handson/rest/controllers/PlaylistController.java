package com.handson.rest.controllers;

import java.util.List;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.domain.Music;
import com.handson.domain.Playlist;
import com.handson.service.PlaylistService;

/**
 * Playlist controller.
 * @author hblonski
 */
@RestController
@RequestMapping("/playlists")
public class PlaylistController {

	@Autowired
	private PlaylistService playlistService;
	
	@PutMapping("/api/playlists/{playlistId}/musicas")
	public ResponseEntity<?> addMusicsToPlaylist(@PathVariable("playlistId") String playlistId, @RequestBody List<Music> musics) {
		try {
			Playlist playlist = playlistService.retrievePlaylist(playlistId);
			
			if (playlist == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
		                .build();
			}
			
			playlist.addMusics(musics);
			
			playlistService.savePlaylist(playlist);
			
			return ResponseEntity.status(HttpStatus.OK)
					.build();
		} catch (Exception e) {
			//Obs: Tenho o costume de usar esse logger, alterar caso seja optado por usar outro.
			org.slf4j.LoggerFactory.getLogger(this.getClass()).error(String.format("Erro ao adicionar músicas na playlist. ID: %s", playlistId));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .build();
	}
}