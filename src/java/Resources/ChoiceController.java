/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Bryce
 */
@Named(value = "choiceController")
@RequestScoped
public class ChoiceController {

    // 0 for TV/Movie, 1 for Book/Comic, 2 for Audio
    private int chosenType;

    public int getChosenType() {
        return chosenType;
    }

    public void setChosenType(String chosenType) {
        switch (chosenType) {
            case "TV/Movie": {
                this.chosenType = 0;
            }
            case "Book/Comic": {
                this.chosenType = 1;
            }
            case "Audio": {
                this.chosenType = 2;
            }
            default: {
                this.chosenType = 0;
            }
        }
    }

    /**
     * Creates a new instance of ChoiceController
     */
    public ChoiceController() {
    }

}
