/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

/**
 *
 * @author alex
 */
public class PersonalGoalLayoutFileFilter {
    

    boolean isDefault;

    String description;
    String extension;

    public PersonalGoalLayoutFileFilter() {

    }

    public PersonalGoalLayoutFileFilter(String description, String extension,
            boolean isDefault) {
        this.description = description;
        this.extension = extension;
        this.isDefault = isDefault;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }


}
