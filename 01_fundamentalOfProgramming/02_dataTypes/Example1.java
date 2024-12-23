// Data Type Example - primitive
public class Example1{
    public static void main(String args []){
        // primitive dataTypes 
        boolean isAdult = true ;   //Boolean returns true or false - size-1bit
        System.out.println("Boolean : "+isAdult);
        //System.out.println(isAdult.getClass()); //getClass() to determine the type of an object

        char value1 = 'T'; //size - 2 byte or 16 bits
        System.out.println("Char :"+value1);

        int age = 22; // size - 4 bytes or 32 bits
        System.out.println("int :"+ age); //a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647

        float pi = 3.145f;  //4 bytes 
        System.out.println("float :"+pi);

        double percentage = 98.122222; //size -8 bytes 
        System.out.println("double :"+percentage);

        long value2 = 298L; //size-8 byte or 64 bit 
        System.out.println("long :"+value2);  //a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807.

        byte value3 = 33; //minimum value of -128 and a maximum value of 127.
        System.out.println("byte :"+value3); //size-1 byte or 8 bits

        short value4 = 10; //a minimum value of -32,768 and a maximum value of 32,767
        System.out.println("short :"+value4); //size-2 byte or 16 bits
    }
}