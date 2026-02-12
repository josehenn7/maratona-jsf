package br.com.maratonajsf.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.List;

import static java.util.Arrays.asList;

@FacesValidator
public class DuplicatedEmailValidator implements Validator {
    private List<String> emailsDB = asList("josehenn7@gmail.com", "josehenn999@gmail.com");

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o)
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
