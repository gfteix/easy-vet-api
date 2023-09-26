package br.com.fiap.easyvet.model;


import javax.persistence.*;


@Entity
@SequenceGenerator(name="cliente", sequenceName = "SQ_CLIENTE", allocationSize = 1)
public class Cliente {

    public Cliente() {

    }
    public Cliente(int id, String nome, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }
    public Cliente(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
    private int id;

    @Column(length = 60)
    private String nome;

    @Column(length = 255)
    private String email;

    @Embedded
    private Endereco endereco;
}


