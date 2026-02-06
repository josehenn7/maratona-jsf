package br.com.maratonajsf.bean.application;

import br.com.maratonajsf.bean.dependent.TesteDependentBean;
import br.com.maratonajsf.bean.session.TesteSessionBean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {
    private List<String> categoriaList;
    private final TesteDependentBean dependentBean;
    private final TesteSessionBean sessionBean;

    @Inject
    public TesteApplicationBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init(){
        System.out.println("Entrou no PostConstruct do ApplicationScoped");
        categoriaList = asList("RPG", "Sci-Fi", "Terror");
        dependentBean.getCategoriaList().addAll(asList("Comédia", "Romance"));
        sessionBean.selecionarPersonagem();
    }

    public void mudarLista(){
        categoriaList = asList("RPG", "Sci-Fi", "Terror", "Porn");
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }

    public TesteSessionBean getSessionBean() {
        return sessionBean;
    }
}
