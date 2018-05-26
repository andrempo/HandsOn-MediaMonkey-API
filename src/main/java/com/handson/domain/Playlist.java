package com.handson.domain;

import java.util.List;

/**
 * @author hblonski
 * Playlist de músicas.
 */
public class Playlist {
	
	private List<Music> musics;

	public List<Music> getMusics() {
		return this.musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}
}
