package br.com.maratonajsf.bean.flowbuilder;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@FlowScoped(value = "newpendencies")
public class TesteFlowBuilderNestedBean implements Serializable {
    private String username;
    private String usersurname;

    public String validarUser(){
        System.out.println("Fazendo consulta no SERASA");
        System.out.println("Fazendo consulta no SPC");
        System.out.println("Pedindo permissao");
//        if(true){
//            FacesContext context = FacesContext.getCurrentInstance();
//            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario nao passou nas pendencias", "Algum detalhe"));
//            return null;
//        }
        return "proceedToNewRegistration3";
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersurname() {
        return usersurname;
    }

    public void setUsersurname(String usersurname) {
        this.usersurname = usersurname;
    }
}
