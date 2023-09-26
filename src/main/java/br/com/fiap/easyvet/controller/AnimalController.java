package br.com.fiap.easyvet.controller;

import br.com.fiap.easyvet.model.Animal;
import br.com.fiap.easyvet.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "animal")
public class AnimalController {

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    public List<Animal> listar(){
        return animalRepository.findAll();
    }

    @GetMapping("{id}")
    public Animal buscar(@PathVariable int id) {
        return animalRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Animal cadastrar(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @PutMapping("{id}")
    public Animal atualizar(@RequestBody Animal animal, @PathVariable int id) {
        animal.setId(id);
        return animalRepository.save(animal);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        animalRepository.deleteById(id);
    }
}
