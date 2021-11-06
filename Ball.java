/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author ATD
 */
public abstract  class Ball implements Tossable {
    
    private String brandName ;
    public Ball(String brandName){
    
    this.brandName=brandName;
   
    }

    public String getBrandName() {
        return brandName;
    }
    public void bounce(){
        System.out.println("function bounce in class Ball");
    }

   
    }

