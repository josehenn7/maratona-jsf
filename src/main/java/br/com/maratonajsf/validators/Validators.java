package br.com.maratonajsf.validators;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class Validators implements Serializable {
    private List<String> emailsDB = asList("josehenn7@gmail.com", "josehenn999@gmail.com");

    public void validateDuplicatedEmail(FacesContext facesContext, UIComponent uiComponent, Object o)
            throws ValidatorException {
        String email = (String) o;
        if(emailsDB.contains(email)){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "O email já está cadastrado",
                    "");
            throw new ValidatorException(message);
        }

    }
}
