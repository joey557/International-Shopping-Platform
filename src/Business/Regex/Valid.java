/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author peifang
 */
public class Valid {
    private static Valid vald;
    
    public static Valid getInstance(){
        if(vald==null){
            vald=new Valid();
        }
        return vald;
    } 
    
    public boolean validNum(String numbr){
        Pattern p = Pattern.compile("^[0-9]*$");
        Matcher m = p.matcher(numbr);
        if (m.find()) {
            return true;
        }else{
            return false;
        }
    }
    public boolean validName(String name){
        Pattern p = Pattern.compile("[a-zA-Z0-9]+");
        Matcher m = p.matcher(name);
        if(m.find()){
            return false;
        }else{
            //true data
            return true;
        }
    }
    public boolean validPassword(String password){
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        Matcher m = p.matcher(password);
        if(m.find()){
            return true;
        }else{
            return false;
        }
    }
    public boolean validEmail(String email){
        Pattern p = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher m = p.matcher(email);
        if(m.find()){
            return true;
        }else{
            return false;
        }
    }
}
