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
public class VTCitiesQ {

    public ArrayList<Integer> getId(){
        return id;
    }

    public void setId( ArrayList<Integer> id ){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public int getFlag_name(){
        return flag_name;
    }

    public void setFlag_name( int flag_name ){
        this.flag_name = flag_name;
    }

    private ArrayList<Integer> id = new ArrayList<>();
    private String name = "";
    private int flag_name = 0;

}
