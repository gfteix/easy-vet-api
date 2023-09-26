package br.com.fiap.easyvet.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@SequenceGenerator(name="consulta", sequenceName = "SQ_CONSULTA", allocationSize = 1)
public class Consulta {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }

    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDomicilio() {
        return domicilio;
    }

    public void setDomicilio(boolean domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isEmergencia() {
        return emergencia;
    }

    public void setEmergencia(boolean emergencia) {
        this.emergencia = emergencia;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }

    public Consulta() {

    }
    public Consulta(int id, Cliente cliente, Animal animal, Veterinario veterinario, double preco, boolean cancelado, String motivoCancelamento, String descricao, boolean domicilio, boolean emergencia, Date data, Date horarioInicio, Date horarioFim) {
        this.id = id;
        this.cliente = cliente;
        this.animal = animal;
        this.veterinario = veterinario;
        this.preco = preco;
        this.cancelado = cancelado;
        this.motivoCancelamento = motivoCancelamento;
        this.descricao = descricao;
        this.domicilio = domicilio;
        this.emergencia = emergencia;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    public Consulta(Cliente cliente, Animal animal, Veterinario veterinario, double preco, boolean cancelado, String motivoCancelamento, String descricao, boolean domicilio, boolean emergencia, Date data, Date horarioInicio, Date horarioFim) {
        this.cliente = cliente;
        this.animal = animal;
        this.veterinario = veterinario;
        this.preco = preco;
        this.cancelado = cancelado;
        this.motivoCancelamento = motivoCancelamento;
        this.descricao = descricao;
        this.domicilio = domicilio;
        this.emergencia = emergencia;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consulta")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_animal", nullable = false)
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "id_veterinario", nullable = false)
    private Veterinario veterinario;

    private double preco;
    private boolean cancelado;
    private String motivoCancelamento;
    private String descricao;
    private boolean domicilio;
    private boolean emergencia;
    private Date data;
    private Date horarioInicio;
    private Date horarioFim;
}