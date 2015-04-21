/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author Bryce
 */
@Named(value = "choiceController")
@RequestScoped
public class ChoiceController {

    @ManagedProperty(value="#{param.type}")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    public String generate()
    {
        String link = "index.xhtml?type=" + type + "&faces-redirect=true";
        return link;
    }
    
    /**
     * Creates a new instance of ChoiceController
     */
    public ChoiceController() {
    }

}
