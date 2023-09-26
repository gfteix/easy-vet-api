package br.com.fiap.easyvet.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="animal", sequenceName = "SQ_ANIMAL", allocationSize = 1)
public class Animal {
    public Animal () {

    }
    public Animal(int id, String nome, String raca, String especie, double peso, String porte, Cliente cliente) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.peso = peso;
        this.porte = porte;
        this.cliente = cliente;
    }

    public Animal(String nome, String raca, String especie, double peso, String porte, Cliente cliente) {
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.peso = peso;
        this.porte = porte;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public String getPorte() {
        return porte;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal")
    private int id;

    @Column(length = 60, name = "nome")
    private String nome;

    @Column(length = 30, name = "raca")
    private String raca;

    @Column(length = 60, name = "especie")
    private String especie;

    private double peso;

    @Column(length = 60, name = "porte")
    private String porte;

    @ManyToOne
    @JoinColumn(name="id_cliente", nullable=false)
    private Cliente cliente;
}
