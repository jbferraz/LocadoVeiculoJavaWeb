/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JairFerraz
 */
public class Locacao {

    int idLocacao;
    int Cliente_idCliente;
    int Veiculo_idVeiculo;
    String dataLocacao;
    String dataRetirada;
    String dataDevolucao;
    int kmRetirada;
    int kmDevolucao;
    boolean kmLivre;
    boolean status;
    
    public Locacao() {
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public int getCliente_idCliente() {
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(int Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }

    public int getVeiculo_idVeiculo() {
        return Veiculo_idVeiculo;
    }

    public void setVeiculo_idVeiculo(int Veiculo_idVeiculo) {
        this.Veiculo_idVeiculo = Veiculo_idVeiculo;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getKmRetirada() {
        return kmRetirada;
    }

    public void setKmRetirada(int kmRetirada) {
        this.kmRetirada = kmRetirada;
    }

    public int getKmDevolucao() {
        return kmDevolucao;
    }

    public void setKmDevolucao(int kmDevolucao) {
        this.kmDevolucao = kmDevolucao;
    }

    public boolean isKmLivre() {
        return kmLivre;
    }

    public void setKmLivre(boolean kmLivre) {
        this.kmLivre = kmLivre;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Locacao{" + "idLocacao=" + idLocacao + ", Cliente_idCliente=" + Cliente_idCliente + ", Veiculo_idVeiculo=" + Veiculo_idVeiculo + ", dataLocacao=" + dataLocacao + ", dataRetirada=" + dataRetirada + ", dataDevolucao=" + dataDevolucao + ", kmRetirada=" + kmRetirada + ", kmDevolucao=" + kmDevolucao + ", kmLivre=" + kmLivre + ", status=" + status + '}';
    }
    
}
