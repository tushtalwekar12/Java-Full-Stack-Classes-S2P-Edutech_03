public class floatDataTypes{
    public static void main(String[] args) {
        float f = 10.5f; //having decimal with f at last of value 
        System.out.println("float value: "+f);
        System.out.println(f.getClass()); // error for that  : Use the Float wrapper class to get the class type

        //System.out.println(Float.valueOf(f).getClass());
        //Wrapper Classes: Use Float for float to access methods like getClass()
    }
}
/* Use float or double? : the precision of a floating point value indicates how
many digits the value can have after the decimal point 
The precision of float is only six or seven decimal digits , while
double variable have precision of about 15 digits 
therefore it is safer to use double for most calculation.

*/