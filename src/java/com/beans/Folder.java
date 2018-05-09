/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import java.util.List;

/**
 *
 * @author MED
 */
public class Folder extends Item{
    private List<Item> items;
    public Folder(String name, String type, String path, List<Item> items) {
        super(name, type, path);
        this.items = items;
    }
}
