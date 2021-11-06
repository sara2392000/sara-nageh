
package pkginterface;

public  abstract class footBall extends Ball {
    
    public footBall(String brandName) {
        super(brandName);
    }
    
    @Override
    public  void toss(){
         System.out.println("function toss  in class footBall");
    }
    
    @Override
     public void bounce(){
          System.out.println("function bounce in class footBall");
    }
     
    }
    

