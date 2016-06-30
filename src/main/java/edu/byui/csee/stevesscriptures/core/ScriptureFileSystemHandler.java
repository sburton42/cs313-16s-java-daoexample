/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.csee.stevesscriptures.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sburton
 */
public class ScriptureFileSystemHandler implements ScriptureHandler {
    @Override
    public List<Scripture> getScriptures() {
        List<Scripture> scriptures = new ArrayList<>();

        scriptures.add(new Scripture("D&amp;C", 11, 20));
        scriptures.add(new Scripture("Mosiah", 3, 17));
  
        return scriptures;
    }
}
