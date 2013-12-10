/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wp.issue18;

import java.io.Serializable;

/**
 *
 * @author Paul Web
 * @e-mail paulandweb@gmail.com
 */
public class User implements Serializable {
    private String _name;

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }
    
}
