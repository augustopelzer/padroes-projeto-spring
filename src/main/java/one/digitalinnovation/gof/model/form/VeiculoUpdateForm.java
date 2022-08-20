package one.digitalinnovation.gof.model.form;

public class VeiculoUpdateForm {
    private String cor;
    private String tipo;
    private String modelo;
    private String marca;

    public VeiculoUpdateForm(){

    }

    public VeiculoUpdateForm(String cor, String tipo, String modelo, String marca) {
        this.cor = cor;
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
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
