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
public class Locacao extends Veiculo {

    private int idLocacao;
    private int Cliente_idCliente;
    private int Veiculo_idVeiculo;
    private int kmRetirada;
    private int kmDevolucao;
    private int ano_Veiculo;
    private int valorDia_Veiculo;
    private int valorKm_Veiculo;    
    private String op_Veiculo;
    private String placa_Veiculo;
    private String modelo_Veiculo;
    private String id_Cliente;
    private String dataLocacao;
    private String dataRetirada;
    private String dataDevolucao;
    private boolean kmLivre;
    private boolean status;
    private boolean reservado;

    public Locacao() {
    }

    @Override
    public String toString() {
        return "Locacao{" + "idLocacao=" + getIdLocacao() + ", Cliente_idCliente=" + getCliente_idCliente() + ", Veiculo_idVeiculo=" + getVeiculo_idVeiculo() + ", dataLocacao=" + getDataLocacao() + ", dataRetirada=" + getDataRetirada() + ", dataDevolucao=" + getDataDevolucao() + ", kmRetirada=" + getKmRetirada() + ", kmDevolucao=" + getKmDevolucao() + ", kmLivre=" + isKmLivre() + ", status=" + isStatus() + '}';
    }

    /**
     * @return the idLocacao
     */
    public int getIdLocacao() {
        return idLocacao;
    }

    /**
     * @param idLocacao the idLocacao to set
     */
    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    /**
     * @return the Cliente_idCliente
     */
    public int getCliente_idCliente() {
        return Cliente_idCliente;
    }

    /**
     * @param Cliente_idCliente the Cliente_idCliente to set
     */
    public void setCliente_idCliente(int Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }

    /**
     * @return the Veiculo_idVeiculo
     */
    public int getVeiculo_idVeiculo() {
        return Veiculo_idVeiculo;
    }

    /**
     * @param Veiculo_idVeiculo the Veiculo_idVeiculo to set
     */
    public void setVeiculo_idVeiculo(int Veiculo_idVeiculo) {
        this.Veiculo_idVeiculo = Veiculo_idVeiculo;
    }

    /**
     * @return the placa_Veiculo
     */
    public String getPlaca_Veiculo() {
        return placa_Veiculo;
    }

    /**
     * @param placa_Veiculo the placa_Veiculo to set
     */
    public void setPlaca_Veiculo(String placa_Veiculo) {
        this.placa_Veiculo = placa_Veiculo;
    }

    /**
     * @return the modelo_Veiculo
     */
    public String getModelo_Veiculo() {
        return modelo_Veiculo;
    }

    /**
     * @param modelo_Veiculo the modelo_Veiculo to set
     */
    public void setModelo_Veiculo(String modelo_Veiculo) {
        this.modelo_Veiculo = modelo_Veiculo;
    }

    /**
     * @return the id_Cliente
     */
    public String getId_Cliente() {
        return id_Cliente;
    }

    /**
     * @param id_Cliente the id_Cliente to set
     */
    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    /**
     * @return the dataLocacao
     */
    public String getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return the dataRetirada
     */
    public String getDataRetirada() {
        return dataRetirada;
    }

    /**
     * @param dataRetirada the dataRetirada to set
     */
    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the kmRetirada
     */
    @Override
    public int getKmRetirada() {
        return kmRetirada;
    }

    /**
     * @param kmRetirada the kmRetirada to set
     */
    @Override
    public void setKmRetirada(int kmRetirada) {
        this.kmRetirada = kmRetirada;
    }

    /**
     * @return the kmDevolucao
     */
    @Override
    public int getKmDevolucao() {
        return kmDevolucao;
    }

    /**
     * @param kmDevolucao the kmDevolucao to set
     */
    @Override
    public void setKmDevolucao(int kmDevolucao) {
        this.kmDevolucao = kmDevolucao;
    }

    /**
     * @return the kmLivre
     */
    public boolean isKmLivre() {
        return kmLivre;
    }

    /**
     * @param kmLivre the kmLivre to set
     */
    public void setKmLivre(boolean kmLivre) {
        this.kmLivre = kmLivre;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the ano_Veiculo
     */
    public int getAno_Veiculo() {
        return ano_Veiculo;
    }

    /**
     * @param ano_Veiculo the ano_Veiculo to set
     */
    public void setAno_Veiculo(int ano_Veiculo) {
        this.ano_Veiculo = ano_Veiculo;
    }

    /**
     * @return the op_Veiculo
     */
    public String getOp_Veiculo() {
        return op_Veiculo;
    }

    /**
     * @param op_Veiculo the op_Veiculo to set
     */
    public void setOp_Veiculo(String op_Veiculo) {
        this.op_Veiculo = op_Veiculo;
    }

    /**
     * @return the valorDia_Veiculo
     */
    public int getValorDia_Veiculo() {
        return valorDia_Veiculo;
    }

    /**
     * @param valorDia_Veiculo the valorDia_Veiculo to set
     */
    public void setValorDia_Veiculo(int valorDia_Veiculo) {
        this.valorDia_Veiculo = valorDia_Veiculo;
    }

    /**
     * @return the valorKm_Veiculo
     */
    public int getValorKm_Veiculo() {
        return valorKm_Veiculo;
    }

    /**
     * @param valorKm_Veiculo the valorKm_Veiculo to set
     */
    public void setValorKm_Veiculo(int valorKm_Veiculo) {
        this.valorKm_Veiculo = valorKm_Veiculo;
    }

    /**
     * @return the reservado
     */
    public boolean isReservado() {
        return reservado;
    }

    /**
     * @param reservado the reservado to set
     */
    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
    public String getReservadoString() {
        if(reservado==true) return "Reservado";
        else return "Livre";
    }

}
