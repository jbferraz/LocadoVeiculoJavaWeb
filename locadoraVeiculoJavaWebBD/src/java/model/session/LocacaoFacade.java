/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Locacao;

/**
 *
 * @author jairb
 */
@Stateless
public class LocacaoFacade extends AbstractFacade<Locacao> {

    @PersistenceContext(unitName = "locadoraVeiculoJavaWebBDPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LocacaoFacade() {
        super(Locacao.class);
    }
    
}
