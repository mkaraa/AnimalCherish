package com.team1.animalproject.repository;

import com.team1.animalproject.model.Yetki;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository ("yetkiRepository")
public interface YetkiRepository extends JpaRepository<Yetki, String> {

	List<Yetki> findByIdIn(List<String> ids);

	Optional<Yetki> findById(String id);
}
