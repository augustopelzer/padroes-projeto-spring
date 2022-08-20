package one.digitalinnovation.gof.model.form;

public class VeiculoForm {
    private Long clienteId;
    private String placa;
    private String cor;
    private String tipo;
    private String modelo;
    private String marca;

    public VeiculoForm(){}

    public VeiculoForm(Long clienteId, String placa, String cor, String tipo, String modelo, String marca) {
        this.clienteId = clienteId;
        this.placa = placa;
        this.cor = cor;
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
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
}
