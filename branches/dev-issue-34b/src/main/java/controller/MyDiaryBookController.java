/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.EntriesListDao;
import dao.EntryDao;
import model.Entry;

/**
 *
 * @author Zarc
 */
public class MyDiaryBookController {
    
    public MyDiaryBookController()
    {
    }
    
    public Entry getEntry(String entryTitle)
    {
        return EntryDao.getEntryByTitle(entryTitle);
    }
}
