package br.com.maratonajsf.bean.comunicacao;

import org.omnifaces.cdi.Param;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named
@ViewScoped
public class ComunicacaoTeste3Bean implements Serializable {
    private String nome;
    private String sobrenome;
    private Date data;

    public void init() {
        System.out.println("Criou comunicao 3");
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(data);
    }

    public String save() {
        System.out.println("Salvando");
        return "resultado?faces-redirect=true&amp;includeViewParams=true";
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
