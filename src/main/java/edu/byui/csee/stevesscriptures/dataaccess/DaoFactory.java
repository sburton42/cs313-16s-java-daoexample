/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.csee.stevesscriptures.dataaccess;

/**
 *
 * @author sburton
 */
public class DaoFactory {
    public ScriptureDao getScriptureDao() {
        return new MysqlScriptureDao();
    }
}
