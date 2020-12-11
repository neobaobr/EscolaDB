package org.turma.blogTurma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turma.blogTurma.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
	public List<Turma> findAllByDescricaoContainingIgnoreCase(String descricao);

}
