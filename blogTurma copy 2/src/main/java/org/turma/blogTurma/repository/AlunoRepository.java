package org.turma.blogTurma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.turma.blogTurma.model.Aluno;
import org.turma.blogTurma.model.Turma;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	public List<Aluno> findAllByNomeContainingIgnoreCase(String nome);

}
