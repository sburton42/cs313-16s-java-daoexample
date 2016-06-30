/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.csee.stevesscriptures.dataaccess;

import edu.byui.csee.stevesscriptures.core.Scripture;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author sburton
 */
public class MysqlScriptureDao implements ScriptureDao {

    @Override
    public boolean addNewScripture(Scripture s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Scripture getScripture(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Scripture getScripture(String Book, int chapter, int verse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Scripture> searchScriptures(String searchQuery) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Scripture> listAll() {
        List<Scripture> list = new ArrayList<>();
        
        // DB Connection Stuff
        Connection conn = getDbConnection();
        
        Statement statement = conn.createStatement();
        String sql = "SELECT id, book, chapter, verse FROM scripture";

        ResultSet results = statement.execute(sql);
        
        while (results.next()) {
            int id = results.getInt("id");
            String book = results.getString("book");
            int chapter = results.getInt("chapter");
            int verse = results.getInt("verse");
        
            list.add(new Scripture(book, chapter, verse));
        }
        
        return list;
        
    }

    @Override
    public boolean updateScripture(Scripture s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteScripture(Scripture s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Connection getDbConnection() {
        return null;
    }
}
