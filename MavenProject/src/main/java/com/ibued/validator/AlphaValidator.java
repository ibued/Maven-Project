package com.ibued.validator;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author ibued
 */
@Named
@RequestScoped
public class AlphaValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (!StringUtils.isAlphaSpace((String) value)) {
            HtmlInputText hit = (HtmlInputText) component;
            FacesMessage facesMessage = new FacesMessage(hit.getLabel()
                    +": Masukkan Karakter Huruf !!!");
            throw new ValidatorException(facesMessage);
        }        
    } 
    
}
