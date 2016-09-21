/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import model.Locacao;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


/**
 *
 * @author JairFerraz
 */

@Named
@ApplicationScoped
public class LocacaoMB {

    //CRUD
    private List<Locacao> listaLocacoes;
    private Locacao locacaoSelecionado;

    public LocacaoMB() {
        locacaoSelecionado = new Locacao();
        listaLocacoes = new ArrayList<Locacao>();
       // listaVeiculos.add(new Veiculo("admin", "admin"));
    }
    
    public Locacao getLocacaoSelecionado() {
        return locacaoSelecionado;
    }

    public void setLocacaoSelecionado(Locacao locacaoSelecionado) {
        this.locacaoSelecionado = locacaoSelecionado;
    }

    public List<Locacao> getListaVeiculos() {
        return listaLocacoes;
    }

    public void setListaLocacoes(List<Locacao> listaLocacoes) {
        this.listaLocacoes = listaLocacoes;
    }
    

    public String novoLocacao(){
        locacaoSelecionado=new Locacao();
        return("/admin/formularioLocacao?faces-redirect=true");
    }

    public String adicionarLocacao()
    {
        listaLocacoes.add(locacaoSelecionado);
        return(this.novoLocacao());
    }

    public String editarLocacao(Locacao u){
        locacaoSelecionado = u;
        return("/admin/edicaoLocacao?faces-redirect=true");
    }
    public String atualizarLocacao()
    {
        return("/admin/listaLocacoes?faces-redirect=true");
    }

    public void removerLocacao(Locacao locacao){
        listaLocacoes.remove(locacao);
    }

}