package com.senai.introducao.repository;

import com.senai.introducao.domain.Studant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudantRepository extends JpaRepository<Studant, Long> {
}
