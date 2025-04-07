package com.example.avaliacao02.repository;

import com.example.avaliacao02.model.Categoria;
import com.example.avaliacao02.model.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {
}