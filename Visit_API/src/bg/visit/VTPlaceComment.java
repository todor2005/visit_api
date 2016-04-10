/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.visit;

import java.sql.Date;

/**
 *
 * @author Todor
 */
public class VTPlaceComment {
    


    private int id = 0;
    private String id_place = "";
    private int id_user = 0;
    private String id_user_name = "";
    private String comment = "";
    
    public static final String GET_LST = "vtPlaceComment";
    public static final String GET_AddDelMod = "vtAddDelModPlaceComment";

    public int getId(){
        return id;
    }

    public void setId( int id ){
        this.id = id;
    }

    public String getId_place(){
        return id_place;
    }

    public void setId_place( String id_place ){
        this.id_place = id_place;
    }

    public int getId_user(){
        return id_user;
    }

    public void setId_user( int id_user ){
        this.id_user = id_user;
    }

    public String getId_user_name(){
        return id_user_name;
    }

    public void setId_user_name( String id_user_name ){
        this.id_user_name = id_user_name;
    }

    public String getComment(){
        return comment;
    }

    public void setComment( String comment ){
        this.comment = comment;
    }
    
    

}
