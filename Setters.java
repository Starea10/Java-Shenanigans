public class Setters {

    private String name;
    
    public Setters (String name){
     this.name = name;
    }
    
    public String getName(){ 
        return name;
    }
    
    public void setName (String newName){
       name = newName;
    }
  
    public static void main (String args[]){
        Setters p1 = new Setters ("Alice");
        System.out.println("Original Name:" + p1.getName() );
      
        p1.setName("Jane");
        System.out.println("Modified Name:" + p1.getName());
    }
    
}
