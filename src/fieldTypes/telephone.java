package fieldTypes;

public class telephone {

    public String  number;

    public static int  quantity;
    public static double total;

    static {
        quantity =250;
        total = 15658.92;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return this.number;
    }

    public static void main(String[] args) {
        telephone telephone1 = new telephone();

        System.out.println(telephone1.total);

        telephone1.setNumber("45261547");
        System.out.println("telephone number" + telephone1.getNumber());

        System.out.println("Telephone.total = " + telephone1.total);
    }
}


/*

/*
    Write the definition of a class Telephone.
The class has no constructors, one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.
     */

