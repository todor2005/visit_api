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
public class VTUser {

    private int id = 0;
    private String firstName = "";
    private String lastName = "";
    private String pass = "";
    private String email = "";
    private int gender = 0;
    private int id_city = 0;
    private String id_city_name = "";
    private int id_country = 0;
    private String id_country_name = "";
    private int age = 0;
    private int id_secret_question = 0;
    private String id_secret_question_name = "";
    private String answer = "";
    private Date timeins = new Date( 0 );
    private Date timemod = new Date( 0 );
    
    public static final String GET_LST = "vtUser";
    public static final String GET_AddDelMod = "vtAddDelModUser";

    /**
     * Creates empty user
     */
    public VTUser(){
    }

    public String getPass(){
        return pass;
    }

    public void setPass( String pass ){
        this.pass = pass;
    }

    public int getId_city(){
        return id_city;
    }

    public void setId_city( int id_city ){
        this.id_city = id_city;
    }

    public String getId_city_name(){
        return id_city_name;
    }

    public void setId_city_name( String id_city_name ){
        this.id_city_name = id_city_name;
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

    public int getId_secret_question(){
        return id_secret_question;
    }

    public void setId_secret_question( int id_secret_question ){
        this.id_secret_question = id_secret_question;
    }

    public String getId_secret_question_name(){
        return id_secret_question_name;
    }

    public void setId_secret_question_name( String id_secret_question_name ){
        this.id_secret_question_name = id_secret_question_name;
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

    public int getAge(){
        return age;
    }

    public void setAge( int age ){
        this.age = age;
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
