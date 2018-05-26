package com.handson.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Music implements Serializable {

	private static final long serialVersionUID = -7557178297991679629L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "music_id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "artist_id")
	private Artist artist;
}
