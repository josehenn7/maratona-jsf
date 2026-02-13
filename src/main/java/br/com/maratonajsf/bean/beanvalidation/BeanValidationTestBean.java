package br.com.maratonajsf.bean.beanvalidation;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Named
@ViewScoped
public class BeanValidationTestBean implements Serializable {
    @Size(min = 3, max = 10, message = "O nome precisa no mínimo 3 caracteres e máximo 10 caracteres")
    public String nome;

    public void salvar(){
        System.out.println(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
