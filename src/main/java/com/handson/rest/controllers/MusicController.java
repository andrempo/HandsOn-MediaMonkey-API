package com.handson.rest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handson.domain.Music;
import com.handson.service.MusicService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Api(value = "/musicas", description = "API de listagem de Musicas", produces = "application/json")
@RestController
@RequiredArgsConstructor
public class MusicController {

	@NonNull
	private MusicService musicService;

	@GetMapping("/musicas")
	@ApiOperation(value = "Lista Musicas por filtro", response = List.class, responseContainer = "List")
	@ApiResponses({ @ApiResponse(code = 204, message = "Não há registros para a busca realizada"),
			@ApiResponse(code = 400, message = "A quantidade mínima de carateres deve ser 3") })
	public List<Music> list(@RequestParam(name = "filtro") String filter) {
		List<Music> musicList = this.musicService.findByFilter(filter);
		return musicList;
	}

}
