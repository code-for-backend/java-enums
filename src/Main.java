import examples.Coffee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Coffee small=Coffee.SMALL;
        System.out.println(small);
        Coffee large=Coffee.valueOf("LARGE");//throws IllegalArgException if an instance
        //does not exist
        System.out.println(large.getName());//null
        Coffee[] values=Coffee.values();
        for(Coffee coffee:values)
            System.out.println(coffee.getName());






    }
}