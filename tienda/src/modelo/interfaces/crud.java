/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.interfaces;

import java.util.List;

/**
 *
 * @author David
 */
public interface crud <Cualquiercosa> {
    public boolean create(Cualquiercosa c);
    public boolean delete(Object key);
    public boolean update(Cualquiercosa c, Object a);
    public Cualquiercosa read(Object key);
    public Cualquiercosa read(Object key,Object key2);
    public List<Cualquiercosa> readAll();
}
