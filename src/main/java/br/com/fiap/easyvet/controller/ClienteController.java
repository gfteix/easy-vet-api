package br.com.fiap.easyvet.controller;

import br.com.fiap.easyvet.model.Cliente;
import br.com.fiap.easyvet.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @GetMapping("{id}")
    public Cliente buscar(@PathVariable int id) {
        return clienteRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        System.out.println(cliente.getEndereco());
        return clienteRepository.save(cliente);
    }

    @PutMapping("{id}")
    public Cliente atualizar(@RequestBody Cliente cliente, @PathVariable int id) {
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id) {
        clienteRepository.deleteById(id);
    }
}
