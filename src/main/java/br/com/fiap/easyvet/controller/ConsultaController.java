package br.com.fiap.easyvet.controller;

import br.com.fiap.easyvet.model.Consulta;
import br.com.fiap.easyvet.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "consulta")
public class ConsultaController {

    public ConsultaController(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @Autowired
    private ConsultaRepository consultaRepository;

    @GetMapping
    public List<Consulta> listar(){
        return consultaRepository.findAll();
    }

    @GetMapping("{id}")
    public Consulta buscar(@PathVariable int id) {
        return consultaRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Consulta cadastrar(@RequestBody Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    @PutMapping("{id}")
    public Consulta atualizar(@RequestBody Consulta consulta, @PathVariable int id) {
        consulta.setId(id);
        return consultaRepository.save(consulta);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        consultaRepository.deleteById(id);
    }
}
