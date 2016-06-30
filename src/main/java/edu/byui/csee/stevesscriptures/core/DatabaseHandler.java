/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.csee.stevesscriptures.core;

import edu.byui.csee.stevesscriptures.dataaccess.DaoFactory;
import edu.byui.csee.stevesscriptures.dataaccess.MysqlScriptureDao;
import edu.byui.csee.stevesscriptures.dataaccess.ScriptureDao;
import java.util.List;

/**
 *
 * @author sburton
 */
public class DatabaseHandler implements ScriptureHandler {

    @Override
    public List<Scripture> getScriptures() {
        ScriptureDao dao = new DaoFactory().getScriptureDao();
        return dao.listAll();
        
    }
    
}
