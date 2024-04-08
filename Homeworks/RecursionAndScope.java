package greetings;

public class Greetings {

    //Instance Scope
    String name;
    
    //Class Scope (Global Scope)
    static int divisible;
    
    //Recursion
    public void greetings(int amt){ //Method Parameters Scope
        
        if(amt <= 0){
            System.out.println("KABOOM! I'm done.");
        }
        else if(amt % divisible == 0){
            System.out.println("Hi " + name + "! And " + amt + " is divisible by " + divisible + ". Very cool, eh?");
            greetings(amt - 1);
        }
        else{
            System.out.println("Hello " + name + "!");
            greetings(amt - 1);
        }
    }
    
    
    public static void main(String[] args) {
        Greetings person1 = new Greetings();
        
        person1.name = "Starea";
        divisible = 4;
        
        //Local Scope
        int amtRepeat = 20;
        person1.greetings(amtRepeat);
        
        //Block Scope
        {
            divisible = 2;
            System.out.println("");
            
            Greetings person2 = new Greetings();
            person2.name = "Aerats";
            
            person2.greetings(amtRepeat);
        }
        
    }
    
}
