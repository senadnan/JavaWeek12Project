package fieldTypes;

public class LocalvsInstance {


    public  int a = 10;

    public void showDifference (){
        int a = 5;
        System.out.println(a);
    }
    public void showDifference(int number){
        int a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalvsInstance obj = new LocalvsInstance(); // default constructor even if we don't create one

        System.out.println("---coming from instance variable----");
        System.out.println(obj.a);

        obj.a = 1;
        System.out.println(obj.a);

        obj.showDifference();
    }


    }

