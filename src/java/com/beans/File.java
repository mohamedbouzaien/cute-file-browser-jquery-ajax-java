/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
 * @author MED
 */
public class File extends Item{
    private long size;

    public File(String name, String type, String path,long size) {
        super(name, type, path);
        this.size = size;
    }
    
}
