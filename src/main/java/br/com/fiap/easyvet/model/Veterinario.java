package br.com.fiap.easyvet.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="veterinario", sequenceName = "SQ_VETERINARIO", allocationSize = 1)
public class Veterinario {

    public Veterinario() {

    }
    public Veterinario(int id, String nome, String email, String especialidade, String especies, boolean atendeDomicilio, boolean atendeEmergencias, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.especialidade = especialidade;
        this.especies = especies;
        this.atendeDomicilio = atendeDomicilio;
        this.atendeEmergencias = atendeEmergencias;
        this.endereco = endereco;
    }

    public Veterinario(String nome, String email, String especialidade, String especies, boolean atendeDomicilio, boolean atendeEmergencias, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.especialidade = especialidade;
        this.especies = especies;
        this.atendeDomicilio = atendeDomicilio;
        this.atendeEmergencias = atendeEmergencias;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecies() {
        return especies;
    }

    public void setEspecies(String especies) {
        this.especies = especies;
    }

    public boolean isAtendeDomicilio() {
        return atendeDomicilio;
    }

    public void setAtendeDomicilio(boolean atendeDomicilio) {
        this.atendeDomicilio = atendeDomicilio;
    }

    public boolean isAtendeEmergencias() {
        return atendeEmergencias;
    }

    public void setAtendeEmergencias(boolean atendeEmergencias) {
        this.atendeEmergencias = atendeEmergencias;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veterinario")
    private int id;

    @Column(length = 60, name = "nome")
    private String nome;

    @Column(length = 60, name = "email")
    private String email;

    @Column(length = 60, name = "especialidade")
    private String especialidade;

    @Column(length = 60, name = "especies")
    private String especies;

    private boolean atendeDomicilio;

    private boolean atendeEmergencias;

    @Embedded
    private Endereco endereco;
}
