package br.com.fiap.easyvet.repository;

import br.com.fiap.easyvet.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
}
