/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.visit;

/* Ангел

*/

import java.sql.Date;

//коментар
//
//


/**
 *
 * @author Todor
 */
public class VTCities {
    
    

    private int id = 0;
    private String name = "";
    private int id_country = 0;
    private String id_country_name = "";
    private Date timeins = new Date( 0 );
    
    public static final String GET_LST = "vtCitiesGetList";

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

    public int getId_country(){
        return id_country;
    }

    public void setId_country( int id_country ){
        this.id_country = id_country;
    }

    public String getId_country_name(){
        return id_country_name;
    }

    public void setId_country_name( String id_country_name ){
        this.id_country_name = id_country_name;
    }

    public Date getTimeins(){
        return timeins;
    }

    public void setTimeins( Date timeins ){
        this.timeins = timeins;
    }

}
