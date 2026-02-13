package br.com.maratonajsf.bean.beanvalidation;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.*;
import java.io.Serializable;

@Named
@ViewScoped
public class BeanValidationTestBean implements Serializable {
    @Size(max = 10, message = "O nome precisa ter no máximo 10 caracteres")
    @NotNull(message = "O nome não pode ser nulo")
    private String nome;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
            message = "O email deve ser válido")
    private String email;
    @DecimalMax(value = "30.50", message = "O número deve ser menor ou igual a 30.50")
    @DecimalMin(value = "5.0", message = "O número deve ser maior ou igual a 5.00")
    private double decimal;
    @Digits(integer = 3, fraction = 2, message = "O número deve ter no máximo 3 dígitos inteiros e 2 dígitos decimais")
    private double number;


    public void salvar(){
        System.out.println(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
