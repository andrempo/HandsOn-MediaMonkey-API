package com.handson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.handson.domain.Artist;
@RepositoryRestResource
public interface ArtistRepository extends JpaRepository<Artist, String> {

}
