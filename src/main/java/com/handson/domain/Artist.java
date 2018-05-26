package com.handson.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "artistas")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Artist implements Serializable {

	private static final long serialVersionUID = 8326079384486438501L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	@Column(name = "nome")
	private String name;
}
