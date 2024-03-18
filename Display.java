public class Display {
 private int age;
 private String name;
 
 public Display(String name, int age){
     this.name = name;
     this.age = age;
     }
 
    public void displayInfo(){
        System.out.println("Name:" + name + " Age:" +  age);
    }
    
    public static void main(String args[]){
      Display person1 = new Display ("Alice", 19);
      person1.displayInfo();
        Display person2 = new Display ("John Doe",18);
      person2.displayInfo();
        Display person3 = new Display ("Dohn Joe",18);
      person3.displayInfo();
    }
}
