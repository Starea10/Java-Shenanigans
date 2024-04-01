public class LocalandGlobalVariable {

int x = 10; //This line will not work as the variable is located outside the method. (Global Variable)
    public static void sayHello(){
        int x = 10; //This however, will work as this is considered as the local variable.
        System.out.println(x);
    }
    public static void main(String[] args) {
        sayHello();
    }
