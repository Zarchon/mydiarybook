/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.io.File;

/**
 *
 * @author JohnN'y
 */
public class MockFileNoExist implements IDeleteEntriesDao {

        private String textFile = new String("text.txt");

    @Override
    public String getFile() {
        return null;
    }

   

    @Override
    public void setFile(String textFile) {
        this.textFile = textFile;
    }

    @Override
    public boolean findFile(String textFile) {
        return false;
    }
    
}
