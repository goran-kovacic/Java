/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import com.github.javafaker.Faker;

/**
 *
 * @author AMD
 */
public class Start {

    public static void main(String[] args) {
        
        new LjubavniKalkulator().setVisible(true);
        

        try {
            System.out.println(Integer.valueOf("5,1"));
        } catch (Exception e) {
            System.out.println("exc");
                   
        }
 
        System.out.println(74/60);
        
        System.out.println(74%60);
         
        
        
        
    }
    
    
}
