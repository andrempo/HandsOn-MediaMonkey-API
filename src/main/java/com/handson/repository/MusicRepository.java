package com.handson.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.handson.domain.Music;

@RepositoryRestResource
public interface MusicRepository extends JpaRepository<Music, String> {

	@Query("    select music from Music music join music.artist artist"
			+ " where artist.name like= :filter or music.name like :filter")
	List<Music> findByFilter(@Param("filter") String filter);

}
