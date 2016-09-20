/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author AssisBrasil
 */
public class Veiculo {

    String marca;
    String modelo;
    String placa;
    String cor;
    String opcionais;
    int valorKm;
    int valorDia;
    int kmRetirada;
    int kmDevolucao;
    int ano;
    boolean ativo;
    boolean locado;

    public Veiculo() {
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the opcionais
     */
    public String getOpcionais() {
        return opcionais;
    }

    /**
     * @param opcionais the opcionais to set
     */
    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    /**
     * @return the valorKm
     */
    public int getValorKm() {
        return valorKm;
    }

    /**
     * @param valorKm the valorKm to set
     */
    public void setValorKm(int valorKm) {
        this.valorKm = valorKm;
    }

    /**
     * @return the valorDia
     */
    public int getValorDia() {
        return valorDia;
    }

    /**
     * @param valorDia the valorDia to set
     */
    public void setValorDia(int valorDia) {
        this.valorDia = valorDia;
    }

    /**
     * @return the kmRetirada
     */
    public int getKmRetirada() {
        return kmRetirada;
    }

    /**
     * @param kmRetirada the kmRetirada to set
     */
    public void setKmRetirada(int kmRetirada) {
        this.kmRetirada = kmRetirada;
    }

    /**
     * @return the kmDevolucao
     */
    public int getKmDevolucao() {
        return kmDevolucao;
    }

    /**
     * @param kmDevolucao the kmDevolucao to set
     */
    public void setKmDevolucao(int kmDevolucao) {
        this.kmDevolucao = kmDevolucao;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the locado
     */
    public boolean isLocado() {
        return locado;
    }

    /**
     * @param locado the locado to set
     */
    public void setLocado(boolean locado) {
        this.locado = locado;
    }
    public String getLocadoString() {
        if(locado==true) return "Locado";
        else return "Livre";
    }
    
}
