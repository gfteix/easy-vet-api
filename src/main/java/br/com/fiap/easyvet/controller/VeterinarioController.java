package br.com.fiap.easyvet.controller;

import br.com.fiap.easyvet.model.Veterinario;
import br.com.fiap.easyvet.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "veterinario")
public class VeterinarioController {

    public VeterinarioController(VeterinarioRepository veterinarioRepository) {
        this.veterinarioRepository = veterinarioRepository;
    }

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @GetMapping
    public List<Veterinario> listar(){
        return veterinarioRepository.findAll();
    }

    @GetMapping("{id}")
    public Veterinario buscar(@PathVariable int id) {
        return veterinarioRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Veterinario cadastrar(@RequestBody Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }

    @PutMapping("{id}")
    public Veterinario atualizar(@RequestBody Veterinario veterinario, @PathVariable int id) {
        veterinario.setId(id);
        return veterinarioRepository.save(veterinario);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        veterinarioRepository.deleteById(id);
    }
}
