package one.digitalinnovation.gof.model;

import javax.persistence.*;

@Entity
public class Veiculo {
    @Id
    private String placa;
    private String cor;
    private String tipo;
    private String modelo;
    private String marca;

    @ManyToOne
    private Cliente cliente;

    public Veiculo(){

    }

    public Veiculo(String placa, String cor, String tipo, String modelo, String marca, Cliente cliente) {
        this.placa = placa;
        this.cor = cor;
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.cliente = cliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
