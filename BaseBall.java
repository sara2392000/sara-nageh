/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author ATD
 */
public abstract class BaseBall extends Ball  {

    public BaseBall(String brandName) {
        super(brandName);
    }
    
    
    @Override
    public  void toss(){
    
     System.out.println("function toss in class BaseBall");}
        
        
   

}