package gerenciadorcarrodealuguel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class Operacao {

    String tipoOperacao;
    Collection<Carro> carros = new HashSet<>();
    double valor;
    BancoDeDados bd = new BancoDeDados();
    Carro c = new Carro();

    @Override
    public String toString() {
        return "Operacao: " + tipoOperacao;
    }

    public void cadastrar() {
        setTipoOperacao("***COMPRA***");
        getTipoOperacao();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a marca: ");
        c.marca = input.nextLine();
        System.out.print("Digite o modelo: ");
        c.modelo = input.next();
        System.out.print("Digite o ano: ");
        c.ano = input.next();
        System.out.print("Digite a placa: ");
        c.placa = input.next();
        System.out.print("Digite o tipo: ");
        c.tipo = input.next();
        System.out.print("Digite a kilometragem: ");
        c.kilometragem = input.nextFloat();
        System.out.print("Nivel do tanque: ");
        c.tanque = input.next();
        c.disponibilidade = true;
        disponibilidade();
        bd.addCarros(c);
        carros.add(c);
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    void disponibilidade() {
        if (c.isDisponibilidade() == false) {
            System.out.println("\t O VEÍCULO " + c.getMarca().toUpperCase() + " NÃO ESTÁ DISPONÍVEL PARA LOCAÇÃO!\n");
        } else {
            System.out.println("\tO VEÍCULO " + c.getMarca().toUpperCase() + " ESTÁ DISPONÍVEL PARA LOCAÇÃO!\n");
        }
    }

    public void venda() {
        setTipoOperacao("***VENDA***");
        System.out.println(getTipoOperacao());
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a placa do veiculo: ");
        String placa = input.next();
        System.out.print("Digite o valor do veiculo: ");
        this.valor = input.nextDouble();
        c = bd.findByCarro(placa);
        if (c != null) {
            c.setDisponibilidade(false);
            System.out.println("\tVeiculo " + c.getMarca() + " foi vendido com sucesso!");
            System.out.println("\tHora da Venda:" + getDateTime());
            disponibilidade();
            bd.removeCarro(c);
            carros.remove(c);
        } else {
            System.out.println("Veiculo nao encontrado!");
        }
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
