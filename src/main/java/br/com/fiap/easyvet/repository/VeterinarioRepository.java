package br.com.fiap.easyvet.repository;

import br.com.fiap.easyvet.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {
}
