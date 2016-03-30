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
public class VTSecretQuesionQ {
    
        
    private ArrayList<Integer> id = new ArrayList<>();
    private char code = ' ';
    private int flag_code = 0;

    public ArrayList<Integer> getId(){
        return id;
    }

    public void setId( ArrayList<Integer> id ){
        this.id = id;
    }

    public char getCode(){
        return code;
    }

    public void setCode( char code ){
        this.code = code;
    }

    public int getFlag_code(){
        return flag_code;
    }

    public void setFlag_code( int flag_code ){
        this.flag_code = flag_code;
    }
}
