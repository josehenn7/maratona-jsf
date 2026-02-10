package br.com.maratonajsf.bean.login;

import br.com.maratonajsf.model.Estudante;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.util.Arrays.asList;

@Named
@SessionScoped
public class LoginBean implements Serializable {
    private String nome;
    private String senha;
    private Estudante estudante;
    private List<Locale> localeList = asList(new Locale("en"), new Locale("pt"));
    private String language;
    private int qtdDeMensagens;

    public String logar(){
        // faz busca no banco
        if(nome.equals("w") && senha.equals("1")){
            estudante = new Estudante();
            qtdDeMensagens++;
            return "/restricted/iniciosistema.xhtml?faces-redirect=true";
        }
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new
                FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario e/ou senha invalidos", ""));
        return null;
    }

    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        estudante = null;
        return "/login?faces-redirect=true";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public List<Locale> getLocaleList() {
        return localeList;
    }

    public void setLocaleList(List<Locale> localeList) {
        this.localeList = localeList;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getQtdDeMensagens() {
        return qtdDeMensagens;
    }

    public void setQtdDeMensagens(int qtdDeMensagens) {
        this.qtdDeMensagens = qtdDeMensagens;
    }
}
