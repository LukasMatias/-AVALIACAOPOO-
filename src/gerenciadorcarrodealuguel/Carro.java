package gerenciadorcarrodealuguel;

public class Carro {

    String marca;
    String modelo;
    String ano;
    String placa;
    String tipo;
    float kilometragem;
    String tanque;
    boolean disponibilidade = false;

    public Carro() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Carro) {
            Carro c = (Carro) obj;
            if (this.placa.equals(c.placa)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return placa.hashCode();
    }

    @Override
    public String toString() {
        return "marca: " + marca + "\n"
                + "modelo: " + modelo + "\n"
                + "ano : " + ano + "\n"
                + "placa : " + placa + "\n"
                + "tipo : " + tipo + "\n"
                + "kilometragem : " + kilometragem + "\n"
                + "tanque : " + tanque + "\n"
                + "disponibilidade : " + disponibilidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(float kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getTanque() {
        return tanque;
    }

    public void setTanque(String tanque) {
        this.tanque = tanque;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
