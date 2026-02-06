package br.com.maratonajsf.bean.comunicacao;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ComunicacaoResultadoTesteBean implements Serializable {
    private String nome;
    private String sobrenome;

    public void init(){
        System.out.println("Criou comunicao resultado");
        System.out.println(nome);
        System.out.println(sobrenome);
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
}
