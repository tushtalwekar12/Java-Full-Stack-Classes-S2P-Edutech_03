// Wrapper class :  A wrapper class in Java is a class that encapsulates a primitive data type, allowing it to be treated as an object.
public class Example2{
    public static void main(String[] args) {
        // Creating an Integer object
        Integer i = 10;
        System.out.println(i.getClass());
        // Creating a Double object
        Double d = 20.5;
        System.out.println(d.getClass());
        // Creating a Character object
        Character c = 'A';
        System.out.println(c.getClass());
        // Creating a Boolean object
        Boolean b = true;
        System.out.println(b.getClass());
        // Creating a Byte object
        Byte by = 10;
        System.out.println(by.getClass());
        // Creating a Short object
        Short sh = 20;
        System.out.println(sh.getClass());
        // Creating a Long object
        Long l = 30L;
        System.out.println(l.getClass());
        // Creating a Float object
        Float f = 40.5f;
        System.out.println(f.getClass());

        //auto boxing
        Integer x = 10; // Integer is a wrapper class for int primitive data type
        System.out.println(i); // prints 10

        //unboxing
        int j = x; // int is a primitive data type, i is an Integer object
        System.out.println(j); // prints 10
    }
}