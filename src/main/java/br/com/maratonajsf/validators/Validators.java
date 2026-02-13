package br.com.maratonajsf.validators;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import javax.servlet.http.Part;
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

    public void validateFile(FacesContext facesContext, UIComponent uiComponent, Object o)
            throws ValidatorException {
        Part file = (Part) o;
        try{
            validateFileNameLenght(file);
            validateContentType(file);
            validateFileSize(file);

        } catch (RuntimeException e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    e.getMessage(),
                    "");
            throw new ValidatorException(message);
        }
        }

        private void validateFileNameLenght(Part file){
            if (file.getSubmittedFileName().length() > 10){
                throw new RuntimeException("O nome do arquivo deve conter no máximo 10 caracteres");
            }
        }

        private void validateContentType(Part file){
            String contentType = file.getContentType();
            if(!contentType.equals("image/png") && !contentType.equals("image/jpeg")){
                throw new RuntimeException("O arquivo deve ser do tipo PNG ou JPEG");
            }
        }

        private void validateFileSize(Part file){
            if(file.getSize() > 1024 * 1024){
                throw new RuntimeException("O arquivo deve conter no máximo 1MB");
            }
        }
    }

