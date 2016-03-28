/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.visit;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Todor
 */
public class VTUser {

    private int id = 0;
    private String firstName = "";
    private String lastName = "";
    private String pass = "";
    private String email = "";
    private int gender = 0;
    private int id_city = 0;
    private int id_country = 0;
    private int age = 0;
    private int id_secret_question = 0;
    private String answer = "";
    private Date timeins = new Date( 0 );
    private Date timemod = new Date( 0 );

    /**
     * Creates empty user
     */
    public VTUser(){
    }

    public VTUser( int id, String firstName, String lastName, String email, String pass, int id_city, int id_country, int gender, int age, int id_secret_question, String answer, Date timeins, Date timemod ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pass = pass;
        this.id_city = id_city;
        this.id_country = id_country;
        this.gender = gender;
        this.age = age;
        this.id_secret_question = id_secret_question;
        this.answer = answer;
        this.timeins = timeins;
        this.timemod = timemod;
    }

    public VTUser( VTUser user ){
        this( user.id, user.firstName, user.lastName, user.email, user.pass, user.id_city, user.id_country, user.gender, user.age, user.id_secret_question, user.answer, user.timeins, user.timemod );
    }

    public int getId(){
        return id;
    }

    public void setId( int id ){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName( String firstName ){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName( String lastName ){
        this.lastName = lastName;
    }

    public String getPassword(){
        return pass;
    }

    public void setPassword( String password ){
        this.pass = password;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail( String email ){
        this.email = email;
    }

    public int getGender(){
        return gender;
    }

    public void setGender( int gender ){
        this.gender = gender;
    }

    public int getIdCity(){
        return id_city;
    }

    public void setIdCity( int id_city ){
        this.id_city = id_city;
    }

    public int getIdCountry(){
        return id_country;
    }

    public void setIdCoutry( int id_country ){
        this.id_city = id_country;
    }

    public int getAge(){
        return age;
    }

    public void setAge( int age ){
        this.age = age;
    }

    public int getIdSecretQuestion(){
        return id_secret_question;
    }

    public void setIdSecretQuestion( int id_secret_question ){
        this.id_secret_question = id_secret_question;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer( String answer ){
        this.answer = answer;
    }

    public Date getTimeins(){
        return timeins;
    }

    public void setTimeins( Date timeins ){
        this.timeins = timeins;
    }

    public Date getTimemod(){
        return timemod;
    }

    public void setTimemod( Date timemod ){
        this.timemod = timemod;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append( "ID:" ).append( getId() );
        sb.append( " Name : " ).append( getFirstName() ).append( " " ).append( getLastName() );
        return sb.toString();
    }
}
