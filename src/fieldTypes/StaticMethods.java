package fieldTypes;

public class StaticMethods {

    public  int num = 10;

    public static int count = 5;

    public static void displayMessage (String message){
        System.out.println("message = " + message);
        System.out.println(count);
    }

    public void instanceMethod(){
        System.out.println("Instance method called");
        System.out.println(num);
        System.out.println(count);
        displayMessage("hello from instance method");


    }

}
