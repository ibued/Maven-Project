package com.ibued.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.EmailValidator;

/**
 *
 * @author ibued
 */
@FacesValidator(value = "emailValidator")
public class ValidasiEmail implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        EmailValidator emailValidator = EmailValidator.getInstance();

        HtmlInputText htmlInputText = (HtmlInputText) component;

        String email = (String) value;

        if (!StringUtils.isEmpty(email)) {
            if (!emailValidator.isValid(email)) {
                FacesMessage facesMessage = new FacesMessage(htmlInputText.
                        getLabel()
                        + ": email format is not valid");
                throw new ValidatorException(facesMessage);
            }
        }
    }
}
