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
class Vald {
    private static Vald vald;
    
    public static Vald getInstance(){
        if(vald==null){
            vald=new Vald();
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
}
