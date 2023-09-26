package br.com.fiap.easyvet.repository;

import br.com.fiap.easyvet.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}