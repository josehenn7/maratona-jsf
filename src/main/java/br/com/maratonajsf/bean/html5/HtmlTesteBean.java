package br.com.maratonajsf.bean.html5;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Named
@ViewScoped
public class HtmlTesteBean implements Serializable {
    private String email;
    private String url;
    private String nome;
    private int numero;

    public void toUpperCaseNome(){
        this.nome = this.nome.toUpperCase();
    }

    private Map<String, String> attributes = new HashMap<>();
    public void init(){
        attributes.put("type", "email");
        attributes.put("placeholder", "Digite seu email");
    }

    public void salvar(){
        System.out.println(email);
        System.out.println(url);
        System.out.println(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }
}
