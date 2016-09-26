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
       listaVeiculos.add(new Veiculo("GM", "CELTA", "ABC1234", "AZUL", "COMPLETO", 1, 100, 2010));
       listaVeiculos.add(new Veiculo("FORD", "KA", "ITH1234", "AZUL", "COMPLETO", 2, 150, 2015));
       listaVeiculos.add(new Veiculo("VW", "GOL", "XXX2020", "AZUL", "COMPLETO", 1, 120, 2012));
       listaVeiculos.add(new Veiculo("FIAT", "UNO", "OPA1020", "AZUL", "COMPLETO", 1, 80, 2009));
       
    }
    
    public Veiculo getVeiculoSelecionado() {
        return veiculoSelecionado;
    }

    public void setVeiculoSelecionado(Veiculo veiculoSelecionado) {
        this.veiculoSelecionado = veiculoSelecionado;
    }

    public  List<Veiculo> getListaVeiculos() {
        List<Veiculo> veiculosLivres = new ArrayList<Veiculo>();
        for(Veiculo veiculo : listaVeiculos){
                if(veiculo.getLocadoString()=="Livre"){
                        veiculosLivres.add(veiculo);
                }
        }
        return veiculosLivres;
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
        veiculoSelecionado.setLocado(false);
        return("/admin/listaVeiculos?faces-redirect=true");
    }

    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }
    public String reservarVeiculo(Veiculo u)
    {
        veiculoSelecionado = u;
        return ("/usuario/locacaoVeiculo?faces-redirect=true");
    }
    public String confirmarVeiculo()
    {
        return("/usuario/listaLocacao?faces-redirect=true");
    }
}