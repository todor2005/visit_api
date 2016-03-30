/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.visit;

import java.util.ArrayList;

/**
 *
 * @author Todor
 */
public class VTAddDelMod {
    
    private ArrayList add = new ArrayList();
    private ArrayList mod = new ArrayList();
    private ArrayList del = new ArrayList();

    public ArrayList getAdd(){
        return add;
    }

    public void setAdd( ArrayList add ){
        this.add = add;
    }

    public ArrayList getMod(){
        return mod;
    }

    public void setMod( ArrayList mod ){
        this.mod = mod;
    }

    public ArrayList getDel(){
        return del;
    }

    public void setDel( ArrayList del ){
        this.del = del;
    }
    
    
    
    
}
