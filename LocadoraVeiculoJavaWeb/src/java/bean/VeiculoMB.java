/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import model.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


/**
 *
 * @author AssisBrasil
 */

@Named
@ApplicationScoped
public class VeiculoMB {

    //CRUD
    private List<Veiculo> listaVeiculos;
    private Veiculo veiculoSelecionado;

    public VeiculoMB() {
        veiculoSelecionado = new Veiculo();
        listaVeiculos = new ArrayList<Veiculo>();
       // listaVeiculos.add(new Veiculo("admin", "admin"));
    }
    
    public Veiculo getVeiculoSelecionado() {
        return veiculoSelecionado;
    }

    public void setVeiculoSelecionado(Veiculo veiculoSelecionado) {
        this.veiculoSelecionado = veiculoSelecionado;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
    

    public String novoVeiculo(){
        veiculoSelecionado=new Veiculo();
        return("/admin/formularioVeiculo?faces-redirect=true");
    }

    public String adicionarVeiculo()
    {
        listaVeiculos.add(veiculoSelecionado);
        return(this.novoVeiculo());
    }

    public String editarVeiculo(Veiculo u){
        veiculoSelecionado = u;
        return("/admin/edicaoVeiculo?faces-redirect=true");
    }
    public String atualizarVeiculo()
    {
        return("/admin/listaVeiculos?faces-redirect=true");
    }

    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }

}