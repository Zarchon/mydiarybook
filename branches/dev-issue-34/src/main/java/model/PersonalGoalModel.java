/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;
import javax.swing.JSpinner;

/**
 *
 * @author alex
 */
public class PersonalGoalModel {
    
    private String personalGoalTitle;
    private String personalGoalLocation;
    private String personalGoalWithPerson;
    private Date personalGoalWhenDate;
    private String personalGoalAnnouncement;

    public String getPersonalGoalTitle() {
        return personalGoalTitle;
    }

    public void setPersonalGoalTitle(String personalGoalTitle) {
        this.personalGoalTitle = personalGoalTitle;
    }

    public String getPersonalGoalLocation() {
        return personalGoalLocation;
    }

    public void setPersonalGoalLocation(String personalGoalLocation) {
        this.personalGoalLocation = personalGoalLocation;
    }

    public String getPersonalGoalWithPerson() {
        return personalGoalWithPerson;
    }

    public void setPersonalGoalWithPerson(String personalGoalWithPerson) {
        this.personalGoalWithPerson = personalGoalWithPerson;
    }

    public Date getPersonalGoalWhenDate() {
        return personalGoalWhenDate;
    }

    public void setPersonalGoalWhenDate(Date personalGoalWhenDate) {
        this.personalGoalWhenDate = personalGoalWhenDate;
    }

    public String getPersonalGoalAnnouncement() {
        return personalGoalAnnouncement;
    }

    public void setPersonalGoalAnnouncement(String personalGoalAnnouncement) {
        this.personalGoalAnnouncement = personalGoalAnnouncement;
    }

   
    
    
    
}
