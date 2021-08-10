package com.cg.aps.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.VisitorEntity;

@Repository
public interface VisitorRepository extends JpaRepository<VisitorEntity, Integer>{

	Optional<VisitorEntity> findByName(String name);

	

}
