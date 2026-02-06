package br.com.maratonajsf.bean.estudante;

import br.com.maratonajsf.model.Estudante;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named // ("QualquerNome")
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Array", "Devdojo", "José"};
    private List<String> nomesList = asList("List", "Henn", "Test");
    private Set<String> nomesSet = new HashSet<>(asList("Set", "Fodase"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas = false;
    private boolean mostrarLink;

    {
        nomesMap.put("Henn", "José");
    }

    public void exibirNotas() {
        this.mostrarNotas = true;
    }

    public void esconderNotas() {
        this.mostrarNotas = false;
    }

    public void exibirLink() {
        this.mostrarLink = true;
    }

    public void esconderLink() {
        this.mostrarLink = false;
    }

    public void calcularCubo(LambdaExpression le, long value){
        long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
        System.out.println(result);
    }


    public void executar() {
        System.out.println("Fazendo busca no banco de dados");
        System.out.println("Processando dados");
        System.out.println("Exibindo dados");
    }

    public void executar(String param) {
        System.out.println("Fazendo busca no banco de dados com o PARAMETRO " + param);
        System.out.println("Processando dados");
        System.out.println("Exibindo dados");
    }

    public String executarRetorno(String param) {
        return "Param -> " + param;
    }

    public String irParaIndex2() {
        return "index2?faces-redirect=true";
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }
}
