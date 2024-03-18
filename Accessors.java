public class Accessors {

    private String name;
    private int age;      
    private String gender;

public Accessors (String name, int age, String gender){
this.name = name;
this.age = age;
this.gender = gender; 
}

public String getName(){
    return name;
}

public int getAge(){
    return age;
}

public String getGender(){
    return gender;
}


 public static void main (String args[]){
     Accessors p1 = new Accessors ("John", 18, "Male" );
     System.out.println("Name:" +  p1.getName() + " Age:" + p1.getAge() + " Gender:" + p1.getGender());
 }

}
