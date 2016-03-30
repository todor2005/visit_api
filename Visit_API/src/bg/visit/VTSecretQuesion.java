/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.visit;

/**
 *
 * @author Todor
 */
public class VTSecretQuesion {
    
    private int id = 0;
    private char code = ' ';
    private String question_bg = "";

    public int getId(){
        return id;
    }

    public void setId( int id ){
        this.id = id;
    }

    public char getCode(){
        return code;
    }

    public void setCode( char code ){
        this.code = code;
    }

    public String getQuestion_bg(){
        return question_bg;
    }

    public void setQuestion_bg( String question_bg ){
        this.question_bg = question_bg;
    }
    
    
    
    
    public static final String GET_LST = "vtCitiesGetList";
}
