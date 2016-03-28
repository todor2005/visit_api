/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.visit;

import java.sql.Date;

/**
 *
 * @author Todor
 */
public class VTCountries {

    private int id = 0;
    private String name = "";
    private Date timeins = new Date( 0 );
    
    public static final String GET_LST = "vtCountryGetList";

    public int getId(){
        return id;
    }

    public void setId( int id ){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public Date getTimeins(){
        return timeins;
    }

    public void setTimeins( Date timeins ){
        this.timeins = timeins;
    }


}
