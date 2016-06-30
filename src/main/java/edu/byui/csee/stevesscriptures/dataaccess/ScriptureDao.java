/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.csee.stevesscriptures.dataaccess;

import edu.byui.csee.stevesscriptures.core.Scripture;
import java.util.List;

/**
 *
 * @author sburton
 */
public interface ScriptureDao {

    public boolean addNewScripture(Scripture s);
    public Scripture getScripture(int id);
    public Scripture getScripture(String Book, int chapter, int verse);
    
    public List<Scripture> searchScriptures(String searchQuery);
    public List<Scripture> listAll();
    
    public boolean updateScripture(Scripture s);
    public boolean deleteScripture(Scripture s);    
}
